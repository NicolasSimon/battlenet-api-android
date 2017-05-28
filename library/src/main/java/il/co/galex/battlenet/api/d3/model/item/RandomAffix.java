package il.co.galex.battlenet.api.d3.model.item;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class RandomAffix implements Parcelable {

    private List<Affix> oneOf;

    public List<Affix> getOneOf() {
        return oneOf;
    }

    public void setOneOf(List<Affix> oneOf) {
        this.oneOf = oneOf;
    }

    @Override
    public String toString() {
        return "{" +
                "oneOf=" + oneOf +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeTypedList(this.oneOf);
    }

    public RandomAffix() {
    }

    protected RandomAffix(Parcel in) {
        this.oneOf = in.createTypedArrayList(Affix.CREATOR);
    }

    public static final Parcelable.Creator<RandomAffix> CREATOR = new Parcelable.Creator<RandomAffix>() {
        @Override
        public RandomAffix createFromParcel(Parcel source) {
            return new RandomAffix(source);
        }

        @Override
        public RandomAffix[] newArray(int size) {
            return new RandomAffix[size];
        }
    };
}
