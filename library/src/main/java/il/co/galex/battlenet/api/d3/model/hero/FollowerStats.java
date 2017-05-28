package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class FollowerStats implements Parcelable {

    private int experienceBonus;
    private int goldFind;
    private int magicFind;

    public int getExperienceBonus() {
        return experienceBonus;
    }

    public void setExperienceBonus(int experienceBonus) {
        this.experienceBonus = experienceBonus;
    }

    public int getGoldFind() {
        return goldFind;
    }

    public void setGoldFind(int goldFind) {
        this.goldFind = goldFind;
    }

    public int getMagicFind() {
        return magicFind;
    }

    public void setMagicFind(int magicFind) {
        this.magicFind = magicFind;
    }

    @Override
    public String toString() {
        return "{" +
                "experienceBonus=" + experienceBonus +
                ", goldFind=" + goldFind +
                ", magicFind=" + magicFind +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.experienceBonus);
        dest.writeInt(this.goldFind);
        dest.writeInt(this.magicFind);
    }

    public FollowerStats() {
    }

    protected FollowerStats(Parcel in) {
        this.experienceBonus = in.readInt();
        this.goldFind = in.readInt();
        this.magicFind = in.readInt();
    }

    public static final Parcelable.Creator<FollowerStats> CREATOR = new Parcelable.Creator<FollowerStats>() {
        @Override
        public FollowerStats createFromParcel(Parcel source) {
            return new FollowerStats(source);
        }

        @Override
        public FollowerStats[] newArray(int size) {
            return new FollowerStats[size];
        }
    };
}
