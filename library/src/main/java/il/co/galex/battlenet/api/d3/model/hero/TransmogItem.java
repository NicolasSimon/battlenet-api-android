package il.co.galex.battlenet.api.d3.model.hero;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

import il.co.galex.battlenet.api.d3.model.common.TooltipParams;

/**
 * @author Alexander Gherschon
 */

public class TransmogItem implements Parcelable {

    private String id;
    private String name;
    private String icon;
    private String displayColor;
    private TooltipParams tooltipParams;
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

    public TooltipParams getTooltipParams() {
        return tooltipParams;
    }

    public void setTooltipParams(TooltipParams tooltipParams) {
        this.tooltipParams = tooltipParams;
    }

    public List<String> getSetItemsEquipped() {
        return setItemsEquipped;
    }

    public void setSetItemsEquipped(List<String> setItemsEquipped) {
        this.setItemsEquipped = setItemsEquipped;
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
        dest.writeStringList(this.setItemsEquipped);
    }

    public TransmogItem() {
    }

    protected TransmogItem(Parcel in) {
        this.id = in.readString();
        this.name = in.readString();
        this.icon = in.readString();
        this.displayColor = in.readString();
        this.tooltipParams = in.readParcelable(TooltipParams.class.getClassLoader());
        this.setItemsEquipped = in.createStringArrayList();
    }

    public static final Parcelable.Creator<TransmogItem> CREATOR = new Parcelable.Creator<TransmogItem>() {
        @Override
        public TransmogItem createFromParcel(Parcel source) {
            return new TransmogItem(source);
        }

        @Override
        public TransmogItem[] newArray(int size) {
            return new TransmogItem[size];
        }
    };
}
