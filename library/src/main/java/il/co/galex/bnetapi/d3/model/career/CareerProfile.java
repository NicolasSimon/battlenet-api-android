package il.co.galex.bnetapi.d3.model.career;

import java.util.HashMap;
import java.util.List;

import il.co.galex.bnetapi.d3.model.common.HeroClass;
import il.co.galex.bnetapi.d3.model.common.Mob;

/**
 * @author Alexander Gherschon
 */

public class CareerProfile {

    private String battleTag;
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

    public String getBattleTag() {
        return battleTag;
    }

    public void setBattleTag(String battleTag) {
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
}
