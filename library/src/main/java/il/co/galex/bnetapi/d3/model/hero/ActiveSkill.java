package il.co.galex.bnetapi.d3.model.hero;

/**
 * @author Alexander Gherschon
 */

public class ActiveSkill {

    private Skill skill;
    private Rune rune;

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    public Rune getRune() {
        return rune;
    }

    public void setRune(Rune rune) {
        this.rune = rune;
    }

    @Override
    public String toString() {
        return "{" +
                "skill=" + skill +
                ", rune=" + rune +
                '}';
    }
}
