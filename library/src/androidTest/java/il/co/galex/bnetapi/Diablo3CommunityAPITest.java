package il.co.galex.bnetapi;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import il.co.galex.bnetapi.model.BattleTag;
import il.co.galex.bnetapi.model.CareerProfile;
import il.co.galex.bnetapi.model.Locale;
import il.co.galex.bnetapi.model.Region;
import il.co.galex.bnetapi.network.Diablo3CommunityAPI;
import retrofit2.Call;

import static junit.framework.Assert.assertNotNull;

/**
 * @author Alexander Gherschon
 */

@RunWith(AndroidJUnit4.class)
public class Diablo3CommunityAPITest {

    @Test
    public void getCareerProfile() throws Exception {

        Context context = InstrumentationRegistry.getTargetContext();

        BattleTag battleTag = new BattleTag("Ahava", 2406);

        CareerProfile careerProfile = Diablo3CommunityAPI.getCareerProfile(context, Region.EU, battleTag, Locale.ENGLISH);

        assertNotNull(careerProfile);
    }
}
