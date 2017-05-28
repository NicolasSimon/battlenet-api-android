package il.co.galex.battlenet.api.d3.model.common;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class TooltipParams implements Parcelable {

    public static final String SEPARATOR = "/";

    private String prefix;
    private String id;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullFormat() {
        return prefix + SEPARATOR + id;
    }

    @Override
    public String toString() {
        return "{" +
                "prefix='" + prefix + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.prefix);
        dest.writeString(this.id);
    }

    public TooltipParams() {
    }

    protected TooltipParams(Parcel in) {
        this.prefix = in.readString();
        this.id = in.readString();
    }

    public static final Parcelable.Creator<TooltipParams> CREATOR = new Parcelable.Creator<TooltipParams>() {
        @Override
        public TooltipParams createFromParcel(Parcel source) {
            return new TooltipParams(source);
        }

        @Override
        public TooltipParams[] newArray(int size) {
            return new TooltipParams[size];
        }
    };
}
