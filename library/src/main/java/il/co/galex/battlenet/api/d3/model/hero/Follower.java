package il.co.galex.battlenet.api.d3.model.hero;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class Follower {

    private String slug;
    private int level;
    private FollowerItems items;
    private FollowerStats stats;
    private List<FollowerSkill> skills;

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

    public FollowerItems getItems() {
        return items;
    }

    public void setItems(FollowerItems items) {
        this.items = items;
    }

    public FollowerStats getStats() {
        return stats;
    }

    public void setStats(FollowerStats stats) {
        this.stats = stats;
    }

    public List<FollowerSkill> getSkills() {
        return skills;
    }

    public void setSkills(List<FollowerSkill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "{" +
                "slug='" + slug + '\'' +
                ", level=" + level +
                ", items=" + items +
                ", stats=" + stats +
                ", skills=" + skills +
                '}';
    }
}
