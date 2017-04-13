package il.co.galex.bnetapi.model.hero;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;
import java.util.List;

import il.co.galex.bnetapi.model.common.Gender;
import il.co.galex.bnetapi.model.common.HeroClass;
import il.co.galex.bnetapi.model.common.Mob;

/**
 * @author Alexander Gherschon
 */

public class HeroProfile {

    private long id;
    private String name;

    @SerializedName("class")
    private HeroClass heroClass;

    private Gender gender;
    private long level;
    private HashMap<Mob, Long> kills;
    private long paragonLevel;
    private boolean hardcore;
    private boolean seasonal;
    private int seasonCreated;

    @SerializedName("skills")
    private SkillSet skillSet;

    private HeroItems items;
    private Followers followers;
    private List<Item> legendaryPowers;
    private HeroStats stats;
    private Progression progression;
    private Boolean dead;

    @SerializedName("last-updated")
    private Long lastUpdated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public long getLevel() {
        return level;
    }

    public void setLevel(long level) {
        this.level = level;
    }

    public HashMap<Mob, Long> getKills() {
        return kills;
    }

    public void setKills(HashMap<Mob, Long> kills) {
        this.kills = kills;
    }

    public long getParagonLevel() {
        return paragonLevel;
    }

    public void setParagonLevel(long paragonLevel) {
        this.paragonLevel = paragonLevel;
    }

    public boolean isHardcore() {
        return hardcore;
    }

    public void setHardcore(boolean hardcore) {
        this.hardcore = hardcore;
    }

    public boolean isSeasonal() {
        return seasonal;
    }

    public void setSeasonal(boolean seasonal) {
        this.seasonal = seasonal;
    }

    public int getSeasonCreated() {
        return seasonCreated;
    }

    public void setSeasonCreated(int seasonCreated) {
        this.seasonCreated = seasonCreated;
    }

    public SkillSet getSkillSet() {
        return skillSet;
    }

    public void setSkillSet(SkillSet skillSet) {
        this.skillSet = skillSet;
    }

    public HeroItems getItems() {
        return items;
    }

    public void setItems(HeroItems items) {
        this.items = items;
    }

    public Followers getFollowers() {
        return followers;
    }

    public void setFollowers(Followers followers) {
        this.followers = followers;
    }

    public List<Item> getLegendaryPowers() {
        return legendaryPowers;
    }

    public void setLegendaryPowers(List<Item> legendaryPowers) {
        this.legendaryPowers = legendaryPowers;
    }

    public HeroStats getStats() {
        return stats;
    }

    public void setStats(HeroStats stats) {
        this.stats = stats;
    }

    public Progression getProgression() {
        return progression;
    }

    public void setProgression(Progression progression) {
        this.progression = progression;
    }

    public Boolean getDead() {
        return dead;
    }

    public void setDead(Boolean dead) {
        this.dead = dead;
    }

    public Long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", heroClass=" + heroClass +
                ", gender=" + gender +
                ", level=" + level +
                ", kills=" + kills +
                ", paragonLevel=" + paragonLevel +
                ", hardcore=" + hardcore +
                ", seasonal=" + seasonal +
                ", seasonCreated=" + seasonCreated +
                ", skillSet=" + skillSet +
                ", items=" + items +
                ", followers=" + followers +
                ", legendaryPowers=" + legendaryPowers +
                ", stats=" + stats +
                ", progression=" + progression +
                ", dead=" + dead +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
