package il.co.galex.bnetapi.d3.utils;

import android.support.annotation.NonNull;

/**
 * @author Alexander Gherschon
 */

public final class D3IconsUtils {

    private static final String URL = "http://media.blizzard.com/d3/icons/%s/%s/%s.png";

    private D3IconsUtils() {

    }

    public enum Type {
        ITEMS, SKILLS;

        public Class<? extends Size> getSizeType() {
            if(this == ITEMS) return ItemSize.class;
            else return SkillsSize.class;
        }
    }

    private interface Size {

        String getValue();
    }

    public enum ItemSize implements Size {
        SMALL, LARGE;

        @Override
        public String getValue() {
            return this.name().toLowerCase();
        }
    }

    public enum SkillsSize implements Size {

        SMALL("21"), MEDIUM("42"), LARGE("64");

        private String value;

        SkillsSize(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }


    public static String getUrl(@NonNull Type type, @NonNull Size size, @NonNull String icon) {
        // check if correct type of size
        if(!size.getClass().equals(type.getSizeType())) throw new IllegalArgumentException("Wrong size for the type " + type);
        return String.format(URL, type.name().toLowerCase(), size.getValue(), icon);
    }
}
