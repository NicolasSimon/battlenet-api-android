package il.co.galex.battlenet.api.d3.model.item;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class Attributes implements Parcelable {

    private List<Attribute> primary;
    private List<Attribute> secondary;
    private List<Attribute> passive;

    public List<Attribute> getPrimary() {
        return primary;
    }

    public void setPrimary(List<Attribute> primary) {
        this.primary = primary;
    }

    public List<Attribute> getSecondary() {
        return secondary;
    }

    public void setSecondary(List<Attribute> secondary) {
        this.secondary = secondary;
    }

    public List<Attribute> getPassive() {
        return passive;
    }

    public void setPassive(List<Attribute> passive) {
        this.passive = passive;
    }

    @Override
    public String toString() {
        return "{" +
                "primary=" + primary +
                ", secondary=" + secondary +
                ", passive=" + passive +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.primary);
        dest.writeTypedList(this.secondary);
        dest.writeTypedList(this.passive);
    }

    public Attributes() {
    }

    protected Attributes(Parcel in) {
        this.primary = in.createTypedArrayList(Attribute.CREATOR);
        this.secondary = in.createTypedArrayList(Attribute.CREATOR);
        this.passive = in.createTypedArrayList(Attribute.CREATOR);
    }

    public static final Parcelable.Creator<Attributes> CREATOR = new Parcelable.Creator<Attributes>() {
        @Override
        public Attributes createFromParcel(Parcel source) {
            return new Attributes(source);
        }

        @Override
        public Attributes[] newArray(int size) {
            return new Attributes[size];
        }
    };
}
