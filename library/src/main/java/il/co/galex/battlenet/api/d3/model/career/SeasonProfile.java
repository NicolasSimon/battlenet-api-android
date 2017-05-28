package il.co.galex.battlenet.api.d3.model.career;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

import il.co.galex.battlenet.api.d3.model.common.HeroClass;
import il.co.galex.battlenet.api.d3.model.common.Mob;

/**
 * @author Alexander Gherschon
 */

public class SeasonProfile implements Parcelable {

    private int seasonId;
    private long paragonLevel;
    private long paragonLevelHardcore;
    private HashMap<Mob, Long> kills;
    private HashMap<HeroClass, Float> timePlayed;
    private long highestHardcoreLevel;

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
    }

    public long getParagonLevel() {
        return paragonLevel;
    }

    public void setParagonLevel(long paragonLevel) {
        this.paragonLevel = paragonLevel;
    }

    public long getParagonLevelHardcore() {
        return paragonLevelHardcore;
    }

    public void setParagonLevelHardcore(long paragonLevelHardcore) {
        this.paragonLevelHardcore = paragonLevelHardcore;
    }

    public HashMap<Mob, Long> getKills() {
        return kills;
    }

    public void setKills(HashMap<Mob, Long> kills) {
        this.kills = kills;
    }

    public HashMap<HeroClass, Float> getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(HashMap<HeroClass, Float> timePlayed) {
        this.timePlayed = timePlayed;
    }

    public long getHighestHardcoreLevel() {
        return highestHardcoreLevel;
    }

    public void setHighestHardcoreLevel(long highestHardcoreLevel) {
        this.highestHardcoreLevel = highestHardcoreLevel;
    }

    @Override
    public String toString() {
        return "{" +
                "seasonId=" + seasonId +
                ", paragonLevel=" + paragonLevel +
                ", paragonLevelHardcore=" + paragonLevelHardcore +
                ", kills=" + kills +
                ", timePlayed=" + timePlayed +
                ", highestHardcoreLevel=" + highestHardcoreLevel +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.seasonId);
        dest.writeLong(this.paragonLevel);
        dest.writeLong(this.paragonLevelHardcore);
        dest.writeSerializable(this.kills);
        dest.writeSerializable(this.timePlayed);
        dest.writeLong(this.highestHardcoreLevel);
    }

    public SeasonProfile() {
    }

    protected SeasonProfile(Parcel in) {
        this.seasonId = in.readInt();
        this.paragonLevel = in.readLong();
        this.paragonLevelHardcore = in.readLong();
        this.kills = (HashMap<Mob, Long>) in.readSerializable();
        this.timePlayed = (HashMap<HeroClass, Float>) in.readSerializable();
        this.highestHardcoreLevel = in.readLong();
    }

    public static final Parcelable.Creator<SeasonProfile> CREATOR = new Parcelable.Creator<SeasonProfile>() {
        @Override
        public SeasonProfile createFromParcel(Parcel source) {
            return new SeasonProfile(source);
        }

        @Override
        public SeasonProfile[] newArray(int size) {
            return new SeasonProfile[size];
        }
    };
}
