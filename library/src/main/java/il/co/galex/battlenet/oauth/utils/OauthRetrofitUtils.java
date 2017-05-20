package il.co.galex.battlenet.oauth.utils;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;
import il.co.galex.battlenet.api.d3.model.common.HeroClass;
import il.co.galex.battlenet.api.d3.model.common.TooltipParams;
import il.co.galex.battlenet.api.d3.model.item.AttributesRaw;
import il.co.galex.battlenet.api.d3.model.leaderboard.PlayerData;
import il.co.galex.battlenet.api.d3.model.leaderboard.RowData;
import il.co.galex.battlenet.api.utils.AttributesRawTypeAdapter;
import il.co.galex.battlenet.api.utils.BattleTagTypeAdapter;
import il.co.galex.battlenet.api.utils.HeroClassTypeAdapter;
import il.co.galex.battlenet.api.utils.PlayerDataTypeAdapter;
import il.co.galex.battlenet.api.utils.RowDataTypeAdapter;
import il.co.galex.battlenet.api.utils.TooltipParamsTypeAdapter;
import il.co.galex.battlenet.common.model.Region;
import il.co.galex.bnetapi.BuildConfig;
import il.co.galex.bnetapi.R;
import okhttp3.Authenticator;
import okhttp3.Credentials;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Alexander Gherschon
 */

public final class OauthRetrofitUtils {

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

        /*httpClient.addInterceptor(chain -> {
            Request original = chain.request();
            HttpUrl originalHttpUrl = original.url();

            HttpUrl url = originalHttpUrl.newBuilder()
                    .addQueryParameter("apikey", context.getString(R.string.battlenet_lib_api_key))
                    .build();

            Request.Builder requestBuilder = original.newBuilder()
                    .url(url);

            Request request = requestBuilder.build();
            return

            chain.proceed(request);
        });*/

        httpClient.authenticator((route, response) -> {

            String clientId = context.getString(R.string.battlenet_lib_api_key);
            String clientSecret = context.getString(R.string.battlenet_lib_api_secret);
            String credential = Credentials.basic(clientId, clientSecret);
            return response.request().newBuilder()
                    .header("Authorization", credential)
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
/*                .setDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz")
                .registerTypeAdapter(BattleTag.class, new BattleTagTypeAdapter())
                .registerTypeAdapter(HeroClass.class, new HeroClassTypeAdapter())
                .registerTypeAdapter(AttributesRaw.class, new AttributesRawTypeAdapter())
                .registerTypeAdapter(TooltipParams.class, new TooltipParamsTypeAdapter())
                .registerTypeAdapter(PlayerData.class, new PlayerDataTypeAdapter())
                .registerTypeAdapter(RowData.class, new RowDataTypeAdapter())*/
                .create();
    }
}
