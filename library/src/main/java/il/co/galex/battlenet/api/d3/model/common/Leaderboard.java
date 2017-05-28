package il.co.galex.battlenet.api.d3.model.common;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * @author Alexander Gherschon
 */

public class Leaderboard implements Parcelable {

    private Integer teamSize;
    private Boolean hardcore;

    @SerializedName("hero_class_string")
    private HeroClass heroClass;
    private Ladder ladder;

    public Integer getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(Integer teamSize) {
        this.teamSize = teamSize;
    }

    public Boolean getHardcore() {
        return hardcore;
    }

    public void setHardcore(Boolean hardcore) {
        this.hardcore = hardcore;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    public Ladder getLadder() {
        return ladder;
    }

    public void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }

    @Override
    public String toString() {
        return "{" +
                "teamSize=" + teamSize +
                ", hardcore=" + hardcore +
                ", heroClass=" + heroClass +
                ", ladder=" + ladder +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.teamSize);
        dest.writeValue(this.hardcore);
        dest.writeInt(this.heroClass == null ? -1 : this.heroClass.ordinal());
        dest.writeParcelable(this.ladder, flags);
    }

    public Leaderboard() {
    }

    protected Leaderboard(Parcel in) {
        this.teamSize = (Integer) in.readValue(Integer.class.getClassLoader());
        this.hardcore = (Boolean) in.readValue(Boolean.class.getClassLoader());
        int tmpHeroClass = in.readInt();
        this.heroClass = tmpHeroClass == -1 ? null : HeroClass.values()[tmpHeroClass];
        this.ladder = in.readParcelable(Ladder.class.getClassLoader());
    }

    public static final Parcelable.Creator<Leaderboard> CREATOR = new Parcelable.Creator<Leaderboard>() {
        @Override
        public Leaderboard createFromParcel(Parcel source) {
            return new Leaderboard(source);
        }

        @Override
        public Leaderboard[] newArray(int size) {
            return new Leaderboard[size];
        }
    };
}
