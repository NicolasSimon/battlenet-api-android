package il.co.galex.battlenet.api.d3.model.season;

/**
 * @author Alexander Gherschon
 */

public class Leaderboard {

    private Ladder ladder;

    public Ladder getLadder() {
        return ladder;
    }

    public void setLadder(Ladder ladder) {
        this.ladder = ladder;
    }

    @Override
    public String toString() {
        return "{" +
                "ladder=" + ladder +
                '}';
    }
}
