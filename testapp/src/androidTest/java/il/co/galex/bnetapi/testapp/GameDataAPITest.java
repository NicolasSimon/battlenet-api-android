package il.co.galex.bnetapi.testapp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;

import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import il.co.galex.battlenet.api.d3.model.account.User;
import il.co.galex.battlenet.api.d3.model.common.BattleTag;
import il.co.galex.battlenet.api.d3.model.common.Region;
import il.co.galex.battlenet.api.d3.model.season.Season;
import il.co.galex.battlenet.api.d3.model.season.SeasonIndex;
import il.co.galex.battlenet.api.d3.network.CommunityOAuthProfileAPI;
import il.co.galex.battlenet.api.d3.network.GameDataAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * @author Alexander Gherschon
 */

public class GameDataAPITest {

    private static final String ACCESS_TOKEN = "8hd2uz9q7f5khbphvu3vu4yh"; // problematic cause the code expires after 30 days

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
}
