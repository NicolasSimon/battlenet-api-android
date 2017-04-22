package il.co.galex.battlenet.api.d3.model.hero;

/**
 * @author Alexander Gherschon
 */

public class FollowerItems {

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
}
