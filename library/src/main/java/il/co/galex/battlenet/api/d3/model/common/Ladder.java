package il.co.galex.battlenet.api.d3.model.common;

/**
 * @author Alexander Gherschon
 */

class Ladder {

    private String href;

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    @Override
    public String toString() {
        return "{" +
                "href='" + href + '\'' +
                '}';
    }
}
