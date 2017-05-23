package il.co.galex.battlenet.oauth.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

import il.co.galex.battlenet.common.model.Region;
import il.co.galex.battlenet.oauth.model.AccessToken;
import il.co.galex.battlenet.oauth.model.CheckToken;
import il.co.galex.battlenet.oauth.network.OauthAPI;
import il.co.galex.battlenet.oauth.utils.Constants;
import il.co.galex.battlenet.oauth.utils.OauthSharedPreferences;
import il.co.galex.battlenet.oauth.utils.UrlUtils;
import il.co.galex.bnetapi.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OauthActivity extends AppCompatActivity {

    private static final String TAG = OauthActivity.class.getSimpleName();
    private static final String ACTIVITY_CLASS_EXTRA = "ACTIVITY_CLASS_EXTRA";
    private static final String REGION_EXTRA = "REGION_EXTRA";

    private ProgressBar progressBar;
    private WebView webView;

    public static void startActivity(Context context, Region region, Class<? extends Activity> activityClass) {

        Intent intent = new Intent(context, OauthActivity.class);
        intent.putExtra(ACTIVITY_CLASS_EXTRA, activityClass);
        intent.putExtra(REGION_EXTRA, region);
        context.startActivity(intent);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.battlenet_lib_activity_oauth);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        progressBar = (ProgressBar) findViewById(R.id.progress_bar);
        webView = (WebView) findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setBackgroundColor(ContextCompat.getColor(this, android.R.color.black));

        final Region region = (Region) getIntent().getSerializableExtra(REGION_EXTRA);

        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap bitmap) {
            }

            @Override
            public void onPageFinished(final WebView view, final String url) {

                Log.d(TAG, "onPageFinished() called with: url = [" + url + "]");

                if (url.startsWith(Constants.REDIRECT_URI)) {

                    webView.setVisibility(View.INVISIBLE);

                    Uri uri = Uri.parse(url);
                    String code = uri.getQueryParameter(Constants.CODE);
                    //OauthSharedPreferences.setAuthorizationCode(OauthActivity.this, code);

                    if (!TextUtils.isEmpty(code)) {

                        OauthAPI.getAccessToken(OauthActivity.this, region, Constants.REDIRECT_URI, "", code, new Callback<AccessToken>() {
                            @Override
                            public void onResponse(Call<AccessToken> call, Response<AccessToken> response) {

                                Log.d(TAG, "onResponse() called with: call = [" + call + "], response = [" + response + "]");

                                AccessToken accessToken = response.body();
                                accessToken.setCreatedAt(System.currentTimeMillis());

                                OauthSharedPreferences.setAccessToken(OauthActivity.this, accessToken);
                                goToActivityClass();
                            }

                            @Override
                            public void onFailure(Call<AccessToken> call, Throwable t) {

                                Log.d(TAG, "onFailure() called with: call = [" + call + "], t = [" + t + "]");
                                // TODO something more meaningful here, 3rd error screen?
                                Snackbar.make(getWindow().getDecorView(), "Did not manage to login...", Snackbar.LENGTH_INDEFINITE).show();
                                showProgressBar();
                            }
                        });

                    } else {

                        //String error = uri.getQueryParameter(Constants.ERROR);
                        String errorDescription = uri.getQueryParameter(Constants.ERROR_DESCRIPTION);

                        Snackbar.make(getWindow().getDecorView(), errorDescription, Snackbar.LENGTH_INDEFINITE).show();
                        showProgressBar();
                    }
                }
            }
        });

        // Step 1 : check that the token might still be valid

        AccessToken accessToken = OauthSharedPreferences.getAccessToken(this);
        if (accessToken != null && !accessToken.hasExpired()) {

            OauthAPI.checkToken(this, region, new Callback<CheckToken>() {
                @Override
                public void onResponse(Call<CheckToken> call, Response<CheckToken> response) {

                    goToActivityClass();
                }

                @Override
                public void onFailure(Call<CheckToken> call, Throwable t) {

                    showWebView();
                }
            });
        } else {
            showWebView();
        }
    }

    private void showWebView() {

        progressBar.setVisibility(View.GONE);
        webView.setVisibility(View.VISIBLE);

        String url = UrlUtils.getAuthorizationUrl(Region.EU, getString(R.string.battlenet_lib_api_key), Constants.REDIRECT_URI);
        // load the page with the redirect uri
        webView.loadUrl(url);
    }

    private void showProgressBar() {

        webView.setVisibility(View.GONE);
        progressBar.setVisibility(View.VISIBLE);
    }

    @SuppressWarnings("unchecked")
    private void goToActivityClass() {

        Class<? extends Activity> activityClass = (Class<? extends Activity>) getIntent().getSerializableExtra(ACTIVITY_CLASS_EXTRA);
        Intent intent = new Intent(this, activityClass);
        startActivity(intent);
    }
}
