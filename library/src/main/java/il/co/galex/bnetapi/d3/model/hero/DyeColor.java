package il.co.galex.bnetapi.d3.model.hero;

/**
 * @author Alexander Gherschon
 */

public class DyeColor {

    private Item item;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "{" +
                "item=" + item +
                '}';
    }
}
