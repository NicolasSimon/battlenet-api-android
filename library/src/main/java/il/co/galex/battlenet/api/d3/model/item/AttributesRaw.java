package il.co.galex.battlenet.api.d3.model.item;

import java.util.HashMap;

/**
 * @author Alexander Gherschon
 */

public class AttributesRaw {

    private HashMap<String, FloatRange> values;

    public HashMap<String, FloatRange> getValues() {
        return values;
    }

    public void setValues(HashMap<String, FloatRange> values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return "AttributesRaw{" +
                "values=" + values +
                '}';
    }
}
