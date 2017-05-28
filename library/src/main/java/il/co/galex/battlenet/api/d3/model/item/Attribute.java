package il.co.galex.battlenet.api.d3.model.item;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class Attribute implements Parcelable {

    private String color;
    private String text;
    private String affixType;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAffixType() {
        return affixType;
    }

    public void setAffixType(String affixType) {
        this.affixType = affixType;
    }

    @Override
    public String toString() {
        return "{" +
                "color='" + color + '\'' +
                ", text='" + text + '\'' +
                ", affixType='" + affixType + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.color);
        dest.writeString(this.text);
        dest.writeString(this.affixType);
    }

    public Attribute() {
    }

    protected Attribute(Parcel in) {
        this.color = in.readString();
        this.text = in.readString();
        this.affixType = in.readString();
    }

    public static final Parcelable.Creator<Attribute> CREATOR = new Parcelable.Creator<Attribute>() {
        @Override
        public Attribute createFromParcel(Parcel source) {
            return new Attribute(source);
        }

        @Override
        public Attribute[] newArray(int size) {
            return new Attribute[size];
        }
    };
}
