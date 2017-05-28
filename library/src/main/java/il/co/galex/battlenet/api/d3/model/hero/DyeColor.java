package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class DyeColor implements Parcelable {

    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "{" +
                "item=" + item +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.item, flags);
    }

    public DyeColor() {
    }

    protected DyeColor(Parcel in) {
        this.item = in.readParcelable(Item.class.getClassLoader());
    }

    public static final Parcelable.Creator<DyeColor> CREATOR = new Parcelable.Creator<DyeColor>() {
        @Override
        public DyeColor createFromParcel(Parcel source) {
            return new DyeColor(source);
        }

        @Override
        public DyeColor[] newArray(int size) {
            return new DyeColor[size];
        }
    };
}
