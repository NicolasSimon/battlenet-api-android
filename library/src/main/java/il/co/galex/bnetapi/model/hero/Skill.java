package il.co.galex.bnetapi.model.hero;

/**
 * @author Alexander Gherschon
 */

public class Skill {

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
}
