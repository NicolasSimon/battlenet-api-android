package il.co.galex.battlenet.api.d3.model.item;

/**
 * @author Alexander Gherschon
 */

public class FloatRange {

    private Float min;
    private Float max;

    public Float getMin() {
        return min;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public Float getMax() {
        return max;
    }

    public void setMax(Float max) {
        this.max = max;
    }

    @Override
    public String toString() {
        return "{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }
}
