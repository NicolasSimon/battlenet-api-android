package il.co.galex.battlenet.api.d3.model.era;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import il.co.galex.battlenet.api.d3.model.common.Leaderboard;
import il.co.galex.battlenet.api.d3.model.common.Links;

/**
 * @author Alexander Gherschon
 */

public class Era {

    @SerializedName("_links")
    private Links links;

    private List<Leaderboard> leaderboard;

    @SerializedName("era_id")
    private Integer eraId;

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

    public Integer getEraId() {
        return eraId;
    }

    public void setEraId(Integer eraId) {
        this.eraId = eraId;
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
                ", eraId=" + eraId +
                ", lastUpdateTime=" + lastUpdateTime +
                ", generatedBy='" + generatedBy + '\'' +
                '}';
    }
}
