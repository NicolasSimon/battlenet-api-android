package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class Followers implements Parcelable {

    private Follower templar;
    private Follower scoundrel;
    private Follower enchantress;

    public Follower getTemplar() {
        return templar;
    }

    public void setTemplar(Follower templar) {
        this.templar = templar;
    }

    public Follower getScoundrel() {
        return scoundrel;
    }

    public void setScoundrel(Follower scoundrel) {
        this.scoundrel = scoundrel;
    }

    public Follower getEnchantress() {
        return enchantress;
    }

    public void setEnchantress(Follower enchantress) {
        this.enchantress = enchantress;
    }

    @Override
    public String toString() {
        return "{" +
                "templar=" + templar +
                ", scoundrel=" + scoundrel +
                ", enchantress=" + enchantress +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.templar, flags);
        dest.writeParcelable(this.scoundrel, flags);
        dest.writeParcelable(this.enchantress, flags);
    }

    public Followers() {
    }

    protected Followers(Parcel in) {
        this.templar = in.readParcelable(Follower.class.getClassLoader());
        this.scoundrel = in.readParcelable(Follower.class.getClassLoader());
        this.enchantress = in.readParcelable(Follower.class.getClassLoader());
    }

    public static final Parcelable.Creator<Followers> CREATOR = new Parcelable.Creator<Followers>() {
        @Override
        public Followers createFromParcel(Parcel source) {
            return new Followers(source);
        }

        @Override
        public Followers[] newArray(int size) {
            return new Followers[size];
        }
    };
}
