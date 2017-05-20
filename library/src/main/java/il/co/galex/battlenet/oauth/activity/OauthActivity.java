package il.co.galex.battlenet.oauth.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import il.co.galex.battlenet.common.model.Region;
import il.co.galex.battlenet.oauth.utils.Constants;
import il.co.galex.battlenet.oauth.utils.OauthSharedPreferences;
import il.co.galex.battlenet.oauth.utils.UrlUtils;
import il.co.galex.bnetapi.R;

public class OauthActivity extends AppCompatActivity {

    private static final String TAG = OauthActivity.class.getSimpleName();

    @SuppressWarnings("unused")
    public static void startActivityForResult(Activity activity, int requestCode) {

        Intent intent = new Intent(activity, OauthActivity.class);
        activity.startActivityForResult(intent, requestCode);
    }

    @SuppressWarnings("unused")
    public static void startActivityForResult(Fragment fragment, int requestCode) {

        Intent intent = new Intent(fragment.getContext(), OauthActivity.class);
        fragment.startActivityForResult(intent, requestCode);
    }

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.battlenet_lib_activity_oauth);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView webView = (WebView) findViewById(R.id.web_view);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setBackgroundColor(ContextCompat.getColor(this, android.R.color.black));

        String url = UrlUtils.getAuthorizationUrl(Region.EU, getString(R.string.battlenet_lib_api_key), Constants.REDIRECT_URI);

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
                    // here we should extract the authorization code and use it to get a first token probably ?
                    String code = uri.getQueryParameter(Constants.CODE);

                    OauthSharedPreferences.setAuthorizationCode(OauthActivity.this, code);

                    //Log.d(TAG, "onPageFinished code = " + code);

                    if (!TextUtils.isEmpty(code)) {

                        //Intent data = new Intent();
                        //data.putExtra(Constants.EXTRA_AUTHORIZATION_CODE, code);
                        setResult(Activity.RESULT_OK);

                    } else {
                        String error = uri.getQueryParameter(Constants.ERROR);
                        String errorDescription = uri.getQueryParameter(Constants.ERROR_DESCRIPTION);

                        Intent data = new Intent();
                        data.putExtra(Constants.EXTRA_ERROR, error);
                        data.putExtra(Constants.EXTRA_ERROR_DESCRIPTION, errorDescription);
                        setResult(Constants.ACTIVITY_RESULT_ERROR, data);
                    }

                    finish();
                }
            }
        });

        // we can't do this, it appears an authorization code can be used only once ???

        /*// if a code was already requested, do not request another one
        if(TextUtils.isEmpty(OauthSharedPreferences.getAuthorizationCode(this))) {
            webView.loadUrl(url);
        } else {
            setResult(Activity.RESULT_OK);
            finish();
        }*/

        webView.loadUrl(url);
    }
}
