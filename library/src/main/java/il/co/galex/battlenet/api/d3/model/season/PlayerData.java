package il.co.galex.battlenet.api.d3.model.season;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;
import il.co.galex.battlenet.api.d3.model.common.Gender;
import il.co.galex.battlenet.api.d3.model.common.HeroClass;

/**
 * @author Alexander Gherschon
 */

public class PlayerData {

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
}
