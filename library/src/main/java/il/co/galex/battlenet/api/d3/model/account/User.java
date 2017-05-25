package il.co.galex.battlenet.api.d3.model.account;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Index;
import android.arch.persistence.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;

/**
 * @author Alexander Gherschon
 */

@Entity(indices = {@Index("battleTag"), @Index(value = {"id", "battleTag"}, unique = true)})
public class User {

    @PrimaryKey
    private int uid;

    private Integer id;

    private Boolean current;

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

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public Boolean getCurrent() {
        return current;
    }

    public void setCurrent(Boolean current) {
        this.current = current;
    }

    @Override
    public String toString() {
        return "{" +
                "uid=" + uid +
                ", id=" + id +
                ", current=" + current +
                ", battleTag=" + battleTag +
                '}';
    }
}
