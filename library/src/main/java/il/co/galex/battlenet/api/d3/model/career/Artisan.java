package il.co.galex.battlenet.api.d3.model.career;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class Artisan implements Parcelable {

    private String slug;
    private int level;
    private int stepCurrent;
    private int stepMax;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStepCurrent() {
        return stepCurrent;
    }

    public void setStepCurrent(int stepCurrent) {
        this.stepCurrent = stepCurrent;
    }

    public int getStepMax() {
        return stepMax;
    }

    public void setStepMax(int stepMax) {
        this.stepMax = stepMax;
    }

    @Override
    public String toString() {
        return "{" +
                "slug='" + slug + '\'' +
                ", level=" + level +
                ", stepCurrent=" + stepCurrent +
                ", stepMax=" + stepMax +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.slug);
        dest.writeInt(this.level);
        dest.writeInt(this.stepCurrent);
        dest.writeInt(this.stepMax);
    }

    public Artisan() {
    }

    protected Artisan(Parcel in) {
        this.slug = in.readString();
        this.level = in.readInt();
        this.stepCurrent = in.readInt();
        this.stepMax = in.readInt();
    }

    public static final Parcelable.Creator<Artisan> CREATOR = new Parcelable.Creator<Artisan>() {
        @Override
        public Artisan createFromParcel(Parcel source) {
            return new Artisan(source);
        }

        @Override
        public Artisan[] newArray(int size) {
            return new Artisan[size];
        }
    };
}
