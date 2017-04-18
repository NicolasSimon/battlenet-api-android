package il.co.galex.bnetapi.common.utils;

import android.util.Log;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import org.w3c.dom.Attr;

import java.io.IOException;
import java.util.HashMap;

import il.co.galex.bnetapi.d3.model.item.AttributesRaw;
import il.co.galex.bnetapi.d3.model.item.FloatRange;

/**
 * @author Alexander Gherschon
 */

public class AttributesRawTypeAdapter extends TypeAdapter<AttributesRaw> {

    private static final String TAG = AttributesRaw.class.getSimpleName();

    @Override
    public void write(JsonWriter out, AttributesRaw value) throws IOException {

        Log.d(TAG, "write() called with: out = [" + out + "], value = [" + value + "]");
        // TODO implement the writing even if right now this is not used
    }

    @Override
    public AttributesRaw read(JsonReader in) throws IOException {

        Log.d(TAG, "read() called with: in = [" + in + "]");

        AttributesRaw attributesRaw = new AttributesRaw();
        attributesRaw.setValues(new HashMap<String, FloatRange>());
        // open the object of attributesRaw
        in.beginObject();
        while (in.hasNext()) {
            FloatRange floatRange = new FloatRange();
            // get the name of the next object to read
            String name = in.nextName();
            in.beginObject();
            while (in.hasNext()) {
                String attrName = in.nextName();
                if ("min".equals(attrName)) {
                    floatRange.setMin((float) in.nextDouble());
                } else if ("max".equals(attrName)) {
                    floatRange.setMax((float) in.nextDouble());
                }
            }
            in.endObject();
            attributesRaw.getValues().put(name, floatRange);
        }
        in.endObject();

        return attributesRaw;
    }
}
