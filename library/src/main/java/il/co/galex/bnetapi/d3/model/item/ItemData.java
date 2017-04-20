package il.co.galex.bnetapi.d3.model.item;

import java.util.List;

import il.co.galex.bnetapi.d3.model.common.TooltipParams;

/**
 * @author Alexander Gherschon
 */

public class ItemData {

    private String id;
    private String name;
    private String icon;
    private String displayColor;
    private TooltipParams tooltipParams;
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
    private List<RandomAffix> randomAffixes;
    private Integer seasonRequiredToDrop;
    private Boolean isSeasonRequiredToDrop;
    private String description;
    private String blockChance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDisplayColor() {
        return displayColor;
    }

    public void setDisplayColor(String displayColor) {
        this.displayColor = displayColor;
    }

    public TooltipParams getTooltipParams() {
        return tooltipParams;
    }

    public void setTooltipParams(TooltipParams tooltipParams) {
        this.tooltipParams = tooltipParams;
    }

    public Integer getRequiredLevel() {
        return requiredLevel;
    }

    public void setRequiredLevel(Integer requiredLevel) {
        this.requiredLevel = requiredLevel;
    }

    public Integer getItemLevel() {
        return itemLevel;
    }

    public void setItemLevel(Integer itemLevel) {
        this.itemLevel = itemLevel;
    }

    public Integer getStackSizemax() {
        return stackSizemax;
    }

    public void setStackSizemax(Integer stackSizemax) {
        this.stackSizemax = stackSizemax;
    }

    public Integer getBonusAffixes() {
        return bonusAffixes;
    }

    public void setBonusAffixes(Integer bonusAffixes) {
        this.bonusAffixes = bonusAffixes;
    }

    public Integer getBonusAffixesMax() {
        return bonusAffixesMax;
    }

    public void setBonusAffixesMax(Integer bonusAffixesMax) {
        this.bonusAffixesMax = bonusAffixesMax;
    }

    public Boolean getAccountBound() {
        return accountBound;
    }

    public void setAccountBound(Boolean accountBound) {
        this.accountBound = accountBound;
    }

    public String getFlavorText() {
        return flavorText;
    }

    public void setFlavorText(String flavorText) {
        this.flavorText = flavorText;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public ItemType getType() {
        return type;
    }

    public void setType(ItemType type) {
        this.type = type;
    }

    public String getDamageRange() {
        return damageRange;
    }

    public void setDamageRange(String damageRange) {
        this.damageRange = damageRange;
    }

    public FloatRange getDps() {
        return dps;
    }

    public void setDps(FloatRange dps) {
        this.dps = dps;
    }

    public FloatRange getAttacksPerSecond() {
        return attacksPerSecond;
    }

    public void setAttacksPerSecond(FloatRange attacksPerSecond) {
        this.attacksPerSecond = attacksPerSecond;
    }

    public String getAttacksPerSecondText() {
        return attacksPerSecondText;
    }

    public void setAttacksPerSecondText(String attacksPerSecondText) {
        this.attacksPerSecondText = attacksPerSecondText;
    }

    public IntRange getMinDamage() {
        return minDamage;
    }

    public void setMinDamage(IntRange minDamage) {
        this.minDamage = minDamage;
    }

    public IntRange getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(IntRange maxDamage) {
        this.maxDamage = maxDamage;
    }

    public List<String> getSlots() {
        return slots;
    }

    public void setSlots(List<String> slots) {
        this.slots = slots;
    }

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

    public List<RandomAffix> getRandomAffixes() {
        return randomAffixes;
    }

    public void setRandomAffixes(List<RandomAffix> randomAffixes) {
        this.randomAffixes = randomAffixes;
    }

    public Integer getSeasonRequiredToDrop() {
        return seasonRequiredToDrop;
    }

    public void setSeasonRequiredToDrop(Boolean seasonRequiredToDrop) {
        isSeasonRequiredToDrop = seasonRequiredToDrop;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBlockChance() {
        return blockChance;
    }

    public void setBlockChance(String blockChance) {
        this.blockChance = blockChance;
    }

    public void setSeasonRequiredToDrop(Integer seasonRequiredToDrop) {
        this.seasonRequiredToDrop = seasonRequiredToDrop;
    }

    @Override
    public String toString() {
        return "{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", icon='" + icon + '\'' +
                ", displayColor='" + displayColor + '\'' +
                ", tooltipParams='" + tooltipParams + '\'' +
                ", requiredLevel=" + requiredLevel +
                ", itemLevel=" + itemLevel +
                ", stackSizemax=" + stackSizemax +
                ", bonusAffixes=" + bonusAffixes +
                ", bonusAffixesMax=" + bonusAffixesMax +
                ", accountBound=" + accountBound +
                ", flavorText='" + flavorText + '\'' +
                ", typeName='" + typeName + '\'' +
                ", type=" + type +
                ", damageRange='" + damageRange + '\'' +
                ", dps=" + dps +
                ", attacksPerSecond=" + attacksPerSecond +
                ", attacksPerSecondText='" + attacksPerSecondText + '\'' +
                ", minDamage=" + minDamage +
                ", maxDamage=" + maxDamage +
                ", slots=" + slots +
                ", attributes=" + attributes +
                ", attributesRaw=" + attributesRaw +
                ", randomAffixes=" + randomAffixes +
                ", seasonRequiredToDrop=" + seasonRequiredToDrop +
                ", isSeasonRequiredToDrop=" + isSeasonRequiredToDrop +
                ", description='" + description + '\'' +
                ", blockChance='" + blockChance + '\'' +
                '}';
    }
}