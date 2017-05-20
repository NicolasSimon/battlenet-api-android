package il.co.galex.battlenet.api.d3.model.era;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import il.co.galex.battlenet.api.d3.model.common.Link;
import il.co.galex.battlenet.api.d3.model.common.Links;

/**
 * @author Alexander Gherschon
 */

public class EraIndex {

    @SerializedName("_links")
    private Links links;

    @SerializedName("era")
    private List<Link> eraLinks;

    @SerializedName("current_era")
    private Integer currentEra;

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

    public List<Link> getEraLinks() {
        return eraLinks;
    }

    public void setEraLinks(List<Link> eraLinks) {
        this.eraLinks = eraLinks;
    }

    public Integer getCurrentEra() {
        return currentEra;
    }

    public void setCurrentEra(Integer currentEra) {
        this.currentEra = currentEra;
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
                ", eraLinks=" + eraLinks +
                ", currentEra=" + currentEra +
                ", lastUpdateTime=" + lastUpdateTime +
                ", generatedBy='" + generatedBy + '\'' +
                '}';
    }
}
