package il.co.galex.battlenet.api.d3.model.season;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

import il.co.galex.battlenet.api.d3.model.common.Link;
import il.co.galex.battlenet.api.d3.model.common.Links;

/**
 * @author Alexander Gherschon
 */

public class SeasonIndex implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.currentSeason);
        dest.writeValue(this.serviceCurrentSeason);
        dest.writeInt(this.serviceSeasonState == null ? -1 : this.serviceSeasonState.ordinal());
        dest.writeLong(this.lastUpdateTime != null ? this.lastUpdateTime.getTime() : -1);
        dest.writeString(this.generatedBy);
        dest.writeParcelable(this.links, flags);
        dest.writeTypedList(this.seasonsLinks);
    }

    public SeasonIndex() {
    }

    protected SeasonIndex(Parcel in) {
        this.currentSeason = (Integer) in.readValue(Integer.class.getClassLoader());
        this.serviceCurrentSeason = (Integer) in.readValue(Integer.class.getClassLoader());
        int tmpServiceSeasonState = in.readInt();
        this.serviceSeasonState = tmpServiceSeasonState == -1 ? null : SeasonState.values()[tmpServiceSeasonState];
        long tmpLastUpdateTime = in.readLong();
        this.lastUpdateTime = tmpLastUpdateTime == -1 ? null : new Date(tmpLastUpdateTime);
        this.generatedBy = in.readString();
        this.links = in.readParcelable(Links.class.getClassLoader());
        this.seasonsLinks = in.createTypedArrayList(Link.CREATOR);
    }

    public static final Parcelable.Creator<SeasonIndex> CREATOR = new Parcelable.Creator<SeasonIndex>() {
        @Override
        public SeasonIndex createFromParcel(Parcel source) {
            return new SeasonIndex(source);
        }

        @Override
        public SeasonIndex[] newArray(int size) {
            return new SeasonIndex[size];
        }
    };
}
