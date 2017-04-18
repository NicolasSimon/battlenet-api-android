package il.co.galex.bnetapi.d3.model.item;

import org.w3c.dom.Attr;

/**
 * @author Alexander Gherschon
 */

public class Affix {

    private Attributes attributes;
    private AttributesRaw attributesRaw;

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public AttributesRaw getAttributesRaw() {
        return attributesRaw;
    }

    public void setAttributesRaw(AttributesRaw attributesRaw) {
        this.attributesRaw = attributesRaw;
    }

    @Override
    public String toString() {
        return "{" +
                "attributes=" + attributes +
                ", attributesRaw=" + attributesRaw +
                '}';
    }
}
