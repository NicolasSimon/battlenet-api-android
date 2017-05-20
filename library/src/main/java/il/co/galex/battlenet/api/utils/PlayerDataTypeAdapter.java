package il.co.galex.battlenet.api.utils;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

import il.co.galex.battlenet.api.d3.model.common.BattleTag;
import il.co.galex.battlenet.api.d3.model.common.Gender;
import il.co.galex.battlenet.api.d3.model.common.HeroClass;
import il.co.galex.battlenet.api.d3.model.leaderboard.PlayerData;

/**
 * @author Alexander Gherschon
 */

public class PlayerDataTypeAdapter extends TypeAdapter<PlayerData> {

    @Override
    public void write(JsonWriter out, PlayerData playerData) throws IOException {
        //out.value(battleTag.getPublicFormat());
    }

    @Override
    public PlayerData read(JsonReader in) throws IOException {

        PlayerData playerData = new PlayerData();
        in.beginArray();

        while (in.hasNext()) {

            in.beginObject();
            // ignores the attribute name 'id'
            in.nextName();
            String parameter = in.nextString();
            // ignores the attribute name (type of the data)
            in.nextName();

            switch (parameter) {

                case "HeroBattleTag": {
                    String value = in.nextString();
                    playerData.setHeroBattleTag(new BattleTag(value));
                    break;
                }

                case "GameAccount": {
                    int value = in.nextInt();
                    playerData.setGameAccount(value);
                    break;
                }

                case "HeroClass": {
                    String value = in.nextString();
                    playerData.setHeroClass(HeroClass.get(value));
                    break;
                }

                case "HeroGender": {
                    String value = in.nextString();
                    playerData.setHeroGender(Gender.get(value));
                    break;
                }

                case "HeroLevel": {
                    int value = in.nextInt();
                    playerData.setHeroLevel(value);
                    break;
                }

                case "ParagonLevel": {
                    int value = in.nextInt();
                    playerData.setParagonLevel(value);
                    break;
                }

                case "HeroClanTag": {
                    String value = in.nextString();
                    playerData.setHeroClanTag(value);
                    break;
                }

                case "ClanName": {
                    String value = in.nextString();
                    playerData.setClanName(value);
                    break;
                }

                case "HeroId": {
                    int value = in.nextInt();
                    playerData.setHeroId(value);
                    break;
                }

                case "HeroVisualItems": {
                    String value = in.nextString();
                    playerData.setHeroVisualItems(value);
                    break;
                }

                default:
                    throw new RuntimeException("parameter = " + parameter + " not managed");
            }
            in.endObject();
        }
        in.endArray();
        return playerData;
    }
}
