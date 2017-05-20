package il.co.galex.battlenet.api.d3.model.leaderboard;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;

/**
 * @author Alexander Gherschon
 */

public class RowData {

    private Integer rank;
    private Integer achievementPoints;
    private Integer riftLevel;
    private Long riftTime;
    private Long completedTime;
    private BattleTag battleTag;

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getAchievementPoints() {
        return achievementPoints;
    }

    public void setAchievementPoints(Integer achievementPoints) {
        this.achievementPoints = achievementPoints;
    }

    public Long getCompletedTime() {
        return completedTime;
    }

    public void setCompletedTime(Long completedTime) {
        this.completedTime = completedTime;
    }

    public BattleTag getBattleTag() {
        return battleTag;
    }

    public void setBattleTag(BattleTag battleTag) {
        this.battleTag = battleTag;
    }

    public Integer getRiftLevel() {
        return riftLevel;
    }

    public void setRiftLevel(Integer riftLevel) {
        this.riftLevel = riftLevel;
    }

    public Long getRiftTime() {
        return riftTime;
    }

    public void setRiftTime(Long riftTime) {
        this.riftTime = riftTime;
    }

    @Override
    public String toString() {
        return "{" +
                "rank=" + rank +
                ", achievementPoints=" + achievementPoints +
                ", riftLevel=" + riftLevel +
                ", riftTime=" + riftTime +
                ", completedTime=" + completedTime +
                ", battleTag=" + battleTag +
                '}';
    }
}