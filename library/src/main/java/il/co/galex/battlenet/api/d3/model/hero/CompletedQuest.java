package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class CompletedQuest implements Parcelable {

    private String slug;
    private String name;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.slug);
        dest.writeString(this.name);
    }

    public CompletedQuest() {
    }

    protected CompletedQuest(Parcel in) {
        this.slug = in.readString();
        this.name = in.readString();
    }

    public static final Parcelable.Creator<CompletedQuest> CREATOR = new Parcelable.Creator<CompletedQuest>() {
        @Override
        public CompletedQuest createFromParcel(Parcel source) {
            return new CompletedQuest(source);
        }

        @Override
        public CompletedQuest[] newArray(int size) {
            return new CompletedQuest[size];
        }
    };
}
