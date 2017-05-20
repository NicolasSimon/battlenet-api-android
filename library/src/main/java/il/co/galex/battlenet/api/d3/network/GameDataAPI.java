package il.co.galex.battlenet.api.d3.network;

import android.content.Context;
import android.support.annotation.NonNull;

import java.io.IOException;

import il.co.galex.battlenet.api.d3.model.common.Region;
import il.co.galex.battlenet.api.d3.model.era.EraIndex;
import il.co.galex.battlenet.api.d3.model.leaderboard.Leaderboard;
import il.co.galex.battlenet.api.d3.model.season.Season;
import il.co.galex.battlenet.api.d3.model.season.SeasonIndex;
import il.co.galex.battlenet.api.d3.model.season.SeasonLeaderboard;
import il.co.galex.battlenet.api.utils.RetrofitUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

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

    public static Season getSeason(@NonNull Context context, @NonNull Region region, @NonNull Integer seasonId, @NonNull String accessToken) {

        Retrofit retrofit = RetrofitUtils.getInstance(context, region);
        GameDataService service = retrofit.create(GameDataService.class);

        Call<Season> call = service.getSeason(seasonId, accessToken);

        try {
            Response<Season> response = call.execute();
            if (response.code() == 200) return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void getSeason(@NonNull Context context, @NonNull Region region, @NonNull Integer seasonId, @NonNull String accessToken, Callback<Season> callback) {

        Retrofit retrofit = RetrofitUtils.getInstance(context, region);
        GameDataService service = retrofit.create(GameDataService.class);

        Call<Season> call = service.getSeason(seasonId, accessToken);
        call.enqueue(callback);
    }

    public static SeasonLeaderboard getSeasonLeaderboard(@NonNull Context context, @NonNull Region region, @NonNull Integer seasonId, @NonNull Leaderboard leaderboard, @NonNull String accessToken) {

        Retrofit retrofit = RetrofitUtils.getInstance(context, region);
        GameDataService service = retrofit.create(GameDataService.class);

        Call<SeasonLeaderboard> call = service.getSeasonLeaderboard(seasonId, leaderboard.getValue(), accessToken);

        try {
            Response<SeasonLeaderboard> response = call.execute();
            if (response.code() == 200) return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void getSeasonLeaderboard(@NonNull Context context, @NonNull Region region, @NonNull Integer seasonId,  @NonNull Leaderboard leaderboard, @NonNull String accessToken, Callback<SeasonLeaderboard> callback) {

        Retrofit retrofit = RetrofitUtils.getInstance(context, region);
        GameDataService service = retrofit.create(GameDataService.class);

        Call<SeasonLeaderboard> call = service.getSeasonLeaderboard(seasonId, leaderboard.getValue(), accessToken);
        call.enqueue(callback);
    }

    public static EraIndex getEraIndex(@NonNull Context context, @NonNull Region region, @NonNull String accessToken) {

        Retrofit retrofit = RetrofitUtils.getInstance(context, region);
        GameDataService service = retrofit.create(GameDataService.class);

        Call<EraIndex> call = service.getEraIndex(accessToken);

        try {
            Response<EraIndex> response = call.execute();
            if (response.code() == 200) return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void getEraIndex(@NonNull Context context, @NonNull Region region, @NonNull String accessToken, Callback<EraIndex> callback) {

        Retrofit retrofit = RetrofitUtils.getInstance(context, region);
        GameDataService service = retrofit.create(GameDataService.class);

        Call<EraIndex> call = service.getEraIndex(accessToken);
        call.enqueue(callback);
    }
}
