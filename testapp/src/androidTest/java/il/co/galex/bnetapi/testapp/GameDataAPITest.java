package il.co.galex.bnetapi.testapp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import il.co.galex.battlenet.api.d3.model.common.Region;
import il.co.galex.battlenet.api.d3.model.leaderboard.Leaderboard;
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

        SeasonLeaderboard data = GameDataAPI.getSeasonLeaderboard(context, Region.EU, 10, Leaderboard.ACHIEVEMENT_POINTS, ACCESS_TOKEN);
        assertNotNull(data);
        assertNotNull(data.getSeason());
    }

    @Test
    public void getSeasonLeaderboardAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();

        final SeasonLeaderboard[] data = new SeasonLeaderboard[1];

        GameDataAPI.getSeasonLeaderboard(context, Region.EU, 9, Leaderboard.ACHIEVEMENT_POINTS, ACCESS_TOKEN, new Callback<SeasonLeaderboard>() {
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
}
