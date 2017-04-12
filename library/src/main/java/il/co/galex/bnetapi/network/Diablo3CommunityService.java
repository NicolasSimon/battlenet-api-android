package il.co.galex.bnetapi.network;

import il.co.galex.bnetapi.model.CareerProfile;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Retrofit service to Diablo 3 Community API
 *
 * @author Alexander Gherschon
 */

public interface Diablo3CommunityService {

    @GET("d3/profile/{battleTag}/")
    Call<CareerProfile> getCareerProfile(@Path("battleTag") String battleTag, @Query("locale") String locale);
}


