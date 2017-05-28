package il.co.galex.battlenet.api.d3.model.common;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class Links implements Parcelable {

    private Link self;

    public Link getSelf() {
        return self;
    }

    public void setSelf(Link self) {
        this.self = self;
    }

    @Override
    public String toString() {
        return "{" +
                "self=" + self +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.self, flags);
    }

    public Links() {
    }

    protected Links(Parcel in) {
        this.self = in.readParcelable(Link.class.getClassLoader());
    }

    public static final Parcelable.Creator<Links> CREATOR = new Parcelable.Creator<Links>() {
        @Override
        public Links createFromParcel(Parcel source) {
            return new Links(source);
        }

        @Override
        public Links[] newArray(int size) {
            return new Links[size];
        }
    };
}
