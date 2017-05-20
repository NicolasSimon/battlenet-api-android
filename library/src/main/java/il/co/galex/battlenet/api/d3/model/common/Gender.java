package il.co.galex.battlenet.api.d3.model.common;

import android.support.annotation.NonNull;

import com.google.gson.annotations.SerializedName;

/**
 * @author Alexander Gherschon
 */

public enum Gender {


    @SerializedName("0")
    MALE,

    @SerializedName("1")
    FEMALE;


    public static Gender get(@NonNull String letter) {

        if("m".equalsIgnoreCase(letter)) return MALE;
        else if("f".equalsIgnoreCase(letter)) return FEMALE;
        else return null;
    }
}
