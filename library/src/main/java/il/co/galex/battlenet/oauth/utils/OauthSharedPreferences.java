package il.co.galex.battlenet.oauth.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * @author Alexander Gherschon
 */

public class OauthSharedPreferences {

    private static final String AUTHORIZATION_CODE = "AUTHORIZATION_CODE";
    private static String SHARED_PREFERENCES = "OAUTH_SHARED_PREFERENCES";


    public static void setAuthorizationCode(@NonNull Context context, @NonNull String authorizationCode) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE);
        sharedPreferences.edit().putString(AUTHORIZATION_CODE, authorizationCode).apply();
    }

    public static @Nullable String getAuthorizationCode(@NonNull Context context) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE);
        return sharedPreferences.getString(AUTHORIZATION_CODE, null);
    }
}
