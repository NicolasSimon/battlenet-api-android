package il.co.galex.bnetapi.d3.model.hero;

/**
 * @author Alexander Gherschon
 */

public class FollowerStats {

    private int experienceBonus;
    private int goldFind;
    private int magicFind;

    public int getExperienceBonus() {
        return experienceBonus;
    }

    public void setExperienceBonus(int experienceBonus) {
        this.experienceBonus = experienceBonus;
    }

    public int getGoldFind() {
        return goldFind;
    }

    public void setGoldFind(int goldFind) {
        this.goldFind = goldFind;
    }

    public int getMagicFind() {
        return magicFind;
    }

    public void setMagicFind(int magicFind) {
        this.magicFind = magicFind;
    }

    @Override
    public String toString() {
        return "{" +
                "experienceBonus=" + experienceBonus +
                ", goldFind=" + goldFind +
                ", magicFind=" + magicFind +
                '}';
    }
}
