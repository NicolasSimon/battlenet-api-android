package il.co.galex.battlenet.api.d3.model.common;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class BattleTag implements Parcelable {

    private static final String PUBLIC_SEPARATOR = "#";
    private String name;
    private int number;

    public BattleTag(String publicBattleTag) {

        int i = publicBattleTag.indexOf(PUBLIC_SEPARATOR);

        this.name = publicBattleTag.substring(0, i);
        this.number = Integer.parseInt(publicBattleTag.substring(i + 1, publicBattleTag.length()));
    }

    public BattleTag() {
    }

    public BattleTag(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getApiFormat() {

        return name + "-" + number;
    }

    public String getPublicFormat() {

        return name + PUBLIC_SEPARATOR + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BattleTag)) return false;

        BattleTag battleTag = (BattleTag) o;

        return number == battleTag.number && name.equals(battleTag.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + number;
        return result;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.number);
    }

    protected BattleTag(Parcel in) {
        this.name = in.readString();
        this.number = in.readInt();
    }

    public static final Parcelable.Creator<BattleTag> CREATOR = new Parcelable.Creator<BattleTag>() {
        @Override
        public BattleTag createFromParcel(Parcel source) {
            return new BattleTag(source);
        }

        @Override
        public BattleTag[] newArray(int size) {
            return new BattleTag[size];
        }
    };
}
