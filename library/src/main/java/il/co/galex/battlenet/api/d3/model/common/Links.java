package il.co.galex.battlenet.api.d3.model.common;

/**
 * @author Alexander Gherschon
 */

public class Links {

    private Link self;

    public Link getSelf() {
        return self;
    }

    public void setSelf(Link self) {
        this.self = self;
    }

    @Override
    public String toString() {
        return "{" +
                "self=" + self +
                '}';
    }
}
