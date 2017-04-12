package il.co.galex.bnetapi.network;

import android.content.Context;
import android.support.annotation.MainThread;
import android.support.annotation.WorkerThread;

import java.io.IOException;

import il.co.galex.bnetapi.model.CareerProfile;
import il.co.galex.bnetapi.model.Locale;
import il.co.galex.bnetapi.model.Region;
import il.co.galex.bnetapi.model.BattleTag;
import il.co.galex.bnetapi.utils.RetrofitUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Retrofit service to Diablo 3 Community API
 *
 * @author Alexander Gherschon
 */

public class Diablo3CommunityAPI {

    // PROFILE API

    @WorkerThread
    public static CareerProfile getCareerProfile(Context context, Region region, BattleTag battleTag, Locale locale) {

        Retrofit retrofit = RetrofitUtils.getRetrofit(context, region);
        Diablo3CommunityService service = retrofit.create(Diablo3CommunityService.class);

        Call<CareerProfile> call = service.getCareerProfile(battleTag.getApiFormat(), locale.getValue());

        try {
            Response<CareerProfile> response = call.execute();

            if(response.code() == 200) {
                return response.body();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @MainThread
    public static void getCareerProfile(Context context, Region region, BattleTag battleTag, Locale locale, Callback<CareerProfile> callback) {

        Retrofit retrofit = RetrofitUtils.getRetrofit(context, region);
        Diablo3CommunityService service = retrofit.create(Diablo3CommunityService.class);

        Call<CareerProfile> call = service.getCareerProfile(battleTag.getApiFormat(), locale.getValue());
        call.enqueue(callback);
    }
}


