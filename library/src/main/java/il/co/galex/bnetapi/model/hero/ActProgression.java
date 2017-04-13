package il.co.galex.bnetapi.model.hero;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class ActProgression {

    private Boolean completed;
    private List<CompletedQuest> completedQuests;

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public List<CompletedQuest> getCompletedQuests() {
        return completedQuests;
    }

    public void setCompletedQuests(List<CompletedQuest> completedQuests) {
        this.completedQuests = completedQuests;
    }

    @Override
    public String toString() {
        return "{" +
                "completed=" + completed +
                ", completedQuests=" + completedQuests +
                '}';
    }
}
