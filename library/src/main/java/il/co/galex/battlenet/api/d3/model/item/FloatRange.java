package il.co.galex.battlenet.api.d3.model.item;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class FloatRange implements Parcelable {

    private Float min;
    private Float max;

    public Float getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public Float getMax() {
        return max;
    }

    public void setMax(Float max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.min);
        dest.writeValue(this.max);
    }

    public FloatRange() {
    }

    protected FloatRange(Parcel in) {
        this.min = (Float) in.readValue(Float.class.getClassLoader());
        this.max = (Float) in.readValue(Float.class.getClassLoader());
    }

    public static final Parcelable.Creator<FloatRange> CREATOR = new Parcelable.Creator<FloatRange>() {
        @Override
        public FloatRange createFromParcel(Parcel source) {
            return new FloatRange(source);
        }

        @Override
        public FloatRange[] newArray(int size) {
            return new FloatRange[size];
        }
    };
}
