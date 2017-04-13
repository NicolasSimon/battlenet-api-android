package il.co.galex.bnetapi.model.common;

/**
 * Represents the different available locales
 *
 * @author Alexander Gherschon
 */

public enum Locale {

    ENGLISH("en_GB"),
    GERMAN("de_DE"),
    SPANISH("es_ES"),
    FRENCH("fr_FR"),
    ITALIAN("it_IT"),
    POLISH("pl_PL"),
    PORTUGUESE("pt_PT"),
    RUSSIAN("ru_RU");

    private String value;


    Locale(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
