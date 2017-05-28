package il.co.galex.battlenet.api.d3.model.item;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;

/**
 * @author Alexander Gherschon
 */

public class AttributesRaw implements Parcelable {

    private HashMap<String, FloatRange> values;

    public HashMap<String, FloatRange> getValues() {
        return values;
    }

    public void setValues(HashMap<String, FloatRange> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "AttributesRaw{" +
                "values=" + values +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeSerializable(this.values);
    }

    public AttributesRaw() {
    }

    protected AttributesRaw(Parcel in) {
        this.values = (HashMap<String, FloatRange>) in.readSerializable();
    }

    public static final Parcelable.Creator<AttributesRaw> CREATOR = new Parcelable.Creator<AttributesRaw>() {
        @Override
        public AttributesRaw createFromParcel(Parcel source) {
            return new AttributesRaw(source);
        }

        @Override
        public AttributesRaw[] newArray(int size) {
            return new AttributesRaw[size];
        }
    };
}
