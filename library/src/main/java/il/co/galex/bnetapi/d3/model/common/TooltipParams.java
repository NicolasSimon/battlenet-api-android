package il.co.galex.bnetapi.d3.model.common;

/**
 * @author Alexander Gherschon
 */

public class TooltipParams {

    public static final String SEPARATOR = "/";

    private String prefix;
    private String id;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullFormat() {
        return prefix + SEPARATOR + id;
    }

    @Override
    public String toString() {
        return "{" +
                "prefix='" + prefix + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
