package il.co.galex.battlenet.api.utils;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;

/**
 * @author Alexander Gherschon
 */

public class BattleTagTypeAdapter extends TypeAdapter<BattleTag> {

    @Override
    public void write(JsonWriter out, BattleTag battleTag) throws IOException {
        out.value(battleTag.getPublicFormat());
    }

    @Override
    public BattleTag read(JsonReader in) throws IOException {

        String value = in.nextString();
        String[] split = value.split("#");

        BattleTag battleTag = new BattleTag();
        battleTag.setName(split[0]);
        battleTag.setNumber(Integer.parseInt(split[1]));

        return battleTag;
    }
}
