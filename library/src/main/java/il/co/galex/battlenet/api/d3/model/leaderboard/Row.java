package il.co.galex.battlenet.api.d3.model.leaderboard;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class Row {

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
}
