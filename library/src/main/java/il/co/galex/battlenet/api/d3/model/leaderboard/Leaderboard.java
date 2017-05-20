package il.co.galex.battlenet.api.d3.model.leaderboard;

/**
 * @author Alexander Gherschon
 */

public enum Leaderboard {

    ACHIEVEMENT_POINTS("achievement-points"),
    RIFT_HARDCORE_BARBARIAN("rift-hardcore-barbarian"),
    RIFT_BARBARIAN("rift-barbarian"),
    RIFT_HARDCORE_CRUSADER("rift-hardcore-crusader"),
    RIFT_CRUSADER("rift-crusader"),
    RIFT_HARDCORE_DH("rift-hardcore-dh"),
    RIFT_DH("rift-dh"),
    RIFT_HARDCORE_MONK("rift-hardcore-monk"),
    RIFT_MONK("rift-monk"),
    RIFT_HARDCORE_WD("rift-hardcore-wd"),
    RIFT_WD("rift-wd"),
    RIFT_HARDCORE_WIZARD("rift-hardcore-wizard"),
    RIFT_WIZARD("rift-wizard"),
    RIFT_HARDCORE_TEAM_2("rift-hardcore-team-2"),
    RIFT_TEAM_2("rift-team-2"),
    RIFT_HARDCORE_TEAM_3("rift-hardcore-team-3"),
    RIFT_TEAM_3("rift-team-3"),
    RIFT_HARDCORE_TEAM_4("rift-hardcore-team-4"),
    RIFT_TEAM_4("rift-team-4");

    private String value;

    Leaderboard(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "{" +
                "value='" + value + '\'' +
                '}';
    }
}
