package il.co.galex.battlenet.api.d3.network;

import android.content.Context;
import android.support.annotation.NonNull;

import java.io.IOException;

import il.co.galex.battlenet.api.d3.model.account.User;
import il.co.galex.battlenet.common.model.Region;
import il.co.galex.battlenet.api.utils.RetrofitUtils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * @author Alexander Gherschon
 */

public final class CommunityOAuthProfileAPI {

    private CommunityOAuthProfileAPI() {

    }

    public static User getUser(@NonNull Context context, @NonNull Region region, @NonNull String accessToken) {

        Retrofit retrofit = RetrofitUtils.getInstance(context, region);
        CommunityOAuthProfileService service = retrofit.create(CommunityOAuthProfileService.class);

        Call<User> call = service.getUser(accessToken);

        try {
            Response<User> response = call.execute();
            if (response.code() == 200) return response.body();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void getUser(@NonNull Context context, @NonNull Region region, @NonNull String accessToken, Callback<User> callback) {

        Retrofit retrofit = RetrofitUtils.getInstance(context, region);
        CommunityOAuthProfileService service = retrofit.create(CommunityOAuthProfileService.class);

        Call<User> call = service.getUser(accessToken);
        call.enqueue(callback);
    }
}
