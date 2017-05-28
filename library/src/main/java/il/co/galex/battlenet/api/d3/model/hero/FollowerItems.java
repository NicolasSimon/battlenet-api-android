package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class FollowerItems implements Parcelable {

    private Item mainHand;
    private Item offHand;
    private Item rightFinger;
    private Item leftFinger;
    private Item neck;
    private Item special;

    public Item getMainHand() {
        return mainHand;
    }

    public void setMainHand(Item mainHand) {
        this.mainHand = mainHand;
    }

    public Item getOffHand() {
        return offHand;
    }

    public void setOffHand(Item offHand) {
        this.offHand = offHand;
    }

    public Item getRightFinger() {
        return rightFinger;
    }

    public void setRightFinger(Item rightFinger) {
        this.rightFinger = rightFinger;
    }

    public Item getLeftFinger() {
        return leftFinger;
    }

    public void setLeftFinger(Item leftFinger) {
        this.leftFinger = leftFinger;
    }

    public Item getNeck() {
        return neck;
    }

    public void setNeck(Item neck) {
        this.neck = neck;
    }

    public Item getSpecial() {
        return special;
    }

    public void setSpecial(Item special) {
        this.special = special;
    }

    @Override
    public String toString() {
        return "{" +
                "mainHand=" + mainHand +
                ", offHand=" + offHand +
                ", rightFinger=" + rightFinger +
                ", leftFinger=" + leftFinger +
                ", neck=" + neck +
                ", special=" + special +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.mainHand, flags);
        dest.writeParcelable(this.offHand, flags);
        dest.writeParcelable(this.rightFinger, flags);
        dest.writeParcelable(this.leftFinger, flags);
        dest.writeParcelable(this.neck, flags);
        dest.writeParcelable(this.special, flags);
    }

    public FollowerItems() {
    }

    protected FollowerItems(Parcel in) {
        this.mainHand = in.readParcelable(Item.class.getClassLoader());
        this.offHand = in.readParcelable(Item.class.getClassLoader());
        this.rightFinger = in.readParcelable(Item.class.getClassLoader());
        this.leftFinger = in.readParcelable(Item.class.getClassLoader());
        this.neck = in.readParcelable(Item.class.getClassLoader());
        this.special = in.readParcelable(Item.class.getClassLoader());
    }

    public static final Parcelable.Creator<FollowerItems> CREATOR = new Parcelable.Creator<FollowerItems>() {
        @Override
        public FollowerItems createFromParcel(Parcel source) {
            return new FollowerItems(source);
        }

        @Override
        public FollowerItems[] newArray(int size) {
            return new FollowerItems[size];
        }
    };
}
