package il.co.galex.battlenet.api.d3.model.leaderboard;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class Player implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.key);
        dest.writeValue(this.accountId);
        dest.writeParcelable(this.data, flags);
    }

    public Player() {
    }

    protected Player(Parcel in) {
        this.key = in.readString();
        this.accountId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.data = in.readParcelable(PlayerData.class.getClassLoader());
    }

    public static final Parcelable.Creator<Player> CREATOR = new Parcelable.Creator<Player>() {
        @Override
        public Player createFromParcel(Parcel source) {
            return new Player(source);
        }

        @Override
        public Player[] newArray(int size) {
            return new Player[size];
        }
    };
}
