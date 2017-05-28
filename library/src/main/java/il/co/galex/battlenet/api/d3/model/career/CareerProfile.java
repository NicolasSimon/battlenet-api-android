package il.co.galex.battlenet.api.d3.model.career;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.HashMap;
import java.util.List;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;
import il.co.galex.battlenet.api.d3.model.common.HeroClass;
import il.co.galex.battlenet.api.d3.model.common.Mob;

/**
 * @author Alexander Gherschon
 */

public class CareerProfile implements Parcelable {

    private BattleTag battleTag;
    private long paragonLevel;
    private long paragonLevelHardcore;
    private long paragonLevelSeason;
    private long paragonLevelSeasonHardcore;
    private String guildName;
    private List<Hero> heroes;
    private long lastHeroPlayed;
    private long lastHeroUpdated;
    private HashMap<Mob, Long> kills;
    private long highestHardcoreLevel;
    private HashMap<HeroClass, Float> timePlayed;
    private HashMap<Act, Boolean> progression;
    private List<Hero> fallenHeroes;
    private Artisan blacksmith;
    private Artisan jeweler;
    private Artisan mystic;
    private Artisan blacksmithHardcore;
    private Artisan jewelerHardcore;
    private Artisan mysticHardcore;
    private HashMap<String, SeasonProfile> seasonalProfiles;

    public BattleTag getBattleTag() {
        return battleTag;
    }

    public void setBattleTag(BattleTag battleTag) {
        this.battleTag = battleTag;
    }

    public long getParagonLevel() {
        return paragonLevel;
    }

    public void setParagonLevel(long paragonLevel) {
        this.paragonLevel = paragonLevel;
    }

    public long getParagonLevelHardcore() {
        return paragonLevelHardcore;
    }

    public void setParagonLevelHardcore(long paragonLevelHardcore) {
        this.paragonLevelHardcore = paragonLevelHardcore;
    }

    public long getParagonLevelSeason() {
        return paragonLevelSeason;
    }

    public void setParagonLevelSeason(long paragonLevelSeason) {
        this.paragonLevelSeason = paragonLevelSeason;
    }

    public long getParagonLevelSeasonHardcore() {
        return paragonLevelSeasonHardcore;
    }

    public void setParagonLevelSeasonHardcore(long paragonLevelSeasonHardcore) {
        this.paragonLevelSeasonHardcore = paragonLevelSeasonHardcore;
    }

    public String getGuildName() {
        return guildName;
    }

    public void setGuildName(String guildName) {
        this.guildName = guildName;
    }

    public List<Hero> getHeroes() {
        return heroes;
    }

    public void setHeroes(List<Hero> heroes) {
        this.heroes = heroes;
    }

    public long getLastHeroPlayed() {
        return lastHeroPlayed;
    }

    public void setLastHeroPlayed(long lastHeroPlayed) {
        this.lastHeroPlayed = lastHeroPlayed;
    }

    public long getLastHeroUpdated() {
        return lastHeroUpdated;
    }

    public void setLastHeroUpdated(long lastHeroUpdated) {
        this.lastHeroUpdated = lastHeroUpdated;
    }

    public HashMap<Mob, Long> getKills() {
        return kills;
    }

    public void setKills(HashMap<Mob, Long> kills) {
        this.kills = kills;
    }

    public long getHighestHardcoreLevel() {
        return highestHardcoreLevel;
    }

    public void setHighestHardcoreLevel(long highestHardcoreLevel) {
        this.highestHardcoreLevel = highestHardcoreLevel;
    }

    public HashMap<HeroClass, Float> getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(HashMap<HeroClass, Float> timePlayed) {
        this.timePlayed = timePlayed;
    }

    public HashMap<Act, Boolean> getProgression() {
        return progression;
    }

    public void setProgression(HashMap<Act, Boolean> progression) {
        this.progression = progression;
    }

    public List<Hero> getFallenHeroes() {
        return fallenHeroes;
    }

    public void setFallenHeroes(List<Hero> fallenHeroes) {
        this.fallenHeroes = fallenHeroes;
    }

    public Artisan getBlacksmith() {
        return blacksmith;
    }

    public void setBlacksmith(Artisan blacksmith) {
        this.blacksmith = blacksmith;
    }

    public Artisan getJeweler() {
        return jeweler;
    }

    public void setJeweler(Artisan jeweler) {
        this.jeweler = jeweler;
    }

    public Artisan getMystic() {
        return mystic;
    }

    public void setMystic(Artisan mystic) {
        this.mystic = mystic;
    }

    public Artisan getBlacksmithHardcore() {
        return blacksmithHardcore;
    }

    public void setBlacksmithHardcore(Artisan blacksmithHardcore) {
        this.blacksmithHardcore = blacksmithHardcore;
    }

    public Artisan getJewelerHardcore() {
        return jewelerHardcore;
    }

    public void setJewelerHardcore(Artisan jewelerHardcore) {
        this.jewelerHardcore = jewelerHardcore;
    }

    public Artisan getMysticHardcore() {
        return mysticHardcore;
    }

    public void setMysticHardcore(Artisan mysticHardcore) {
        this.mysticHardcore = mysticHardcore;
    }

    public HashMap<String, SeasonProfile> getSeasonalProfiles() {
        return seasonalProfiles;
    }

    public void setSeasonalProfiles(HashMap<String, SeasonProfile> seasonalProfiles) {
        this.seasonalProfiles = seasonalProfiles;
    }

    @Override
    public String toString() {
        return "{" +
                "battleTag='" + battleTag + '\'' +
                ", paragonLevel=" + paragonLevel +
                ", paragonLevelHardcore=" + paragonLevelHardcore +
                ", paragonLevelSeason=" + paragonLevelSeason +
                ", paragonLevelSeasonHardcore=" + paragonLevelSeasonHardcore +
                ", guildName='" + guildName + '\'' +
                ", heroes=" + heroes +
                ", lastHeroPlayed=" + lastHeroPlayed +
                ", lastHeroUpdated=" + lastHeroUpdated +
                ", kills=" + kills +
                ", highestHardcoreLevel=" + highestHardcoreLevel +
                ", timePlayed=" + timePlayed +
                ", progression=" + progression +
                ", fallenHeroes=" + fallenHeroes +
                ", blacksmith=" + blacksmith +
                ", jeweler=" + jeweler +
                ", mystic=" + mystic +
                ", blacksmithHardcore=" + blacksmithHardcore +
                ", jewelerHardcore=" + jewelerHardcore +
                ", mysticHardcore=" + mysticHardcore +
                ", seasonalProfiles=" + seasonalProfiles +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.battleTag, flags);
        dest.writeLong(this.paragonLevel);
        dest.writeLong(this.paragonLevelHardcore);
        dest.writeLong(this.paragonLevelSeason);
        dest.writeLong(this.paragonLevelSeasonHardcore);
        dest.writeString(this.guildName);
        dest.writeTypedList(this.heroes);
        dest.writeLong(this.lastHeroPlayed);
        dest.writeLong(this.lastHeroUpdated);
        dest.writeSerializable(this.kills);
        dest.writeLong(this.highestHardcoreLevel);
        dest.writeSerializable(this.timePlayed);
        dest.writeSerializable(this.progression);
        dest.writeTypedList(this.fallenHeroes);
        dest.writeParcelable(this.blacksmith, flags);
        dest.writeParcelable(this.jeweler, flags);
        dest.writeParcelable(this.mystic, flags);
        dest.writeParcelable(this.blacksmithHardcore, flags);
        dest.writeParcelable(this.jewelerHardcore, flags);
        dest.writeParcelable(this.mysticHardcore, flags);
        dest.writeSerializable(this.seasonalProfiles);
    }

    public CareerProfile() {
    }

    protected CareerProfile(Parcel in) {
        this.battleTag = in.readParcelable(BattleTag.class.getClassLoader());
        this.paragonLevel = in.readLong();
        this.paragonLevelHardcore = in.readLong();
        this.paragonLevelSeason = in.readLong();
        this.paragonLevelSeasonHardcore = in.readLong();
        this.guildName = in.readString();
        this.heroes = in.createTypedArrayList(Hero.CREATOR);
        this.lastHeroPlayed = in.readLong();
        this.lastHeroUpdated = in.readLong();
        this.kills = (HashMap<Mob, Long>) in.readSerializable();
        this.highestHardcoreLevel = in.readLong();
        this.timePlayed = (HashMap<HeroClass, Float>) in.readSerializable();
        this.progression = (HashMap<Act, Boolean>) in.readSerializable();
        this.fallenHeroes = in.createTypedArrayList(Hero.CREATOR);
        this.blacksmith = in.readParcelable(Artisan.class.getClassLoader());
        this.jeweler = in.readParcelable(Artisan.class.getClassLoader());
        this.mystic = in.readParcelable(Artisan.class.getClassLoader());
        this.blacksmithHardcore = in.readParcelable(Artisan.class.getClassLoader());
        this.jewelerHardcore = in.readParcelable(Artisan.class.getClassLoader());
        this.mysticHardcore = in.readParcelable(Artisan.class.getClassLoader());
        this.seasonalProfiles = (HashMap<String, SeasonProfile>) in.readSerializable();
    }

    public static final Parcelable.Creator<CareerProfile> CREATOR = new Parcelable.Creator<CareerProfile>() {
        @Override
        public CareerProfile createFromParcel(Parcel source) {
            return new CareerProfile(source);
        }

        @Override
        public CareerProfile[] newArray(int size) {
            return new CareerProfile[size];
        }
    };
}
