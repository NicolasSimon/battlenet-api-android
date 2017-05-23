package il.co.galex.battlenet.oauth.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.google.gson.Gson;

import il.co.galex.battlenet.oauth.model.AccessToken;

/**
 * Keeps the Access Token object into shared preferences
 * @author Alexander Gherschon
 */

public class OauthSharedPreferences {

    private static String SHARED_PREFERENCES = "OAUTH_SHARED_PREFERENCES";
    private static final String ACCESS_TOKEN = "ACCESS_TOKEN";

    private static final Gson GSON = new Gson();

    public static void setAccessToken(@NonNull Context context, @NonNull AccessToken accessToken) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE);
        sharedPreferences.edit().putString(ACCESS_TOKEN, GSON.toJson(accessToken)).apply();
    }

    public static @Nullable AccessToken getAccessToken(@NonNull Context context) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE);
        String json = sharedPreferences.getString(ACCESS_TOKEN, null);
        return GSON.fromJson(json, AccessToken.class);
    }

    public static void clearAccessToken(@NonNull Context context) {

        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES, Context.MODE_PRIVATE);
        sharedPreferences.edit().remove(ACCESS_TOKEN).apply();
    }
}
