package il.co.galex.battlenet.api.d3.model.season;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import il.co.galex.battlenet.api.d3.model.common.Link;
import il.co.galex.battlenet.api.d3.model.common.Links;

/**
 * @author Alexander Gherschon
 */

public class SeasonIndex {

    @SerializedName("current_season")
    private Integer currentSeason;

    @SerializedName("service_current_season")
    private Integer serviceCurrentSeason;

    @SerializedName("service_season_state")
    private SeasonState serviceSeasonState;

    @SerializedName("last-update-time")
    private Date lastUpdateTime;

    @SerializedName("generated_by")
    private String generatedBy;

    @SerializedName("_links")
    private Links links;

    @SerializedName("season")
    private List<Link> seasonsLinks;

    public Integer getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Integer currentSeason) {
        this.currentSeason = currentSeason;
    }

    public Integer getServiceCurrentSeason() {
        return serviceCurrentSeason;
    }

    public void setServiceCurrentSeason(Integer serviceCurrentSeason) {
        this.serviceCurrentSeason = serviceCurrentSeason;
    }

    public SeasonState getServiceSeasonState() {
        return serviceSeasonState;
    }

    public void setServiceSeasonState(SeasonState seasonState) {
        this.serviceSeasonState = seasonState;
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

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public List<Link> getSeasonsLinks() {
        return seasonsLinks;
    }

    public void setSeasonsLinks(List<Link> seasonsLinks) {
        this.seasonsLinks = seasonsLinks;
    }

    @Override
    public String toString() {
        return "{" +
                "currentSeason=" + currentSeason +
                ", serviceCurrentSeason=" + serviceCurrentSeason +
                ", serviceSeasonState=" + serviceSeasonState +
                ", lastUpdateTime='" + lastUpdateTime + '\'' +
                ", generatedBy='" + generatedBy + '\'' +
                ", links=" + links +
                ", seasonsLinks=" + seasonsLinks +
                '}';
    }
}