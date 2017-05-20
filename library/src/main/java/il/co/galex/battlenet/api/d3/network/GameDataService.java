package il.co.galex.battlenet.api.d3.network;

import il.co.galex.battlenet.api.d3.model.era.Era;
import il.co.galex.battlenet.api.d3.model.era.EraIndex;
import il.co.galex.battlenet.api.d3.model.season.Season;
import il.co.galex.battlenet.api.d3.model.season.SeasonIndex;
import il.co.galex.battlenet.api.d3.model.season.SeasonLeaderboard;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GameDataService {

    @GET("/data/d3/season/")
    Call<SeasonIndex> getSeasonIndex(@Query("access_token") String accessToken);

    @GET("/data/d3/season/{seasonId}")
    Call<Season> getSeason(@Path("seasonId") Integer seasonId, @Query("access_token") String accessToken);

    @GET("/data/d3/season/{seasonId}/leaderboard/{leaderboard}")
    Call<SeasonLeaderboard> getSeasonLeaderboard(@Path("seasonId") Integer seasonId, @Path("leaderboard") String leaderboard, @Query("access_token") String accessToken);

    @GET("/data/d3/era/")
    Call<EraIndex> getEraIndex(@Query("access_token") String accessToken);

    @GET("/data/d3/era/{eraId}")
    Call<Era> getEra(@Path("eraId") Integer eraId, @Query("access_token") String accessToken);
}