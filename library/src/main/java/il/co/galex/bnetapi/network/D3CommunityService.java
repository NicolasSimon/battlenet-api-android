package il.co.galex.bnetapi.network;

import il.co.galex.bnetapi.model.CareerProfile;
import il.co.galex.bnetapi.model.HeroProfile;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Retrofit service to Diablo 3 Community API
 *
 * @author Alexander Gherschon
 */

interface D3CommunityService {

    @GET("d3/profile/{battleTag}/")
    Call<CareerProfile> getCareerProfile(@Path("battleTag") String battleTag, @Query("locale") String locale);

    @GET("d3/profile/{battleTag}/hero/{heroId}")
    Call<HeroProfile> getHeroProfile(@Path("battleTag") String battleTag, @Path("heroId") Long heroId, @Query("locale") String locale);
}


