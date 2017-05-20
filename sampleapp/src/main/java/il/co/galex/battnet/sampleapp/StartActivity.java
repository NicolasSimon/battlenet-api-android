package il.co.galex.battnet.sampleapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import il.co.galex.battlenet.oauth.activity.OauthActivity;
import il.co.galex.battlenet.oauth.utils.Constants;
import il.co.galex.battlenet.oauth.utils.OauthSharedPreferences;

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
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Log.d(TAG, "onActivityResult() called with: requestCode = [" + requestCode + "], resultCode = [" + resultCode + "], data = [" + data + "]");

        if (requestCode == REQUEST_CODE) {
           switch (resultCode) {
               case Activity.RESULT_OK: {

                   Log.d(TAG, "onActivityResult() saved authorization code = " + OauthSharedPreferences.getAuthorizationCode(this));

                   break;
               }

               case Constants.ACTIVITY_RESULT_ERROR: {



                   break;
               }
           }
        }
    }
}
