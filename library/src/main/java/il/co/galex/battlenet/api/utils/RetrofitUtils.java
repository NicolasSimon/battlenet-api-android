package il.co.galex.battlenet.api.utils;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;

import il.co.galex.bnetapi.BuildConfig;
import il.co.galex.bnetapi.R;
import il.co.galex.battlenet.api.d3.model.common.Region;
import il.co.galex.battlenet.api.d3.model.common.TooltipParams;
import il.co.galex.battlenet.api.d3.model.item.AttributesRaw;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author Alexander Gherschon
 */

public class RetrofitUtils {

    private static Retrofit instance;

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

        httpClient.addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                Request original = chain.request();
                HttpUrl originalHttpUrl = original.url();

                HttpUrl url = originalHttpUrl.newBuilder()
                        .addQueryParameter("apikey", context.getString(R.string.battlenet_lib_api_key))
                        .build();

                Request.Builder requestBuilder = original.newBuilder()
                        .url(url);

                Request request = requestBuilder.build();
                return chain.proceed(request);
            }
        });

        return new Retrofit.Builder()
                .baseUrl("https://" + region.name().toLowerCase() + ".api.battle.net/")
                .client(httpClient.build())
                .addConverterFactory(GsonConverterFactory.create(getGson()))
                .build();
    }

    private static Gson getGson() {

        return new GsonBuilder()
                .registerTypeAdapter(AttributesRaw.class, new AttributesRawTypeAdapter())
                .registerTypeAdapter(TooltipParams.class, new TooltipParamsTypeAdapter())
                .create();
    }
}
