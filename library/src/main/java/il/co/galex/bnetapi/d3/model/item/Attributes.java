package il.co.galex.bnetapi.d3.model.item;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class Attributes {

    private List<Attribute> primary;
    private List<Attribute> secondary;
    private List<Attribute> passive;

    public List<Attribute> getPrimary() {
        return primary;
    }

    public void setPrimary(List<Attribute> primary) {
        this.primary = primary;
    }

    public List<Attribute> getSecondary() {
        return secondary;
    }

    public void setSecondary(List<Attribute> secondary) {
        this.secondary = secondary;
    }

    public List<Attribute> getPassive() {
        return passive;
    }

    public void setPassive(List<Attribute> passive) {
        this.passive = passive;
    }

    @Override
    public String toString() {
        return "{" +
                "primary=" + primary +
                ", secondary=" + secondary +
                ", passive=" + passive +
                '}';
    }
}
