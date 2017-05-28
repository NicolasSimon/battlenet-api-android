package il.co.galex.battlenet.api.d3.model.leaderboard;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class Row implements Parcelable {

    @SerializedName("player")
    private List<Player> players;
    private Integer order;
    private RowData data;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public RowData getData() {
        return data;
    }

    public void setData(RowData data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "player=" + players +
                ", order=" + order +
                ", data=" + data +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.players);
        dest.writeValue(this.order);
        dest.writeParcelable(this.data, flags);
    }

    public Row() {
    }

    protected Row(Parcel in) {
        this.players = in.createTypedArrayList(Player.CREATOR);
        this.order = (Integer) in.readValue(Integer.class.getClassLoader());
        this.data = in.readParcelable(RowData.class.getClassLoader());
    }

    public static final Parcelable.Creator<Row> CREATOR = new Parcelable.Creator<Row>() {
        @Override
        public Row createFromParcel(Parcel source) {
            return new Row(source);
        }

        @Override
        public Row[] newArray(int size) {
            return new Row[size];
        }
    };
}
