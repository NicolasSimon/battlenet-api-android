package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class HeroItems implements Parcelable {

    private Item mainHand;
    private Item offHand;
    private Item rightFinger;
    private Item leftFinger;
    private Item neck;
    private Item waist;
    private Item torso;
    private Item feet;
    private Item hands;
    private Item shoulders;
    private Item legs;
    private Item bracers;
    private Item head;

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

    public Item getWaist() {
        return waist;
    }

    public void setWaist(Item waist) {
        this.waist = waist;
    }

    public Item getTorso() {
        return torso;
    }

    public void setTorso(Item torso) {
        this.torso = torso;
    }

    public Item getFeet() {
        return feet;
    }

    public void setFeet(Item feet) {
        this.feet = feet;
    }

    public Item getHands() {
        return hands;
    }

    public void setHands(Item hands) {
        this.hands = hands;
    }

    public Item getShoulders() {
        return shoulders;
    }

    public void setShoulders(Item shoulders) {
        this.shoulders = shoulders;
    }

    public Item getLegs() {
        return legs;
    }

    public void setLegs(Item legs) {
        this.legs = legs;
    }

    public Item getBracers() {
        return bracers;
    }

    public void setBracers(Item bracers) {
        this.bracers = bracers;
    }

    public Item getHead() {
        return head;
    }

    public void setHead(Item head) {
        this.head = head;
    }

    @Override
    public String toString() {
        return "{" +
                "mainHand=" + mainHand +
                ", offHand=" + offHand +
                ", rightFinger=" + rightFinger +
                ", leftFinger=" + leftFinger +
                ", neck=" + neck +
                ", waist=" + waist +
                ", torso=" + torso +
                ", feet=" + feet +
                ", hands=" + hands +
                ", shoulders=" + shoulders +
                ", legs=" + legs +
                ", bracers=" + bracers +
                ", head=" + head +
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
        dest.writeParcelable(this.waist, flags);
        dest.writeParcelable(this.torso, flags);
        dest.writeParcelable(this.feet, flags);
        dest.writeParcelable(this.hands, flags);
        dest.writeParcelable(this.shoulders, flags);
        dest.writeParcelable(this.legs, flags);
        dest.writeParcelable(this.bracers, flags);
        dest.writeParcelable(this.head, flags);
    }

    public HeroItems() {
    }

    protected HeroItems(Parcel in) {
        this.mainHand = in.readParcelable(Item.class.getClassLoader());
        this.offHand = in.readParcelable(Item.class.getClassLoader());
        this.rightFinger = in.readParcelable(Item.class.getClassLoader());
        this.leftFinger = in.readParcelable(Item.class.getClassLoader());
        this.neck = in.readParcelable(Item.class.getClassLoader());
        this.waist = in.readParcelable(Item.class.getClassLoader());
        this.torso = in.readParcelable(Item.class.getClassLoader());
        this.feet = in.readParcelable(Item.class.getClassLoader());
        this.hands = in.readParcelable(Item.class.getClassLoader());
        this.shoulders = in.readParcelable(Item.class.getClassLoader());
        this.legs = in.readParcelable(Item.class.getClassLoader());
        this.bracers = in.readParcelable(Item.class.getClassLoader());
        this.head = in.readParcelable(Item.class.getClassLoader());
    }

    public static final Parcelable.Creator<HeroItems> CREATOR = new Parcelable.Creator<HeroItems>() {
        @Override
        public HeroItems createFromParcel(Parcel source) {
            return new HeroItems(source);
        }

        @Override
        public HeroItems[] newArray(int size) {
            return new HeroItems[size];
        }
    };
}
