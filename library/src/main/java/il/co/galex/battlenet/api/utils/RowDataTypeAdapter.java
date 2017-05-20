package il.co.galex.battlenet.api.utils;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;
import il.co.galex.battlenet.api.d3.model.leaderboard.RowData;

/**
 * @author Alexander Gherschon
 */

public class RowDataTypeAdapter extends TypeAdapter<RowData> {

    @Override
    public void write(JsonWriter out, RowData rowData) throws IOException {
        //out.value(battleTag.getPublicFormat());
    }

    @Override
    public RowData read(JsonReader in) throws IOException {

        RowData rowData = new RowData();

        in.beginArray();

        while (in.hasNext()) {

            in.beginObject();
            // ignores the attribute name 'id'
            in.nextName();
            String parameter = in.nextString();
            // ignores the attribute name (type of the data)
            in.nextName();

            switch (parameter) {

                case "Rank": {
                    int value = in.nextInt();
                    rowData.setRank(value);
                    break;
                }

                case "RiftLevel" : {
                    int value = in.nextInt();
                    rowData.setRiftLevel(value);
                    break;
                }

                case "RiftTime": {
                    long value = in.nextLong();
                    rowData.setRiftTime(value);
                    break;
                }

                case "CompletedTime": {
                    long value = in.nextLong();
                    rowData.setCompletedTime(value);
                    break;
                }

                case "BattleTag": {
                    String value = in.nextString();
                    rowData.setBattleTag(new BattleTag(value));
                    break;
                }

                case "AchievementPoints": {
                    int value = in.nextInt();
                    rowData.setAchievementPoints(value);
                    break;
                }

                default:
                    throw new RuntimeException("parameter = " + parameter + " not managed");
            }

            in.endObject();
        }
        in.endArray();


        return rowData;
    }
}
