package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class ActiveSkill implements Parcelable {

    private Skill skill;
    private Rune rune;

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Rune getRune() {
        return rune;
    }

    public void setRune(Rune rune) {
        this.rune = rune;
    }

    @Override
    public String toString() {
        return "{" +
                "skill=" + skill +
                ", rune=" + rune +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.skill, flags);
        dest.writeParcelable(this.rune, flags);
    }

    public ActiveSkill() {
    }

    protected ActiveSkill(Parcel in) {
        this.skill = in.readParcelable(Skill.class.getClassLoader());
        this.rune = in.readParcelable(Rune.class.getClassLoader());
    }

    public static final Parcelable.Creator<ActiveSkill> CREATOR = new Parcelable.Creator<ActiveSkill>() {
        @Override
        public ActiveSkill createFromParcel(Parcel source) {
            return new ActiveSkill(source);
        }

        @Override
        public ActiveSkill[] newArray(int size) {
            return new ActiveSkill[size];
        }
    };
}
