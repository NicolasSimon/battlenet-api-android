package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class ActProgression implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.completed);
        dest.writeList(this.completedQuests);
    }

    public ActProgression() {
    }

    protected ActProgression(Parcel in) {
        this.completed = (Boolean) in.readValue(Boolean.class.getClassLoader());
        this.completedQuests = new ArrayList<CompletedQuest>();
        in.readList(this.completedQuests, CompletedQuest.class.getClassLoader());
    }

    public static final Parcelable.Creator<ActProgression> CREATOR = new Parcelable.Creator<ActProgression>() {
        @Override
        public ActProgression createFromParcel(Parcel source) {
            return new ActProgression(source);
        }

        @Override
        public ActProgression[] newArray(int size) {
            return new ActProgression[size];
        }
    };
}
