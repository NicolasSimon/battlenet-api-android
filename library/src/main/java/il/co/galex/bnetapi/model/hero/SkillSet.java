package il.co.galex.bnetapi.model.hero;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class SkillSet {

    public List<ActiveSkill> active;
    public List<PassiveSkill> passive;

    public List<ActiveSkill> getActive() {
        return active;
    }

    public void setActive(List<ActiveSkill> active) {
        this.active = active;
    }

    public List<PassiveSkill> getPassive() {
        return passive;
    }

    public void setPassive(List<PassiveSkill> passive) {
        this.passive = passive;
    }

    @Override
    public String toString() {
        return "{" +
                "active=" + active +
                ", passive=" + passive +
                '}';
    }
}
