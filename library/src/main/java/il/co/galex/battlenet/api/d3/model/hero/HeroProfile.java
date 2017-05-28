package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import il.co.galex.battlenet.api.d3.model.common.Gender;
import il.co.galex.battlenet.api.d3.model.common.HeroClass;
import il.co.galex.battlenet.api.d3.model.common.Mob;

/**
 * @author Alexander Gherschon
 */

public class HeroProfile implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(this.id);
        dest.writeString(this.name);
        dest.writeInt(this.heroClass == null ? -1 : this.heroClass.ordinal());
        dest.writeInt(this.gender == null ? -1 : this.gender.ordinal());
        dest.writeLong(this.level);
        dest.writeSerializable(this.kills);
        dest.writeLong(this.paragonLevel);
        dest.writeByte(this.hardcore ? (byte) 1 : (byte) 0);
        dest.writeByte(this.seasonal ? (byte) 1 : (byte) 0);
        dest.writeInt(this.seasonCreated);
        dest.writeParcelable(this.skillSet, flags);
        dest.writeParcelable(this.items, flags);
        dest.writeParcelable(this.followers, flags);
        dest.writeList(this.legendaryPowers);
        dest.writeParcelable(this.stats, flags);
        dest.writeParcelable(this.progression, flags);
        dest.writeValue(this.dead);
        dest.writeValue(this.lastUpdated);
    }

    public HeroProfile() {
    }

    protected HeroProfile(Parcel in) {
        this.id = in.readLong();
        this.name = in.readString();
        int tmpHeroClass = in.readInt();
        this.heroClass = tmpHeroClass == -1 ? null : HeroClass.values()[tmpHeroClass];
        int tmpGender = in.readInt();
        this.gender = tmpGender == -1 ? null : Gender.values()[tmpGender];
        this.level = in.readLong();
        this.kills = (HashMap<Mob, Long>) in.readSerializable();
        this.paragonLevel = in.readLong();
        this.hardcore = in.readByte() != 0;
        this.seasonal = in.readByte() != 0;
        this.seasonCreated = in.readInt();
        this.skillSet = in.readParcelable(SkillSet.class.getClassLoader());
        this.items = in.readParcelable(HeroItems.class.getClassLoader());
        this.followers = in.readParcelable(Followers.class.getClassLoader());
        this.legendaryPowers = new ArrayList<Item>();
        in.readList(this.legendaryPowers, Item.class.getClassLoader());
        this.stats = in.readParcelable(HeroStats.class.getClassLoader());
        this.progression = in.readParcelable(Progression.class.getClassLoader());
        this.dead = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.lastUpdated = (Long) in.readValue(Long.class.getClassLoader());
    }

    public static final Parcelable.Creator<HeroProfile> CREATOR = new Parcelable.Creator<HeroProfile>() {
        @Override
        public HeroProfile createFromParcel(Parcel source) {
            return new HeroProfile(source);
        }

        @Override
        public HeroProfile[] newArray(int size) {
            return new HeroProfile[size];
        }
    };
}
