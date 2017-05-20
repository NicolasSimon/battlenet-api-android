package il.co.galex.battlenet.oauth.utils;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;

import il.co.galex.battlenet.common.model.Region;

/**
 * @author Alexander Gherschon
 */

public class UrlUtils {

    private static final String AUTHORIZE_URI = "https://%s.battle.net/oauth/authorize";
    private static final String AUTHORIZE_URI_CN = "https://www.battlenet.com.cn/oauth/authorize";

    private static final String TOKEN_URI = "https://%s.battle.net/oauth/token";
    private static final String TOKEN_URI_CN = "https://www.battlenet.com.cn/oauth/token";

    private static final String CHECK_TOKEN_URI = "https://%s.battle.net/oauth/check_token?token=%s";
    private static final String CHECK_TOKEN_URI_CN = "https://www.battlenet.com.cn/oauth/check_token?token=%s";

    private static @Nullable String getAuthorizeUri(@NonNull Region region) {

        switch (region) {
            case EU:
            case KR:
            case TW:
            case US:
                return String.format(AUTHORIZE_URI, region.name().toLowerCase());
            case CN:
                return AUTHORIZE_URI_CN;
        }
        return null;
    }

    /*public static @Nullable String getTokenUri(@NonNull Region region) {

        switch (region) {
            case EU:
            case KR:
            case TW:
            case US:
                return String.format(TOKEN_URI, region.name().toLowerCase());
            case CN:
                return TOKEN_URI_CN;
        }
        return null;
    }

    public static @Nullable String getCheckTokenUri(@NonNull Region region, @NonNull String token) {

        switch (region) {
            case EU:
            case KR:
            case TW:
            case US:
                return String.format(CHECK_TOKEN_URI, region.name().toLowerCase(), token);
            case CN:
                return String.format(CHECK_TOKEN_URI_CN, region);
        }
        return null;
    }*/

    public static @Nullable String getAuthorizationUrl(@NonNull Region region, @NonNull String clientId, @NonNull String redirectUri) {

        return Uri.parse(getAuthorizeUri(region))
                .buildUpon()
                .appendQueryParameter("client_id", clientId)
                .appendQueryParameter("redirect_uri", redirectUri)
                .appendQueryParameter("response_type", Constants.CODE)
                // TODO add "state" to check return type on url to avoid security issues
                .build().toString();
    }
}
