package il.co.galex.battlenet.api.d3.model.item;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class ItemType implements Parcelable {

    private Boolean twoHanded;
    private String id;

    public Boolean getTwoHanded() {
        return twoHanded;
    }

    public void setTwoHanded(Boolean twoHanded) {
        this.twoHanded = twoHanded;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                "twoHanded=" + twoHanded +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.twoHanded);
        dest.writeString(this.id);
    }

    public ItemType() {
    }

    protected ItemType(Parcel in) {
        this.twoHanded = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.id = in.readString();
    }

    public static final Parcelable.Creator<ItemType> CREATOR = new Parcelable.Creator<ItemType>() {
        @Override
        public ItemType createFromParcel(Parcel source) {
            return new ItemType(source);
        }

        @Override
        public ItemType[] newArray(int size) {
            return new ItemType[size];
        }
    };
}

