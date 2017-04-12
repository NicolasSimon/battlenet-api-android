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

    private static final String AHAVA = "Ahava";
    private static final int NUMBER = 2406;

    @Test
    public void getCareerProfileSync() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        BattleTag battleTag = new BattleTag(AHAVA, NUMBER);
        CareerProfile careerProfile = D3CommunityAPI.getCareerProfile(context, Region.EU, battleTag, Locale.ENGLISH);
        assertNotNull(careerProfile);
        assertTrue(battleTag.getPublicFormat().equals(careerProfile.getBattleTag()));
    }

    @Test
    public void getCareerProfileAsync() throws Exception {

        final CountDownLatch lock = new CountDownLatch(1);
        final Context context = InstrumentationRegistry.getTargetContext();

        final BattleTag battleTag = new BattleTag("Ahava", 2406);
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
}
