package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class Progression implements Parcelable {

    private ActProgression act1;
    private ActProgression act2;
    private ActProgression act3;
    private ActProgression act4;
    private ActProgression act5;

    public ActProgression getAct1() {
        return act1;
    }

    public void setAct1(ActProgression act1) {
        this.act1 = act1;
    }

    public ActProgression getAct2() {
        return act2;
    }

    public void setAct2(ActProgression act2) {
        this.act2 = act2;
    }

    public ActProgression getAct3() {
        return act3;
    }

    public void setAct3(ActProgression act3) {
        this.act3 = act3;
    }

    public ActProgression getAct4() {
        return act4;
    }

    public void setAct4(ActProgression act4) {
        this.act4 = act4;
    }

    public ActProgression getAct5() {
        return act5;
    }

    public void setAct5(ActProgression act5) {
        this.act5 = act5;
    }

    @Override
    public String toString() {
        return "{" +
                "act1=" + act1 +
                ", act2=" + act2 +
                ", act3=" + act3 +
                ", act4=" + act4 +
                ", act5=" + act5 +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.act1, flags);
        dest.writeParcelable(this.act2, flags);
        dest.writeParcelable(this.act3, flags);
        dest.writeParcelable(this.act4, flags);
        dest.writeParcelable(this.act5, flags);
    }

    public Progression() {
    }

    protected Progression(Parcel in) {
        this.act1 = in.readParcelable(ActProgression.class.getClassLoader());
        this.act2 = in.readParcelable(ActProgression.class.getClassLoader());
        this.act3 = in.readParcelable(ActProgression.class.getClassLoader());
        this.act4 = in.readParcelable(ActProgression.class.getClassLoader());
        this.act5 = in.readParcelable(ActProgression.class.getClassLoader());
    }

    public static final Parcelable.Creator<Progression> CREATOR = new Parcelable.Creator<Progression>() {
        @Override
        public Progression createFromParcel(Parcel source) {
            return new Progression(source);
        }

        @Override
        public Progression[] newArray(int size) {
            return new Progression[size];
        }
    };
}
