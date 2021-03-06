package il.co.galex.battlenet.oauth.network;

import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import il.co.galex.battlenet.common.model.Region;
import il.co.galex.battlenet.oauth.model.AccessToken;
import il.co.galex.battlenet.oauth.model.CheckToken;
import il.co.galex.battlenet.oauth.utils.Constants;
import il.co.galex.battlenet.oauth.utils.OauthRetrofitUtils;
import il.co.galex.battlenet.oauth.utils.OauthSharedPreferences;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Oauth related API calls
 * @author Alexander Gherschon
 */

@SuppressWarnings("unused")
public final class OauthAPI {

    private OauthAPI() {

    }

    @WorkerThread
    public static AccessToken getAccessToken(@NonNull Context context, @NonNull Region region, @NonNull String redirectUri, @NonNull String scope, @NonNull String authorizationCode) {

        if (!TextUtils.isEmpty(authorizationCode)) {

            Map<String, String> params = new HashMap<>();
            params.put("redirect_uri", redirectUri);
            params.put("scope", scope);
            params.put("grant_type", "authorization_code");
            params.put(Constants.CODE, authorizationCode);

            Retrofit retrofit = OauthRetrofitUtils.getInstance(context, region);
            OauthService oauthService = retrofit.create(OauthService.class);

            Call<AccessToken> call = oauthService.getAccessToken(params);

            try {
                Response<AccessToken> response = call.execute();
                if (response.code() == 200) return response.body();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;


        } else
            throw new IllegalArgumentException("getAccessToken called without having an authorization code");
    }

    @MainThread
    public static void getAccessToken(@NonNull Context context, @NonNull Region region, @NonNull String redirectUri, @NonNull String scope, @NonNull String authorizationCode, @NonNull Callback<AccessToken> callback) {

        if (!TextUtils.isEmpty(authorizationCode)) {

            Map<String, String> params = new HashMap<>();
            params.put("redirect_uri", redirectUri);
            //params.put("scope", scope);
            params.put("grant_type", "authorization_code");
            params.put(Constants.CODE, authorizationCode);

            Retrofit retrofit = OauthRetrofitUtils.getInstance(context, region);
            OauthService oauthService = retrofit.create(OauthService.class);

            Call<AccessToken> call = oauthService.getAccessToken(params);
            call.enqueue(callback);

        } else
            throw new IllegalArgumentException("getAccessToken called without having an authorization code");
    }

    @WorkerThread
    public static CheckToken checkToken(@NonNull Context context, @NonNull Region region) {

        AccessToken accessToken = OauthSharedPreferences.getAccessToken(context);
        if (accessToken != null) {

            Retrofit retrofit = OauthRetrofitUtils.getInstance(context, region);
            OauthService oauthService = retrofit.create(OauthService.class);

            Call<CheckToken> call = oauthService.checkToken(accessToken.getValue());

            try {
                Response<CheckToken> response = call.execute();
                if (response.code() == 200) return response.body();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;

        } else
            throw new IllegalArgumentException("No access token were found, use getAccessToken() first");
    }

    @MainThread
    public static void checkToken(@NonNull Context context, @NonNull Region region, Callback<CheckToken> callback) {

        AccessToken accessToken = OauthSharedPreferences.getAccessToken(context);
        if (accessToken != null) {

            Retrofit retrofit = OauthRetrofitUtils.getInstance(context, region);
            OauthService oauthService = retrofit.create(OauthService.class);

            Call<CheckToken> call = oauthService.checkToken(accessToken.getValue());
            call.enqueue(callback);

        } else
            throw new IllegalArgumentException("No access token were found, use getAccessToken() first");
    }
}
