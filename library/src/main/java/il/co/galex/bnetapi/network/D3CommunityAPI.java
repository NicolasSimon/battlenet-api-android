package il.co.galex.bnetapi.network;

import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.annotation.WorkerThread;

import java.io.IOException;

import il.co.galex.bnetapi.model.CareerProfile;
import il.co.galex.bnetapi.model.HeroProfile;
import il.co.galex.bnetapi.model.Locale;
import il.co.galex.bnetapi.model.Region;
import il.co.galex.bnetapi.model.BattleTag;
import il.co.galex.bnetapi.utils.RetrofitUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Diablo 3 Community API
 *
 * @author Alexander Gherschon
 */
public final class D3CommunityAPI {

    private D3CommunityAPI() {

    }

    /**
     * Get in a synchronous way the Career Profile for a BattleTag
     *
     * @param context android context
     * @param region region to operate the request
     * @param battleTag of the user
     * @param locale of the api
     * @return CareerProfile of the requested BattleTag
     */
    @WorkerThread
    public static CareerProfile getCareerProfile(@NonNull Context context, @NonNull Region region, @NonNull BattleTag battleTag, @NonNull Locale locale) {

        Retrofit retrofit = RetrofitUtils.getRetrofit(context, region);
        D3CommunityService service = retrofit.create(D3CommunityService.class);

        Call<CareerProfile> call = service.getCareerProfile(battleTag.getApiFormat(), locale.getValue());

        try {
            Response<CareerProfile> response = call.execute();
            if (response.code() == 200) return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get in an asynchronous way the Career Profile for a BattleTag
     *
     * @param context android context
     * @param region region to operate the request
     * @param battleTag of the user
     * @param locale of the api
     * @param callback callback to act on the request
     *
     */
    @MainThread
    public static void getCareerProfile(@NonNull Context context, @NonNull Region region, @NonNull BattleTag battleTag, @NonNull Locale locale, @NonNull Callback<CareerProfile> callback) {

        Retrofit retrofit = RetrofitUtils.getRetrofit(context, region);
        D3CommunityService service = retrofit.create(D3CommunityService.class);

        Call<CareerProfile> call = service.getCareerProfile(battleTag.getApiFormat(), locale.getValue());
        call.enqueue(callback);
    }

    /**
     * Get in a synchronous way the Hero Profile for a BattleTag and a Hero Id
     *
     * @param context android context
     * @param region region to operate the request
     * @param battleTag of the user
     * @param heroId id of the hero to get
     * @param locale of the api
     * @return CareerProfile of the requested BattleTag
     */
    @WorkerThread
    public static HeroProfile getHeroProfile(@NonNull Context context, @NonNull Region region, @NonNull BattleTag battleTag, @NonNull Long heroId, @NonNull Locale locale) {

        Retrofit retrofit = RetrofitUtils.getRetrofit(context, region);
        D3CommunityService service = retrofit.create(D3CommunityService.class);

        Call<HeroProfile> call = service.getHeroProfile(battleTag.getApiFormat(), heroId, locale.getValue());

        try {
            Response<HeroProfile> response = call.execute();
            if (response.code() == 200) return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get in an asynchronous way the Hero Profile for a BattleTag and a Hero Id
     *
     * @param context android context
     * @param region region to operate the request
     * @param battleTag of the user
     * @param heroId id of the hero
     * @param locale of the api
     * @param callback callback to act on the request
     *
     */
    @MainThread
    public static void getHeroProfile(@NonNull Context context, @NonNull Region region, @NonNull BattleTag battleTag, @NonNull Long heroId, @NonNull Locale locale, @NonNull Callback<HeroProfile> callback) {

        Retrofit retrofit = RetrofitUtils.getRetrofit(context, region);
        D3CommunityService service = retrofit.create(D3CommunityService.class);

        Call<HeroProfile> call = service.getHeroProfile(battleTag.getApiFormat(), heroId, locale.getValue());
        call.enqueue(callback);
    }
}


