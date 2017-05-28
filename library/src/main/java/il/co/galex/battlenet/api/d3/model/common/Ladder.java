package il.co.galex.battlenet.api.d3.model.common;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

class Ladder implements Parcelable {

    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "{" +
                "href='" + href + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.href);
    }

    public Ladder() {
    }

    protected Ladder(Parcel in) {
        this.href = in.readString();
    }

    public static final Parcelable.Creator<Ladder> CREATOR = new Parcelable.Creator<Ladder>() {
        @Override
        public Ladder createFromParcel(Parcel source) {
            return new Ladder(source);
        }

        @Override
        public Ladder[] newArray(int size) {
            return new Ladder[size];
        }
    };
}
