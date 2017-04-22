package il.co.galex.battlenet.api.d3.model.hero;

import il.co.galex.battlenet.api.d3.model.common.TooltipParams;

/**
 * @author Alexander Gherschon
 */

public class Rune {

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
}
