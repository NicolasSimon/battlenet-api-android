package il.co.galex.battlenet.api.d3.model.season;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import il.co.galex.battlenet.api.d3.model.common.Leaderboard;
import il.co.galex.battlenet.api.d3.model.common.Links;

/**
 * @author Alexander Gherschon
 */

public class Season {

    @SerializedName("_links")
    private Links links;

    private List<Leaderboard> leaderboard;

    @SerializedName("season_id")
    private Integer seasonId;

    @SerializedName("last-update-time")
    private Date lastUpdateTime;

    @SerializedName("generated_by")
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