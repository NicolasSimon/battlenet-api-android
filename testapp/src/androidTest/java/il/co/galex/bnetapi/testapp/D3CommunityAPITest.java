package il.co.galex.bnetapi.testapp;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import il.co.galex.bnetapi.model.BattleTag;
import il.co.galex.bnetapi.model.CareerProfile;
import il.co.galex.bnetapi.model.HeroProfile;
import il.co.galex.bnetapi.model.Locale;
import il.co.galex.bnetapi.model.Region;
import il.co.galex.bnetapi.network.D3CommunityAPI;
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

    private static final String USERNAME = "Ahava";
    private static final int NUMBER = 2406;
    private static final Long HERO_ID = 89208127L;

    @Test
    public void getCareerProfileSync() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        BattleTag battleTag = new BattleTag(USERNAME, NUMBER);
        CareerProfile careerProfile = D3CommunityAPI.getCareerProfile(context, Region.EU, battleTag, Locale.ENGLISH);
        assertNotNull(careerProfile);
        assertTrue(battleTag.getPublicFormat().equals(careerProfile.getBattleTag()));
    }

    @Test
    public void getCareerProfileAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();

        final BattleTag battleTag = new BattleTag(USERNAME, NUMBER);
        final CareerProfile[] careerProfile = new CareerProfile[1];

        D3CommunityAPI.getCareerProfile(context, Region.EU, battleTag, Locale.ENGLISH, new Callback<CareerProfile>() {
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
        assertTrue(battleTag.getPublicFormat().equals(careerProfile[0].getBattleTag()));
    }

    @Test
    public void getHeroProfileSync() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        BattleTag battleTag = new BattleTag(USERNAME, NUMBER);
        HeroProfile heroProfile = D3CommunityAPI.getHeroProfile(context, Region.EU, battleTag, HERO_ID, Locale.ENGLISH);
        assertNotNull(heroProfile);
        assertTrue(HERO_ID.equals(heroProfile.getId()));
    }

    @Test
    public void getHeroProfileAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();

        final BattleTag battleTag = new BattleTag(USERNAME, NUMBER);
        final HeroProfile[] heroProfiles = new HeroProfile[1];

        D3CommunityAPI.getHeroProfile(context, Region.EU, battleTag, HERO_ID, Locale.ENGLISH, new Callback<HeroProfile>() {
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
}
