package il.co.galex.battlenet.oauth.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class CheckToken {

    @SerializedName("exp")
    private Long expiresAt;

    @SerializedName("user_name")
    private String userName;

    private List<String> authorities;

    @SerializedName("client_id")
    private String clientId;

    public Long getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Long expiresAt) {
        this.expiresAt = expiresAt;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<String> authorities) {
        this.authorities = authorities;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @Override
    public String toString() {
        return "{" +
                "expiresAt=" + expiresAt +
                ", userName='" + userName + '\'' +
                ", authorities=" + authorities +
                ", clientId='" + clientId + '\'' +
                '}';
    }
}
