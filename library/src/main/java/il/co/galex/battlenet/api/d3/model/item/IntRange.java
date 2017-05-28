package il.co.galex.battlenet.api.d3.model.item;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class IntRange implements Parcelable {

    private Integer min;
    private Integer max;

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
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

    public IntRange() {
    }

    protected IntRange(Parcel in) {
        this.min = (Integer) in.readValue(Integer.class.getClassLoader());
        this.max = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<IntRange> CREATOR = new Parcelable.Creator<IntRange>() {
        @Override
        public IntRange createFromParcel(Parcel source) {
            return new IntRange(source);
        }

        @Override
        public IntRange[] newArray(int size) {
            return new IntRange[size];
        }
    };
}
