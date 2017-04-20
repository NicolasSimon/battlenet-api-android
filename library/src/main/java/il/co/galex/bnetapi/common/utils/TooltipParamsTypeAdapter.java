package il.co.galex.bnetapi.common.utils;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

import il.co.galex.bnetapi.d3.model.common.TooltipParams;

/**
 * @author Alexander Gherschon
 */

public class TooltipParamsTypeAdapter extends TypeAdapter<TooltipParams> {

    @Override
    public void write(JsonWriter out, TooltipParams tooltipParams) throws IOException {
        out.value(tooltipParams.getFullFormat());
    }

    @Override
    public TooltipParams read(JsonReader in) throws IOException {

        String value = in.nextString();
        String[] split = value.split(TooltipParams.SEPARATOR);

        TooltipParams tooltipParams = new TooltipParams();
        tooltipParams.setPrefix(split[0]);
        tooltipParams.setId(split[1]);

        return tooltipParams;
    }
}
