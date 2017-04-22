package il.co.galex.battlenet.api.d3.model.item;

/**
 * @author Alexander Gherschon
 */

public class IntRange {

    private Integer min;
    private Integer max;

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
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
