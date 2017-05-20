package il.co.galex.battlenet.api.d3.model.common;

import com.google.gson.annotations.SerializedName;

/**
 * @author Alexander Gherschon
 */

public class Leaderboard {

    private Integer teamSize;
    private Boolean hardcore;

    @SerializedName("hero_class_string")
    private HeroClass heroClass;
    private Ladder ladder;

    public Integer getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(Integer teamSize) {
        this.teamSize = teamSize;
    }

    public Boolean getHardcore() {
        return hardcore;
    }

    public void setHardcore(Boolean hardcore) {
        this.hardcore = hardcore;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    public Ladder getLadder() {
        return ladder;
    }

    public void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }

    @Override
    public String toString() {
        return "{" +
                "teamSize=" + teamSize +
                ", hardcore=" + hardcore +
                ", heroClass=" + heroClass +
                ", ladder=" + ladder +
                '}';
    }
}
