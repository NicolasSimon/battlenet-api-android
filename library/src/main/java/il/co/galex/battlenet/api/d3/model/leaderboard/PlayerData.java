package il.co.galex.battlenet.api.d3.model.leaderboard;

import android.os.Parcel;
import android.os.Parcelable;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;
import il.co.galex.battlenet.api.d3.model.common.Gender;
import il.co.galex.battlenet.api.d3.model.common.HeroClass;

/**
 * @author Alexander Gherschon
 */

public class PlayerData implements Parcelable {

    private BattleTag heroBattleTag;
    private Integer gameAccount;
    private HeroClass heroClass;
    private Gender heroGender;
    private Integer heroLevel;
    private Integer paragonLevel;
    private String heroClanTag;
    private String clanName;
    private Integer heroId;
    private String heroVisualItems;

    public BattleTag getHeroBattleTag() {
        return heroBattleTag;
    }

    public void setHeroBattleTag(BattleTag heroBattleTag) {
        this.heroBattleTag = heroBattleTag;
    }

    public Integer getGameAccount() {
        return gameAccount;
    }

    public void setGameAccount(Integer gameAccount) {
        this.gameAccount = gameAccount;
    }

    public HeroClass getHeroClass() {
        return heroClass;
    }

    public void setHeroClass(HeroClass heroClass) {
        this.heroClass = heroClass;
    }

    public Gender getHeroGender() {
        return heroGender;
    }

    public void setHeroGender(Gender heroGender) {
        this.heroGender = heroGender;
    }

    public Integer getHeroLevel() {
        return heroLevel;
    }

    public void setHeroLevel(Integer heroLevel) {
        this.heroLevel = heroLevel;
    }

    public Integer getParagonLevel() {
        return paragonLevel;
    }

    public void setParagonLevel(Integer paragonLevel) {
        this.paragonLevel = paragonLevel;
    }

    public String getHeroClanTag() {
        return heroClanTag;
    }

    public void setHeroClanTag(String heroClanTag) {
        this.heroClanTag = heroClanTag;
    }

    public String getClanName() {
        return clanName;
    }

    public void setClanName(String clanName) {
        this.clanName = clanName;
    }

    public Integer getHeroId() {
        return heroId;
    }

    public void setHeroId(Integer heroId) {
        this.heroId = heroId;
    }

    @Override
    public String toString() {
        return "{" +
                "heroBattleTag=" + heroBattleTag +
                ", gameAccount=" + gameAccount +
                ", heroClass=" + heroClass +
                ", heroGender=" + heroGender +
                ", heroLevel=" + heroLevel +
                ", paragonLevel=" + paragonLevel +
                ", heroClanTag='" + heroClanTag + '\'' +
                ", clanName='" + clanName + '\'' +
                ", heroId='" + heroId + '\'' +
                ", heroVisualItems='" + heroVisualItems + '\'' +
                '}';
    }

    public String getHeroVisualItems() {
        return heroVisualItems;
    }

    public void setHeroVisualItems(String heroVisualItems) {
        this.heroVisualItems = heroVisualItems;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(this.heroBattleTag, flags);
        dest.writeValue(this.gameAccount);
        dest.writeInt(this.heroClass == null ? -1 : this.heroClass.ordinal());
        dest.writeInt(this.heroGender == null ? -1 : this.heroGender.ordinal());
        dest.writeValue(this.heroLevel);
        dest.writeValue(this.paragonLevel);
        dest.writeString(this.heroClanTag);
        dest.writeString(this.clanName);
        dest.writeValue(this.heroId);
        dest.writeString(this.heroVisualItems);
    }

    public PlayerData() {
    }

    protected PlayerData(Parcel in) {
        this.heroBattleTag = in.readParcelable(BattleTag.class.getClassLoader());
        this.gameAccount = (Integer) in.readValue(Integer.class.getClassLoader());
        int tmpHeroClass = in.readInt();
        this.heroClass = tmpHeroClass == -1 ? null : HeroClass.values()[tmpHeroClass];
        int tmpHeroGender = in.readInt();
        this.heroGender = tmpHeroGender == -1 ? null : Gender.values()[tmpHeroGender];
        this.heroLevel = (Integer) in.readValue(Integer.class.getClassLoader());
        this.paragonLevel = (Integer) in.readValue(Integer.class.getClassLoader());
        this.heroClanTag = in.readString();
        this.clanName = in.readString();
        this.heroId = (Integer) in.readValue(Integer.class.getClassLoader());
        this.heroVisualItems = in.readString();
    }

    public static final Parcelable.Creator<PlayerData> CREATOR = new Parcelable.Creator<PlayerData>() {
        @Override
        public PlayerData createFromParcel(Parcel source) {
            return new PlayerData(source);
        }

        @Override
        public PlayerData[] newArray(int size) {
            return new PlayerData[size];
        }
    };
}
