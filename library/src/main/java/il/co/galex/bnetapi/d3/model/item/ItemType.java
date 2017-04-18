package il.co.galex.bnetapi.d3.model.item;

/**
 * @author Alexander Gherschon
 */

public class ItemType {

    private Boolean twoHanded;
    private String id;

    public Boolean getTwoHanded() {
        return twoHanded;
    }

    public void setTwoHanded(Boolean twoHanded) {
        this.twoHanded = twoHanded;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                "twoHanded=" + twoHanded +
                ", id='" + id + '\'' +
                '}';
    }
}

