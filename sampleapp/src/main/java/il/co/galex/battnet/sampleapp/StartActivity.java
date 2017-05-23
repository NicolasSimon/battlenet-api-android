package il.co.galex.battnet.sampleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import il.co.galex.battlenet.common.model.Region;
import il.co.galex.battlenet.oauth.activity.OauthActivity;
import il.co.galex.battlenet.oauth.model.AccessToken;
import il.co.galex.battlenet.oauth.utils.OauthSharedPreferences;

public class StartActivity extends AppCompatActivity {

    private static final String TAG = StartActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AccessToken accessToken = OauthSharedPreferences.getAccessToken(this);
        if (accessToken != null && !accessToken.hasExpired()) {
            MainActivity.startActivity(this);

        } else {

            setContentView(R.layout.activity_start);
            Button login = (Button) findViewById(R.id.login);
            login.setOnClickListener(view -> {

                OauthActivity.startActivity(this, Region.EU, MainActivity.class);
            });
        }
    }
}
