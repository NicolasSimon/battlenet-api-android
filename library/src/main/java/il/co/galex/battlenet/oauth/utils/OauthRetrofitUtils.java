package il.co.galex.battlenet.oauth.utils;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import il.co.galex.battlenet.common.model.Region;
import il.co.galex.bnetapi.BuildConfig;
import il.co.galex.bnetapi.R;
import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Alexander Gherschon
 */

public final class OauthRetrofitUtils {

    private static final String AUTHORIZATION = "Authorization";
    private static Retrofit instance;

    private OauthRetrofitUtils() {

    }

    public static Retrofit getInstance(Context context, Region region) {

        if(instance == null) {
            instance = getRetrofit(context, region);
        }

        return instance;
    }

    private static Retrofit getRetrofit(final Context context, Region region) {

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();

        if(BuildConfig.DEBUG) {

            HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
            logging.setLevel(HttpLoggingInterceptor.Level.BODY);
            httpClient.addInterceptor(logging);
        }

        httpClient.authenticator((route, response) -> {

            String clientId = context.getString(R.string.battlenet_lib_api_key);
            String clientSecret = context.getString(R.string.battlenet_lib_api_secret);
            String credential = Credentials.basic(clientId, clientSecret);
            return response.request().newBuilder()
                    .header(AUTHORIZATION, credential)
                    .build();
        });

        return new Retrofit.Builder()
                .baseUrl(UrlUtils.getBaseUrl(region))
                .client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create(getGson()))
                .build();
    }

    private static Gson getGson() {

        return new GsonBuilder()
                .create();
    }
}
