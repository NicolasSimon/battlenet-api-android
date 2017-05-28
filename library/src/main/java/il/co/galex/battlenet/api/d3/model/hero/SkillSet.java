package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class SkillSet implements Parcelable {

    private List<ActiveSkill> active;
    private List<PassiveSkill> passive;

    public List<ActiveSkill> getActive() {
        return active;
    }

    public void setActive(List<ActiveSkill> active) {
        this.active = active;
    }

    public List<PassiveSkill> getPassive() {
        return passive;
    }

    public void setPassive(List<PassiveSkill> passive) {
        this.passive = passive;
    }

    @Override
    public String toString() {
        return "{" +
                "active=" + active +
                ", passive=" + passive +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.active);
        dest.writeTypedList(this.passive);
    }

    public SkillSet() {
    }

    protected SkillSet(Parcel in) {
        this.active = in.createTypedArrayList(ActiveSkill.CREATOR);
        this.passive = in.createTypedArrayList(PassiveSkill.CREATOR);
    }

    public static final Parcelable.Creator<SkillSet> CREATOR = new Parcelable.Creator<SkillSet>() {
        @Override
        public SkillSet createFromParcel(Parcel source) {
            return new SkillSet(source);
        }

        @Override
        public SkillSet[] newArray(int size) {
            return new SkillSet[size];
        }
    };
}
