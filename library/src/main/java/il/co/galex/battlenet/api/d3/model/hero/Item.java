package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import il.co.galex.battlenet.api.d3.model.common.TooltipParams;

/**
 * @author Alexander Gherschon
 */

public class Item implements Parcelable {

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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.icon);
        dest.writeString(this.displayColor);
        dest.writeParcelable(this.tooltipParams, flags);
        dest.writeParcelable(this.transmogItem, flags);
        dest.writeStringList(this.setItemsEquipped);
        dest.writeParcelable(this.dyeColor, flags);
    }

    public Item() {
    }

    protected Item(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.icon = in.readString();
        this.displayColor = in.readString();
        this.tooltipParams = in.readParcelable(TooltipParams.class.getClassLoader());
        this.transmogItem = in.readParcelable(TransmogItem.class.getClassLoader());
        this.setItemsEquipped = in.createStringArrayList();
        this.dyeColor = in.readParcelable(DyeColor.class.getClassLoader());
    }

    public static final Parcelable.Creator<Item> CREATOR = new Parcelable.Creator<Item>() {
        @Override
        public Item createFromParcel(Parcel source) {
            return new Item(source);
        }

        @Override
        public Item[] newArray(int size) {
            return new Item[size];
        }
    };
}

