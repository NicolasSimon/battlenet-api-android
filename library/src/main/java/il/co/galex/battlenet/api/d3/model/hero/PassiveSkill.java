package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class PassiveSkill implements Parcelable {

    private Skill skill;

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "{" +
                "skill=" + skill +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.skill, flags);
    }

    public PassiveSkill() {
    }

    protected PassiveSkill(Parcel in) {
        this.skill = in.readParcelable(Skill.class.getClassLoader());
    }

    public static final Parcelable.Creator<PassiveSkill> CREATOR = new Parcelable.Creator<PassiveSkill>() {
        @Override
        public PassiveSkill createFromParcel(Parcel source) {
            return new PassiveSkill(source);
        }

        @Override
        public PassiveSkill[] newArray(int size) {
            return new PassiveSkill[size];
        }
    };
}
