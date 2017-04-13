package il.co.galex.bnetapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * @author Alexander Gherschon
 */

public enum HeroClass {

    @SerializedName("wizard")
    WIZARD,

    @SerializedName("demon-hunter")
    DEMON_HUNTER,

    @SerializedName("crusader")
    CRUSADER,

    @SerializedName("monk")
    MONK,

    @SerializedName("witch-doctor")
    WITCH_DOCTOR,

    @SerializedName("barbarian")
    BARBARIAN,

    @SerializedName("necromancer")
    NECROMANCER,
}
