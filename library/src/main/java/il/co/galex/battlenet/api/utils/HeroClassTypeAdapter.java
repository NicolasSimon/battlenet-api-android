package il.co.galex.battlenet.api.utils;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

import il.co.galex.battlenet.api.d3.model.common.HeroClass;

/**
 * @author Alexander Gherschon
 */

public class HeroClassTypeAdapter extends TypeAdapter<HeroClass> {

    @Override
    public void write(JsonWriter out, HeroClass heroClass) throws IOException {
        out.value(heroClass.name());
    }

    @Override
    public HeroClass read(JsonReader in) throws IOException {

        String value = in.nextString();
        for (HeroClass heroClass : HeroClass.values()) {
            if(heroClass.name().equalsIgnoreCase(value)) return heroClass;
        }
        // not found, use the cases we know of from the Season API
        switch (value) {
            case "witch-doctor":
            case "wd":
                return HeroClass.WITCH_DOCTOR;
            case "demon-hunter":
            case "dh":
                return HeroClass.DEMON_HUNTER;
            default:
                return null;
        }
    }
}
