package il.co.galex.battlenet.api.d3.model.common;

import il.co.galex.battlenet.api.d3.model.career.Hero;

/**
 * @author Alexander Gherschon
 */

public enum HeroClass {

    WIZARD,
    DEMON_HUNTER,
    CRUSADER,
    MONK,
    WITCH_DOCTOR,
    BARBARIAN,
    NECROMANCER;

    public static HeroClass get(String value) {

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
