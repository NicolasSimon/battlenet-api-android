package il.co.galex.battlenet.api.d3.model.item;

/**
 * @author Alexander Gherschon
 */

public class Attribute {

    private String color;
    private String text;
    private String affixType;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAffixType() {
        return affixType;
    }

    public void setAffixType(String affixType) {
        this.affixType = affixType;
    }

    @Override
    public String toString() {
        return "{" +
                "color='" + color + '\'' +
                ", text='" + text + '\'' +
                ", affixType='" + affixType + '\'' +
                '}';
    }
}
