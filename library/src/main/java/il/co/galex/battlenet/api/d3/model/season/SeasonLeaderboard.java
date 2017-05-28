package il.co.galex.battlenet.api.d3.model.season;

import android.os.Parcel;
import android.os.Parcelable;

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

public class SeasonLeaderboard implements Parcelable {

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

    private Integer season;

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
        this.rows = rows;
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

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
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
                ", season=" + season +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.links, flags);
        dest.writeTypedList(this.rows);
        dest.writeString(this.key);
        dest.writeParcelable(this.title, flags);
        dest.writeLong(this.lastUpdateTime != null ? this.lastUpdateTime.getTime() : -1);
        dest.writeString(this.generatedBy);
        dest.writeValue(this.achievementPoints);
        dest.writeValue(this.greaterRift);
        dest.writeInt(this.greaterRiftSoloClass == null ? -1 : this.greaterRiftSoloClass.ordinal());
        dest.writeValue(this.season);
    }

    public SeasonLeaderboard() {
    }

    protected SeasonLeaderboard(Parcel in) {
        this.links = in.readParcelable(Links.class.getClassLoader());
        this.rows = in.createTypedArrayList(Row.CREATOR);
        this.key = in.readString();
        this.title = in.readParcelable(Title.class.getClassLoader());
        long tmpLastUpdateTime = in.readLong();
        this.lastUpdateTime = tmpLastUpdateTime == -1 ? null : new Date(tmpLastUpdateTime);
        this.generatedBy = in.readString();
        this.achievementPoints = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.greaterRift = (Boolean) in.readValue(Boolean.class.getClassLoader());
        int tmpGreaterRiftSoloClass = in.readInt();
        this.greaterRiftSoloClass = tmpGreaterRiftSoloClass == -1 ? null : HeroClass.values()[tmpGreaterRiftSoloClass];
        this.season = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<SeasonLeaderboard> CREATOR = new Parcelable.Creator<SeasonLeaderboard>() {
        @Override
        public SeasonLeaderboard createFromParcel(Parcel source) {
            return new SeasonLeaderboard(source);
        }

        @Override
        public SeasonLeaderboard[] newArray(int size) {
            return new SeasonLeaderboard[size];
        }
    };
}
