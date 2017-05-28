package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

import il.co.galex.battlenet.api.d3.model.common.TooltipParams;

/**
 * @author Alexander Gherschon
 */

public class Rune implements Parcelable {

    private String slug;
    private String type;
    private String name;
    private int level;
    private String description;
    private String simpleDescription;
    private TooltipParams tooltipParams;
    private String skillCalcId;
    private int order;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
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

    public TooltipParams getTooltipParams() {
        return tooltipParams;
    }

    public void setTooltipParams(TooltipParams tooltipParams) {
        this.tooltipParams = tooltipParams;
    }

    public String getSkillCalcId() {
        return skillCalcId;
    }

    public void setSkillCalcId(String skillCalcId) {
        this.skillCalcId = skillCalcId;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "{" +
                "slug='" + slug + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", description='" + description + '\'' +
                ", simpleDescription='" + simpleDescription + '\'' +
                ", tooltipParams='" + tooltipParams + '\'' +
                ", skillCalcId='" + skillCalcId + '\'' +
                ", order=" + order +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.slug);
        dest.writeString(this.type);
        dest.writeString(this.name);
        dest.writeInt(this.level);
        dest.writeString(this.description);
        dest.writeString(this.simpleDescription);
        dest.writeParcelable(this.tooltipParams, flags);
        dest.writeString(this.skillCalcId);
        dest.writeInt(this.order);
    }

    public Rune() {
    }

    protected Rune(Parcel in) {
        this.slug = in.readString();
        this.type = in.readString();
        this.name = in.readString();
        this.level = in.readInt();
        this.description = in.readString();
        this.simpleDescription = in.readString();
        this.tooltipParams = in.readParcelable(TooltipParams.class.getClassLoader());
        this.skillCalcId = in.readString();
        this.order = in.readInt();
    }

    public static final Parcelable.Creator<Rune> CREATOR = new Parcelable.Creator<Rune>() {
        @Override
        public Rune createFromParcel(Parcel source) {
            return new Rune(source);
        }

        @Override
        public Rune[] newArray(int size) {
            return new Rune[size];
        }
    };
}
