package il.co.galex.bnetapi.d3.model.item;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class RandomAffix {

    private List<Affix> oneOf;

    public List<Affix> getOneOf() {
        return oneOf;
    }

    public void setOneOf(List<Affix> oneOf) {
        this.oneOf = oneOf;
    }

    @Override
    public String toString() {
        return "{" +
                "oneOf=" + oneOf +
                '}';
    }
}
