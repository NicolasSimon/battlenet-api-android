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

    private static final String BASE_URL = "https://%s.battle.net";
    private static final String BASE_URL_CN = "https://%s.battle.net";

    private static final String AUTHORIZE_URI = "https://%s.battle.net/oauth/authorize";
    private static final String AUTHORIZE_URI_CN = "https://www.battlenet.com.cn/oauth/authorize";

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

    public static @NonNull String getBaseUrl(@NonNull Region region) {

        switch (region) {
            case EU:
            case KR:
            case TW:
            case US:
                return String.format(BASE_URL, region.name().toLowerCase());
            case CN:
                return BASE_URL_CN;
            default:
                return String.format(BASE_URL, Region.EU.name().toLowerCase());
        }
    }

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
