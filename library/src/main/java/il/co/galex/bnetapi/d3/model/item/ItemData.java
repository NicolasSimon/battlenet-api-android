package il.co.galex.bnetapi.d3.model.item;

import java.util.List;

/**
 * @author Alexander Gherschon
 */

public class ItemData {

    private String id;
    private String name;
    private String icon;
    private String displayColor;
    private String tooltipParams;
    private Integer requiredLevel;
    private Integer itemLevel;
    private Integer stackSizemax;
    private Integer bonusAffixes;
    private Integer bonusAffixesMax;
    private Boolean accountBound;
    private String flavorText;
    private String typeName;
    private ItemType type;
    private String damageRange;
    private FloatRange dps;
    private FloatRange attacksPerSecond;
    private String attacksPerSecondText;
    private IntRange minDamage;
    private IntRange maxDamage;
    private List<String> slots;
    private Attributes attributes;
    private AttributesRaw attributesRaw;

    public String getId() {
        return id;
    }
}