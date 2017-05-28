package il.co.galex.battlenet.api.d3.model.season;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import il.co.galex.battlenet.api.d3.model.common.Leaderboard;
import il.co.galex.battlenet.api.d3.model.common.Links;

/**
 * @author Alexander Gherschon
 */

public class Season implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.links, flags);
        dest.writeTypedList(this.leaderboard);
        dest.writeValue(this.seasonId);
        dest.writeLong(this.lastUpdateTime != null ? this.lastUpdateTime.getTime() : -1);
        dest.writeString(this.generatedBy);
    }

    public Season() {
    }

    protected Season(Parcel in) {
        this.links = in.readParcelable(Links.class.getClassLoader());
        this.leaderboard = in.createTypedArrayList(Leaderboard.CREATOR);
        this.seasonId = (Integer) in.readValue(Integer.class.getClassLoader());
        long tmpLastUpdateTime = in.readLong();
        this.lastUpdateTime = tmpLastUpdateTime == -1 ? null : new Date(tmpLastUpdateTime);
        this.generatedBy = in.readString();
    }

    public static final Parcelable.Creator<Season> CREATOR = new Parcelable.Creator<Season>() {
        @Override
        public Season createFromParcel(Parcel source) {
            return new Season(source);
        }

        @Override
        public Season[] newArray(int size) {
            return new Season[size];
        }
    };
}
