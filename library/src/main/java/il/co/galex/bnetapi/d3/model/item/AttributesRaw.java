package il.co.galex.bnetapi.d3.model.item;

import com.google.gson.annotations.SerializedName;

/**
 * @author Alexander Gherschon
 */

public class AttributesRaw {

    @SerializedName("Damage_Weapon_Min#Physical")
    private IntRange damageWeaponMinPhysical;

    @SerializedName("Attacks_Per_Second_Item")
    private FloatRange attacksPerSecondItem;
}
