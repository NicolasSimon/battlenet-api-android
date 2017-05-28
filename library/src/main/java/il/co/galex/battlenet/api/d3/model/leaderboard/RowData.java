package il.co.galex.battlenet.api.d3.model.leaderboard;

import android.os.Parcel;
import android.os.Parcelable;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;

/**
 * @author Alexander Gherschon
 */

public class RowData implements Parcelable {

    private Integer rank;
    private Integer achievementPoints;
    private Integer riftLevel;
    private Long riftTime;
    private Long completedTime;
    private BattleTag battleTag;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getAchievementPoints() {
        return achievementPoints;
    }

    public void setAchievementPoints(Integer achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    public Long getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(Long completedTime) {
        this.completedTime = completedTime;
    }

    public BattleTag getBattleTag() {
        return battleTag;
    }

    public void setBattleTag(BattleTag battleTag) {
        this.battleTag = battleTag;
    }

    public Integer getRiftLevel() {
        return riftLevel;
    }

    public void setRiftLevel(Integer riftLevel) {
        this.riftLevel = riftLevel;
    }

    public Long getRiftTime() {
        return riftTime;
    }

    public void setRiftTime(Long riftTime) {
        this.riftTime = riftTime;
    }

    @Override
    public String toString() {
        return "{" +
                "rank=" + rank +
                ", achievementPoints=" + achievementPoints +
                ", riftLevel=" + riftLevel +
                ", riftTime=" + riftTime +
                ", completedTime=" + completedTime +
                ", battleTag=" + battleTag +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.rank);
        dest.writeValue(this.achievementPoints);
        dest.writeValue(this.riftLevel);
        dest.writeValue(this.riftTime);
        dest.writeValue(this.completedTime);
        dest.writeParcelable(this.battleTag, flags);
    }

    public RowData() {
    }

    protected RowData(Parcel in) {
        this.rank = (Integer) in.readValue(Integer.class.getClassLoader());
        this.achievementPoints = (Integer) in.readValue(Integer.class.getClassLoader());
        this.riftLevel = (Integer) in.readValue(Integer.class.getClassLoader());
        this.riftTime = (Long) in.readValue(Long.class.getClassLoader());
        this.completedTime = (Long) in.readValue(Long.class.getClassLoader());
        this.battleTag = in.readParcelable(BattleTag.class.getClassLoader());
    }

    public static final Parcelable.Creator<RowData> CREATOR = new Parcelable.Creator<RowData>() {
        @Override
        public RowData createFromParcel(Parcel source) {
            return new RowData(source);
        }

        @Override
        public RowData[] newArray(int size) {
            return new RowData[size];
        }
    };
}