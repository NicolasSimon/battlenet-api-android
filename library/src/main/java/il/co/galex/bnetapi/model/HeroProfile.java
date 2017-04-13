package il.co.galex.bnetapi.model;

import com.google.gson.annotations.SerializedName;

import java.util.HashMap;

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
                '}';
    }
}
