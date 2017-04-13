package il.co.galex.bnetapi.model;

/**
 * @author Alexander Gherschon
 */

public class PassiveSkill {

    private Skill skill;

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "{" +
                "skill=" + skill +
                '}';
    }
}
