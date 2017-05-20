package il.co.galex.bnetapi.testapp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import il.co.galex.battlenet.common.model.Region;
import il.co.galex.battlenet.api.d3.model.era.Era;
import il.co.galex.battlenet.api.d3.model.era.EraIndex;
import il.co.galex.battlenet.api.d3.model.era.EraLeaderboard;
import il.co.galex.battlenet.api.d3.model.leaderboard.LeaderboardType;
import il.co.galex.battlenet.api.d3.model.season.Season;
import il.co.galex.battlenet.api.d3.model.season.SeasonIndex;
import il.co.galex.battlenet.api.d3.model.season.SeasonLeaderboard;
import il.co.galex.battlenet.api.d3.network.GameDataAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static junit.framework.Assert.assertNotNull;

/**
 * @author Alexander Gherschon
 */

public class GameDataAPITest {

    private static final String ACCESS_TOKEN = "nestn9uhfgzpj953j3xpfpnw"; // problematic because the token expires after 30 days

    @Test
    public void getSeasonIndexSync() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        SeasonIndex data = GameDataAPI.getSeasonIndex(context, Region.EU, ACCESS_TOKEN);
        assertNotNull(data);
        assertNotNull(data.getCurrentSeason());
    }

    @Test
    public void getSeasonIndexAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();

        final SeasonIndex[] data = new SeasonIndex[1];

        GameDataAPI.getSeasonIndex(context, Region.EU, ACCESS_TOKEN, new Callback<SeasonIndex>() {
            @Override
            public void onResponse(Call<SeasonIndex> call, Response<SeasonIndex> response) {

                data[0] = response.body();
                lock.countDown();
            }

            @Override
            public void onFailure(Call<SeasonIndex> call, Throwable t) {

                lock.countDown();
            }
        });

        lock.await(2000, TimeUnit.MILLISECONDS);

        assertNotNull(data[0]);
        assertNotNull(data[0].getCurrentSeason());
    }

    @Test
    public void getSeasonSync() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        Season data = GameDataAPI.getSeason(context, Region.EU, 10, ACCESS_TOKEN);
        assertNotNull(data);
        assertNotNull(data.getSeasonId());
    }

    @Test
    public void getSeasonAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();

        final Season[] data = new Season[1];

        GameDataAPI.getSeason(context, Region.EU, 10, ACCESS_TOKEN, new Callback<Season>() {
            @Override
            public void onResponse(Call<Season> call, Response<Season> response) {

                data[0] = response.body();
                lock.countDown();
            }

            @Override
            public void onFailure(Call<Season> call, Throwable t) {

                lock.countDown();
            }
        });

        lock.await(2000, TimeUnit.MILLISECONDS);

        assertNotNull(data[0]);
        assertNotNull(data[0].getSeasonId());
    }


    @Test
    public void getSeasonLeaderboardSync() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        SeasonLeaderboard data = GameDataAPI.getSeasonLeaderboard(context, Region.EU, 10, LeaderboardType.ACHIEVEMENT_POINTS, ACCESS_TOKEN);
        assertNotNull(data);
        assertNotNull(data.getSeason());
    }

    @Test
    public void getSeasonLeaderboardAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();

        final SeasonLeaderboard[] data = new SeasonLeaderboard[1];

        GameDataAPI.getSeasonLeaderboard(context, Region.EU, 9, LeaderboardType.ACHIEVEMENT_POINTS, ACCESS_TOKEN, new Callback<SeasonLeaderboard>() {
            @Override
            public void onResponse(Call<SeasonLeaderboard> call, Response<SeasonLeaderboard> response) {

                data[0] = response.body();
                lock.countDown();
            }

            @Override
            public void onFailure(Call<SeasonLeaderboard> call, Throwable t) {

                lock.countDown();
            }
        });

        lock.await(2000, TimeUnit.MILLISECONDS);

        assertNotNull(data[0]);
        assertNotNull(data[0].getSeason());
    }

    @Test
    public void getEraIndexSync() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        EraIndex data = GameDataAPI.getEraIndex(context, Region.EU, ACCESS_TOKEN);
        assertNotNull(data);
        assertNotNull(data.getCurrentEra());
    }

    @Test
    public void getEraIndexAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();

        final EraIndex[] data = new EraIndex[1];

        GameDataAPI.getEraIndex(context, Region.EU, ACCESS_TOKEN, new Callback<EraIndex>() {
            @Override
            public void onResponse(Call<EraIndex> call, Response<EraIndex> response) {

                data[0] = response.body();
                lock.countDown();
            }

            @Override
            public void onFailure(Call<EraIndex> call, Throwable t) {

                lock.countDown();
            }
        });

        lock.await(2000, TimeUnit.MILLISECONDS);

        assertNotNull(data[0]);
        assertNotNull(data[0].getCurrentEra());
    }

    @Test
    public void getEraSync() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        Era data = GameDataAPI.getEra(context, Region.EU, 6, ACCESS_TOKEN);
        assertNotNull(data);
        assertNotNull(data.getEraId());
    }

    @Test
    public void getEraAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();

        final Era[] data = new Era[1];

        GameDataAPI.getEra(context, Region.EU, 7, ACCESS_TOKEN, new Callback<Era>() {
            @Override
            public void onResponse(Call<Era> call, Response<Era> response) {

                data[0] = response.body();
                lock.countDown();
            }

            @Override
            public void onFailure(Call<Era> call, Throwable t) {

                lock.countDown();
            }
        });

        lock.await(2000, TimeUnit.MILLISECONDS);

        assertNotNull(data[0]);
        assertNotNull(data[0].getEraId());
    }

    @Test
    public void getEraLeaderboardSync() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        EraLeaderboard data = GameDataAPI.getEraLeaderboard(context, Region.EU, 6, LeaderboardType.RIFT_DH, ACCESS_TOKEN);
        assertNotNull(data);
        assertNotNull(data.getEra());
    }

    @Test
    public void getEraLeaderboardAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();

        final EraLeaderboard[] data = new EraLeaderboard[1];

        GameDataAPI.getEraLeaderboard(context, Region.EU, 7, LeaderboardType.RIFT_DH, ACCESS_TOKEN, new Callback<EraLeaderboard>() {
            @Override
            public void onResponse(Call<EraLeaderboard> call, Response<EraLeaderboard> response) {

                data[0] = response.body();
                lock.countDown();
            }

            @Override
            public void onFailure(Call<EraLeaderboard> call, Throwable t) {

                lock.countDown();
            }
        });

        lock.await(2000, TimeUnit.MILLISECONDS);

        assertNotNull(data[0]);
        assertNotNull(data[0].getEra());
    }
}
