package il.co.galex.battlenet.api.d3.database;

import android.arch.persistence.room.TypeConverter;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;

public class Converters {
    @TypeConverter
    public static String fromBattleTag(BattleTag battleTag) {
        return battleTag.getPublicFormat();
    }

    @TypeConverter
    public static BattleTag stringToBattleTag(String string) {
        return new BattleTag(string);
    }
}