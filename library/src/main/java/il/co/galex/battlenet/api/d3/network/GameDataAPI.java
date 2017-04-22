package il.co.galex.battlenet.api.d3.network;

import android.content.Context;
import android.support.annotation.NonNull;

import java.io.IOException;

import il.co.galex.battlenet.api.d3.model.account.User;
import il.co.galex.battlenet.api.d3.model.common.Region;
import il.co.galex.battlenet.api.d3.model.season.SeasonIndex;
import il.co.galex.battlenet.api.utils.RetrofitUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * @author Alexander Gherschon
 */

public final class GameDataAPI {


    private GameDataAPI() {
    }

    public static SeasonIndex getSeasonIndex(@NonNull Context context, @NonNull Region region, @NonNull String accessToken) {

        Retrofit retrofit = RetrofitUtils.getInstance(context, region);
        GameDataService service = retrofit.create(GameDataService.class);

        Call<SeasonIndex> call = service.getSeasonIndex(accessToken);

        try {
            Response<SeasonIndex> response = call.execute();
            if (response.code() == 200) return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void getSeasonIndex(@NonNull Context context, @NonNull Region region, @NonNull String accessToken, Callback<SeasonIndex> callback) {

        Retrofit retrofit = RetrofitUtils.getInstance(context, region);
        GameDataService service = retrofit.create(GameDataService.class);

        Call<SeasonIndex> call = service.getSeasonIndex(accessToken);
        call.enqueue(callback);
    }

    private interface GameDataService {

        @GET("/data/d3/season/")
        Call<SeasonIndex> getSeasonIndex(@Query("access_token") String accessToken);
    }
}
