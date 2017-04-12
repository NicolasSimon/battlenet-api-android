package il.co.galex.bnetapi.model;

import java.util.HashMap;

/**
 * @author Alexander Gherschon
 */

public class SeasonProfile {

    private int seasonId;
    private long paragonLevel;
    private long paragonLevelHardcore;
    private HashMap<String, String> kills;
    private HashMap<String, String> timePlayed;
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

    public HashMap<String, String> getKills() {
        return kills;
    }

    public void setKills(HashMap<String, String> kills) {
        this.kills = kills;
    }

    public HashMap<String, String> getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(HashMap<String, String> timePlayed) {
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
