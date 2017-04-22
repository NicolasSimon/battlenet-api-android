package il.co.galex.battlenet.api.d3.model.common;

/**
 * @author Alexander Gherschon
 */

public class BattleTag {

    private String name;
    private int number;

    public BattleTag(String publicBattleTag) {

        int i = publicBattleTag.indexOf("#");

        this.name = publicBattleTag.substring(0, i);
        this.number = Integer.parseInt(publicBattleTag.substring(i + 1, publicBattleTag.length()));
    }

    public BattleTag(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getApiFormat() {

        return name + "-" + number;
    }

    public String getPublicFormat() {

        return name + "#" + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BattleTag)) return false;

        BattleTag battleTag = (BattleTag) o;

        if (number != battleTag.number) return false;
        return name.equals(battleTag.name);

    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + number;
        return result;
    }
}
