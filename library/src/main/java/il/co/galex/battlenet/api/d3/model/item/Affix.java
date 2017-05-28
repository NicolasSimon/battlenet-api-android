package il.co.galex.battlenet.api.d3.model.item;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class Affix implements Parcelable {

    private Attributes attributes;
    private AttributesRaw attributesRaw;

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public AttributesRaw getAttributesRaw() {
        return attributesRaw;
    }

    public void setAttributesRaw(AttributesRaw attributesRaw) {
        this.attributesRaw = attributesRaw;
    }

    @Override
    public String toString() {
        return "{" +
                "attributes=" + attributes +
                ", attributesRaw=" + attributesRaw +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.attributes, flags);
        dest.writeParcelable(this.attributesRaw, flags);
    }

    public Affix() {
    }

    protected Affix(Parcel in) {
        this.attributes = in.readParcelable(Attributes.class.getClassLoader());
        this.attributesRaw = in.readParcelable(AttributesRaw.class.getClassLoader());
    }

    public static final Parcelable.Creator<Affix> CREATOR = new Parcelable.Creator<Affix>() {
        @Override
        public Affix createFromParcel(Parcel source) {
            return new Affix(source);
        }

        @Override
        public Affix[] newArray(int size) {
            return new Affix[size];
        }
    };
}
