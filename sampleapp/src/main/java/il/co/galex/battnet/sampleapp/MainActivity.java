package il.co.galex.battnet.sampleapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import il.co.galex.battlenet.api.d3.model.account.User;
import il.co.galex.battlenet.api.d3.network.CommunityOAuthProfileAPI;
import il.co.galex.battlenet.common.model.Region;
import il.co.galex.battlenet.oauth.model.AccessToken;
import il.co.galex.battlenet.oauth.utils.OauthSharedPreferences;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    public static void startActivity(Context context) {

        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button battleTag = (Button) findViewById(R.id.battletag);
        battleTag.setOnClickListener(v -> {

            AccessToken accessToken = OauthSharedPreferences.getAccessToken(MainActivity.this);
            if (accessToken != null) {
                CommunityOAuthProfileAPI.getUser(this, Region.EU, accessToken.getValue(), new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {

                        Snackbar.make(getWindow().getDecorView(), response.body().toString(), Snackbar.LENGTH_LONG).show();
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {

                        Snackbar.make(getWindow().getDecorView(), t.getLocalizedMessage(), Snackbar.LENGTH_LONG).show();
                    }
                });
            }
        });

        Button logout = (Button) findViewById(R.id.logout);
        logout.setOnClickListener(v -> {
            OauthSharedPreferences.clearAccessToken(this);
            // send you back to the Start Activity with clear top
            Intent intent = new Intent(MainActivity.this, StartActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        });
    }
}
