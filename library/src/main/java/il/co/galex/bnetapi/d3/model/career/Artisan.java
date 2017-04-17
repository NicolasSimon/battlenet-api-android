package il.co.galex.bnetapi.d3.model.career;

/**
 * @author Alexander Gherschon
 */

public class Artisan {

    private String slug;
    private int level;
    private int stepCurrent;
    private int stepMax;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getStepCurrent() {
        return stepCurrent;
    }

    public void setStepCurrent(int stepCurrent) {
        this.stepCurrent = stepCurrent;
    }

    public int getStepMax() {
        return stepMax;
    }

    public void setStepMax(int stepMax) {
        this.stepMax = stepMax;
    }

    @Override
    public String toString() {
        return "{" +
                "slug='" + slug + '\'' +
                ", level=" + level +
                ", stepCurrent=" + stepCurrent +
                ", stepMax=" + stepMax +
                '}';
    }
}
