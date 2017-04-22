package il.co.galex.battlenet.api.d3.model.common;

import com.google.gson.annotations.SerializedName;

/**
 * @author Alexander Gherschon
 */

public enum Mob {

    @SerializedName("monsters")
    MONSTERS,

    @SerializedName("elites")
    ELITES,

    @SerializedName("hardcoreMonsters")
    HARDCORE_MONSTERS,

    // TODO this is a guess, remove this if it does not exist in the official API
    @SerializedName("hardcoreElites")
    HARDCORE_ELITES,
}
