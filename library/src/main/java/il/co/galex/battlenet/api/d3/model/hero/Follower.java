package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class Follower implements Parcelable {

    private String slug;
    private int level;
    private FollowerItems items;
    private FollowerStats stats;
    private List<FollowerSkill> skills;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public FollowerItems getItems() {
        return items;
    }

    public void setItems(FollowerItems items) {
        this.items = items;
    }

    public FollowerStats getStats() {
        return stats;
    }

    public void setStats(FollowerStats stats) {
        this.stats = stats;
    }

    public List<FollowerSkill> getSkills() {
        return skills;
    }

    public void setSkills(List<FollowerSkill> skills) {
        this.skills = skills;
    }

    @Override
    public String toString() {
        return "{" +
                "slug='" + slug + '\'' +
                ", level=" + level +
                ", items=" + items +
                ", stats=" + stats +
                ", skills=" + skills +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.slug);
        dest.writeInt(this.level);
        dest.writeParcelable(this.items, flags);
        dest.writeParcelable(this.stats, flags);
        dest.writeList(this.skills);
    }

    public Follower() {
    }

    protected Follower(Parcel in) {
        this.slug = in.readString();
        this.level = in.readInt();
        this.items = in.readParcelable(FollowerItems.class.getClassLoader());
        this.stats = in.readParcelable(FollowerStats.class.getClassLoader());
        this.skills = new ArrayList<FollowerSkill>();
        in.readList(this.skills, FollowerSkill.class.getClassLoader());
    }

    public static final Parcelable.Creator<Follower> CREATOR = new Parcelable.Creator<Follower>() {
        @Override
        public Follower createFromParcel(Parcel source) {
            return new Follower(source);
        }

        @Override
        public Follower[] newArray(int size) {
            return new Follower[size];
        }
    };
}
