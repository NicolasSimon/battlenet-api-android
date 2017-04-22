package il.co.galex.battlenet.api.d3.model.season;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class Season {

    @SerializedName("_links")
    private Links links;
    private List<Leaderboard> leaderboard;
    private Integer seasonId;
    private Date lastUpdateTime;
    private String generatedBy;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public List<Leaderboard> getLeaderboard() {
        return leaderboard;
    }

    public void setLeaderboard(List<Leaderboard> leaderboard) {
        this.leaderboard = leaderboard;
    }

    public Integer getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Integer seasonId) {
        this.seasonId = seasonId;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getGeneratedBy() {
        return generatedBy;
    }

    public void setGeneratedBy(String generatedBy) {
        this.generatedBy = generatedBy;
    }

    @Override
    public String toString() {
        return "{" +
                "links=" + links +
                ", leaderboard=" + leaderboard +
                ", seasonId=" + seasonId +
                ", lastUpdateTime=" + lastUpdateTime +
                ", generatedBy='" + generatedBy + '\'' +
                '}';
    }
}
