package il.co.galex.battnet.sampleapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import il.co.galex.battlenet.common.model.Region;
import il.co.galex.battlenet.oauth.activity.OauthActivity;
import il.co.galex.battlenet.oauth.model.AccessToken;
import il.co.galex.battlenet.oauth.model.CheckToken;
import il.co.galex.battlenet.oauth.network.OauthAPI;
import il.co.galex.battlenet.oauth.utils.Constants;
import il.co.galex.battlenet.oauth.utils.OauthSharedPreferences;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StartActivity extends AppCompatActivity {

    public static final int REQUEST_CODE = 1;
    private static final String TAG = StartActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Button login = (Button) findViewById(R.id.login);
        login.setOnClickListener(view -> {

            OauthActivity.startActivityForResult(this, REQUEST_CODE);
        });

        OauthAPI.checkToken(this, Region.EU, new Callback<CheckToken>() {
            @Override
            public void onResponse(Call<CheckToken> call, Response<CheckToken> response) {

                Log.d(TAG, "onResponse() called with: call = [" + call + "], response = [" + response + "]");
            }

            @Override
            public void onFailure(Call<CheckToken> call, Throwable t) {

                Log.d(TAG, "onFailure() called with: call = [" + call + "], t = [" + t + "]");
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Log.d(TAG, "onActivityResult() called with: requestCode = [" + requestCode + "], resultCode = [" + resultCode + "], data = [" + data + "]");

        if (requestCode == REQUEST_CODE) {
           switch (resultCode) {
               case Activity.RESULT_OK: {

                   Log.d(TAG, "onActivityResult() saved authorization code = " + OauthSharedPreferences.getAuthorizationCode(this));

                   OauthAPI.getAccessToken(this, Region.EU, Constants.REDIRECT_URI, "", new Callback<AccessToken>() {
                       @Override
                       public void onResponse(Call<AccessToken> call, Response<AccessToken> response) {

                           Log.d(TAG, "onActivityResult onResponse() called with: call = [" + call + "], response = [" + response + "]");

                           OauthSharedPreferences.setAccessToken(StartActivity.this, response.body());
                       }

                       @Override
                       public void onFailure(Call<AccessToken> call, Throwable t) {

                           Log.d(TAG, "onActivityResult onFailure() called with: call = [" + call + "], t = [" + t + "]");
                       }
                   });

                   break;
               }

               case Constants.ACTIVITY_RESULT_ERROR: {



                   break;
               }
           }
        }
    }
}
