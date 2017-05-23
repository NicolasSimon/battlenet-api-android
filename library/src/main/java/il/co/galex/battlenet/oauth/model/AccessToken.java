package il.co.galex.battlenet.oauth.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author Alexander Gherschon
 */

public class AccessToken {

    @SerializedName("access_token")
    private String value;

    @SerializedName("token_type")
    private String tokenType;

    @SerializedName("expires_in")
    private Long expiresIn;

    private Long createdAt;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getTokenType() {
        return tokenType;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public Long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Long createdAt) {
        this.createdAt = createdAt;
    }

    public boolean hasExpired() {
        return expiresIn != null && (expiresIn * 1000) + createdAt < System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "{" +
                "value='" + value + '\'' +
                ", tokenType='" + tokenType + '\'' +
                ", expiresIn=" + expiresIn +
                ", createdAt=" + createdAt +
                '}';
    }
}
