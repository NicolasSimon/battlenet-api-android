package il.co.galex.bnetapi.testapp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;
import il.co.galex.battlenet.api.d3.model.career.CareerProfile;
import il.co.galex.battlenet.api.d3.model.hero.HeroProfile;
import il.co.galex.battlenet.api.d3.model.common.Locale;
import il.co.galex.battlenet.common.model.Region;
import il.co.galex.battlenet.api.d3.model.item.ItemData;
import il.co.galex.battlenet.api.d3.network.D3CommunityAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * Tests of requests to the D3 Community API
 * @author Alexander Gherschon
 */

@RunWith(AndroidJUnit4.class)
public class D3CommunityAPITest {

    private final BattleTag BATTLETAG = new BattleTag("Ahava", 2406);

    private static final Long HERO_ID = 89208127L;
    private static final String ITEM_ID = "Unique_Dagger_007_x1";

    @Test
    public void getCareerProfileSync() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        CareerProfile careerProfile = D3CommunityAPI.getCareerProfile(context, Region.EU, BATTLETAG, Locale.ENGLISH);
        assertNotNull(careerProfile);
        assertTrue(BATTLETAG.equals(careerProfile.getBattleTag()));
    }

    @Test
    public void getCareerProfileAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();


        final CareerProfile[] careerProfile = new CareerProfile[1];

        D3CommunityAPI.getCareerProfile(context, Region.EU, BATTLETAG, Locale.ENGLISH, new Callback<CareerProfile>() {
            @Override
            public void onResponse(Call<CareerProfile> call, Response<CareerProfile> response) {

                careerProfile[0] = response.body();
                lock.countDown();
            }

            @Override
            public void onFailure(Call<CareerProfile> call, Throwable t) {

                lock.countDown();
            }
        });

        lock.await(2000, TimeUnit.MILLISECONDS);

        assertNotNull(careerProfile[0]);
        assertTrue(BATTLETAG.equals(careerProfile[0].getBattleTag()));
    }

    @Test
    public void getHeroProfileSync() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        HeroProfile heroProfile = D3CommunityAPI.getHeroProfile(context, Region.EU, BATTLETAG, HERO_ID, Locale.ENGLISH);
        assertNotNull(heroProfile);
        assertTrue(HERO_ID.equals(heroProfile.getId()));
    }

    @Test
    public void getHeroProfileAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();

        final HeroProfile[] heroProfiles = new HeroProfile[1];

        D3CommunityAPI.getHeroProfile(context, Region.EU, BATTLETAG, HERO_ID, Locale.ENGLISH, new Callback<HeroProfile>() {
            @Override
            public void onResponse(Call<HeroProfile> call, Response<HeroProfile> response) {

                heroProfiles[0] = response.body();
                lock.countDown();
            }

            @Override
            public void onFailure(Call<HeroProfile> call, Throwable t) {

                lock.countDown();
            }
        });

        lock.await(2000, TimeUnit.MILLISECONDS);

        assertNotNull(heroProfiles[0]);
        assertTrue(HERO_ID.equals(heroProfiles[0].getId()));
    }

    @Test
    public void getItemDataSync() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        ItemData itemData = D3CommunityAPI.getItemData(context, Region.EU, ITEM_ID, Locale.ENGLISH);
        assertNotNull(itemData);
        assertTrue(ITEM_ID.equals(itemData.getId()));
    }

    @Test
    public void getItemDataAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();

        final ItemData[] data = new ItemData[1];

        D3CommunityAPI.getItemData(context, Region.EU, ITEM_ID, Locale.ENGLISH, new Callback<ItemData>() {
            @Override
            public void onResponse(Call<ItemData> call, Response<ItemData> response) {

                data[0] = response.body();
                lock.countDown();
            }

            @Override
            public void onFailure(Call<ItemData> call, Throwable t) {

                lock.countDown();
            }
        });

        lock.await(2000, TimeUnit.MILLISECONDS);

        assertNotNull(data[0]);
        assertTrue(ITEM_ID.equals(data[0].getId()));
    }
}
