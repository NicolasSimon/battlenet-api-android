package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class FollowerSkill implements Parcelable {

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

    public FollowerSkill() {
    }

    protected FollowerSkill(Parcel in) {
        this.skill = in.readParcelable(Skill.class.getClassLoader());
    }

    public static final Parcelable.Creator<FollowerSkill> CREATOR = new Parcelable.Creator<FollowerSkill>() {
        @Override
        public FollowerSkill createFromParcel(Parcel source) {
            return new FollowerSkill(source);
        }

        @Override
        public FollowerSkill[] newArray(int size) {
            return new FollowerSkill[size];
        }
    };
}
