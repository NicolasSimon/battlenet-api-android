package il.co.galex.bnetapi.d3.model.hero;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class TransmogItem {

    private String id;
    private String name;
    private String icon;
    private String displayColor;
    private String tooltipParams;
    private List<String> setItemsEquipped;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDisplayColor() {
        return displayColor;
    }

    public void setDisplayColor(String displayColor) {
        this.displayColor = displayColor;
    }

    public String getTooltipParams() {
        return tooltipParams;
    }

    public void setTooltipParams(String tooltipParams) {
        this.tooltipParams = tooltipParams;
    }

    public List<String> getSetItemsEquipped() {
        return setItemsEquipped;
    }

    public void setSetItemsEquipped(List<String> setItemsEquipped) {
        this.setItemsEquipped = setItemsEquipped;
    }
}
