package il.co.galex.battlenet.oauth.network;

import java.util.Map;

import il.co.galex.battlenet.oauth.model.AccessToken;
import il.co.galex.battlenet.oauth.model.CheckToken;
import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * @author Alexander Gherschon
 */

public interface OauthService {

    /*private static final String TOKEN_URI = "https://%s.battle.net/oauth/token";
    private static final String TOKEN_URI_CN = "https://www.battlenet.com.cn/oauth/token";

    private static final String CHECK_TOKEN_URI = "https://%s.battle.net/oauth/check_token?token=%s";
    private static final String CHECK_TOKEN_URI_CN = "https://www.battlenet.com.cn/oauth/check_token?token=%s";*/

    @FormUrlEncoded
    @POST("/oauth/token")
    Call<AccessToken> getAccessToken(@FieldMap Map<String, String> fields);

    @GET("oauth/check_token")
    Call<CheckToken> checkToken(@Query("token") String accessToken);
}
