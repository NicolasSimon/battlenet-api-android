package il.co.galex.bnetapi.d3.model.hero;

import java.util.List;

import il.co.galex.bnetapi.d3.model.common.TooltipParams;

/**
 * @author Alexander Gherschon
 */

public class Item {

    private String id;
    private String name;
    private String icon;
    private String displayColor;
    private TooltipParams tooltipParams;
    private TransmogItem transmogItem;
    private List<String> setItemsEquipped;
    private DyeColor dyeColor;

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

    public TooltipParams getTooltipParams() {
        return tooltipParams;
    }

    public void setTooltipParams(TooltipParams tooltipParams) {
        this.tooltipParams = tooltipParams;
    }

    public TransmogItem getTransmogItem() {
        return transmogItem;
    }

    public void setTransmogItem(TransmogItem transmogItem) {
        this.transmogItem = transmogItem;
    }

    public List<String> getSetItemsEquipped() {
        return setItemsEquipped;
    }

    public void setSetItemsEquipped(List<String> setItemsEquipped) {
        this.setItemsEquipped = setItemsEquipped;
    }

    public DyeColor getDyeColor() {
        return dyeColor;
    }

    public void setDyeColor(DyeColor dyeColor) {
        this.dyeColor = dyeColor;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", displayColor='" + displayColor + '\'' +
                ", tooltipParams='" + tooltipParams + '\'' +
                ", transmogItem=" + transmogItem +
                ", setItemsEquipped=" + setItemsEquipped +
                ", dyeColor=" + dyeColor +
                '}';
    }
}

