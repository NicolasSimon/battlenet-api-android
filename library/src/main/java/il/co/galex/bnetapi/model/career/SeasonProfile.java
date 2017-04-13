package il.co.galex.bnetapi.model.career;

import java.util.HashMap;

import il.co.galex.bnetapi.model.common.HeroClass;
import il.co.galex.bnetapi.model.common.Mob;

/**
 * @author Alexander Gherschon
 */

public class SeasonProfile {

    private int seasonId;
    private long paragonLevel;
    private long paragonLevelHardcore;
    private HashMap<Mob, Long> kills;
    private HashMap<HeroClass, Float> timePlayed;
    private long highestHardcoreLevel;

    public int getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(int seasonId) {
        this.seasonId = seasonId;
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

    public HashMap<Mob, Long> getKills() {
        return kills;
    }

    public void setKills(HashMap<Mob, Long> kills) {
        this.kills = kills;
    }

    public HashMap<HeroClass, Float> getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(HashMap<HeroClass, Float> timePlayed) {
        this.timePlayed = timePlayed;
    }

    public long getHighestHardcoreLevel() {
        return highestHardcoreLevel;
    }

    public void setHighestHardcoreLevel(long highestHardcoreLevel) {
        this.highestHardcoreLevel = highestHardcoreLevel;
    }

    @Override
    public String toString() {
        return "{" +
                "seasonId=" + seasonId +
                ", paragonLevel=" + paragonLevel +
                ", paragonLevelHardcore=" + paragonLevelHardcore +
                ", kills=" + kills +
                ", timePlayed=" + timePlayed +
                ", highestHardcoreLevel=" + highestHardcoreLevel +
                '}';
    }
}
