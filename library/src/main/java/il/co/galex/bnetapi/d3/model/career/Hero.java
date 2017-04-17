package il.co.galex.bnetapi.d3.model.career;

import com.google.gson.annotations.SerializedName;

import il.co.galex.bnetapi.d3.model.common.Gender;
import il.co.galex.bnetapi.d3.model.common.HeroClass;

/**
 * @author Alexander Gherschon
 */

public class Hero {

    private long id;
    private String name;

    @SerializedName("class")
    private HeroClass heroClass;

    private Gender gender;
    private int level;
    private int paragonLevel;
    private boolean hardcore;
    private boolean seasonal;
    private boolean dead;

    @SerializedName("last-updated")
    private long lastUpdated;

    public Hero() {
    }

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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getParagonLevel() {
        return paragonLevel;
    }

    public void setParagonLevel(int paragonLevel) {
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

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public long getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(long lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", heroClass='" + heroClass + '\'' +
                ", gender=" + gender.name() +
                ", level=" + level +
                ", paragonLevel=" + paragonLevel +
                ", hardcore=" + hardcore +
                ", seasonal=" + seasonal +
                ", dead=" + dead +
                ", lastUpdated=" + lastUpdated +
                '}';
    }
}
