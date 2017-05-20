package il.co.galex.battlenet.api.d3.model.era;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import il.co.galex.battlenet.api.d3.model.common.HeroClass;
import il.co.galex.battlenet.api.d3.model.common.Links;
import il.co.galex.battlenet.api.d3.model.leaderboard.Row;
import il.co.galex.battlenet.api.d3.model.leaderboard.Title;

/**
 * @author Alexander Gherschon
 */

public class EraLeaderboard {

    @SerializedName("_links")
    private Links links;

    @SerializedName("row")
    private List<Row> rows;
    private String key;
    private Title title;

    @SerializedName("last_update_time")
    private Date lastUpdateTime;

    // TODO attribute column ?
    @SerializedName("generated_by")
    private String generatedBy;

    @SerializedName("achievement_points")
    private Boolean achievementPoints;

    @SerializedName("greater_rift")
    private Boolean greaterRift;

    @SerializedName("greater_rift_solo_class")
    private HeroClass greaterRiftSoloClass;

    private Integer era;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> row) {
        this.rows = row;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
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

    public Boolean getAchievementPoints() {
        return achievementPoints;
    }

    public void setAchievementPoints(Boolean achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    public Boolean getGreaterRift() {
        return greaterRift;
    }

    public void setGreaterRift(Boolean greaterRift) {
        this.greaterRift = greaterRift;
    }

    public HeroClass getGreaterRiftSoloClass() {
        return greaterRiftSoloClass;
    }

    public void setGreaterRiftSoloClass(HeroClass greaterRiftSoloClass) {
        this.greaterRiftSoloClass = greaterRiftSoloClass;
    }

    public Integer getEra() {
        return era;
    }

    public void setEra(Integer era) {
        this.era = era;
    }

    @Override
    public String toString() {
        return "{" +
                "links=" + links +
                ", rows=" + rows +
                ", key='" + key + '\'' +
                ", title=" + title +
                ", lastUpdateTime=" + lastUpdateTime +
                ", generatedBy='" + generatedBy + '\'' +
                ", achievementPoints=" + achievementPoints +
                ", greaterRift=" + greaterRift +
                ", greaterRiftSoloClass=" + greaterRiftSoloClass +
                ", era=" + era +
                '}';
    }
}
