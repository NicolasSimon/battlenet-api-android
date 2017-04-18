package il.co.galex.bnetapi.d3.network;

import il.co.galex.bnetapi.d3.model.career.CareerProfile;
import il.co.galex.bnetapi.d3.model.hero.HeroProfile;
import il.co.galex.bnetapi.d3.model.item.ItemData;
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

    @GET("d3/data/item/{itemId}")
    Call<ItemData> getItemData(@Path("itemId") String itemId, @Query("locale") String locale);
}


