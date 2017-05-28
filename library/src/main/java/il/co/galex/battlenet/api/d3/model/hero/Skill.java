package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author Alexander Gherschon
 */

public class Skill implements Parcelable {

    private String slug;
    private String name;
    private String icon;

    private int level;
    private String categorySlug;
    private String tooltipUrl;
    private String description;
    private String simpleDescription;
    private String skillCalcId;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCategorySlug() {
        return categorySlug;
    }

    public void setCategorySlug(String categorySlug) {
        this.categorySlug = categorySlug;
    }

    public String getTooltipUrl() {
        return tooltipUrl;
    }

    public void setTooltipUrl(String tooltipUrl) {
        this.tooltipUrl = tooltipUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSimpleDescription() {
        return simpleDescription;
    }

    public void setSimpleDescription(String simpleDescription) {
        this.simpleDescription = simpleDescription;
    }

    public String getSkillCalcId() {
        return skillCalcId;
    }

    public void setSkillCalcId(String skillCalcId) {
        this.skillCalcId = skillCalcId;
    }

    @Override
    public String toString() {
        return "{" +
                "slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", level=" + level +
                ", categorySlug='" + categorySlug + '\'' +
                ", tooltipUrl='" + tooltipUrl + '\'' +
                ", description='" + description + '\'' +
                ", simpleDescription='" + simpleDescription + '\'' +
                ", skillCalcId='" + skillCalcId + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.slug);
        dest.writeString(this.name);
        dest.writeString(this.icon);
        dest.writeInt(this.level);
        dest.writeString(this.categorySlug);
        dest.writeString(this.tooltipUrl);
        dest.writeString(this.description);
        dest.writeString(this.simpleDescription);
        dest.writeString(this.skillCalcId);
    }

    public Skill() {
    }

    protected Skill(Parcel in) {
        this.slug = in.readString();
        this.name = in.readString();
        this.icon = in.readString();
        this.level = in.readInt();
        this.categorySlug = in.readString();
        this.tooltipUrl = in.readString();
        this.description = in.readString();
        this.simpleDescription = in.readString();
        this.skillCalcId = in.readString();
    }

    public static final Parcelable.Creator<Skill> CREATOR = new Parcelable.Creator<Skill>() {
        @Override
        public Skill createFromParcel(Parcel source) {
            return new Skill(source);
        }

        @Override
        public Skill[] newArray(int size) {
            return new Skill[size];
        }
    };
}
