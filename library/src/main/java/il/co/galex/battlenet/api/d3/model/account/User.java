package il.co.galex.battlenet.api.d3.model.account;

import com.google.gson.annotations.SerializedName;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;

/**
 * @author Alexander Gherschon
 */

public class User {

    private Integer id;

    @SerializedName("battletag")
    private BattleTag battleTag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public BattleTag getBattleTag() {
        return battleTag;
    }

    public void setBattleTag(BattleTag battleTag) {
        this.battleTag = battleTag;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", battleTag=" + battleTag +
                '}';
    }
}
