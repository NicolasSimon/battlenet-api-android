package il.co.galex.bnetapi.model.hero;

/**
 * @author Alexander Gherschon
 */

public class CompletedQuest {

    private String slug;
    private String name;

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "slug='" + slug + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
