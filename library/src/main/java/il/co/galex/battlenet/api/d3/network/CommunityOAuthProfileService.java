package il.co.galex.battlenet.api.d3.network;

import il.co.galex.battlenet.api.d3.model.account.User;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface CommunityOAuthProfileService {

    @GET("/account/user")
    Call<User> getUser(@Query("access_token") String accessToken);
}