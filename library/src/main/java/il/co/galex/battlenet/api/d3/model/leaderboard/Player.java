package il.co.galex.battlenet.api.d3.model.leaderboard;

/**
 * @author Alexander Gherschon
 */

public class Player {

    private String key;
    private Integer accountId;
    private PlayerData data;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public PlayerData getData() {
        return data;
    }

    public void setData(PlayerData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "key='" + key + '\'' +
                ", accountId=" + accountId +
                ", data=" + data +
                '}';
    }
}
