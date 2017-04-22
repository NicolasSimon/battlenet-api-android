package il.co.galex.battlenet.api.d3.model.hero;

/**
 * @author Alexander Gherschon
 */

public class FollowerSkill {

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
