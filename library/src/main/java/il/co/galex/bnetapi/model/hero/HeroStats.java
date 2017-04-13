package il.co.galex.bnetapi.model.hero;

/**
 * @author Alexander Gherschon
 */

public class HeroStats {

    private Integer life;
    private Integer damage;
    private Integer toughness;
    private Float healing;
    private Float attackSpeed;
    private Integer armor;
    private Integer strength;
    private Integer dexterity;
    private Integer vitality;
    private Integer intelligence;
    private Integer physicalResist;
    private Integer fireResist;
    private Integer coldResist;
    private Integer lightningResist;
    private Integer poisonResist;
    private Integer arcaneResist;
    private Float critDamage;
    private Integer damageIncrease;
    private Float critChance;
    private Integer damageReduction;
    private Integer lifeSteal;
    private Integer lifePerKill;
    private Float goldFind;
    private Integer magicFind;
    private Integer thorns;
    private Float blockChance;
    private Integer blockAmountMin;
    private Integer blockAmountMax;
    private Integer lifeOnHit;
    private Integer primaryResource;
    private Integer secondaryResource;

    public Integer getLife() {
        return life;
    }

    public void setLife(Integer life) {
        this.life = life;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getToughness() {
        return toughness;
    }

    public void setToughness(Integer toughness) {
        this.toughness = toughness;
    }

    public Float getHealing() {
        return healing;
    }

    public void setHealing(Float healing) {
        this.healing = healing;
    }

    public Float getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(Float attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Integer getArmor() {
        return armor;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public Integer getStrength() {
        return strength;
    }

    public void setStrength(Integer strength) {
        this.strength = strength;
    }

    public Integer getDexterity() {
        return dexterity;
    }

    public void setDexterity(Integer dexterity) {
        this.dexterity = dexterity;
    }

    public Integer getVitality() {
        return vitality;
    }

    public void setVitality(Integer vitality) {
        this.vitality = vitality;
    }

    public Integer getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(Integer intelligence) {
        this.intelligence = intelligence;
    }

    public Integer getPhysicalResist() {
        return physicalResist;
    }

    public void setPhysicalResist(Integer physicalResist) {
        this.physicalResist = physicalResist;
    }

    public Integer getFireResist() {
        return fireResist;
    }

    public void setFireResist(Integer fireResist) {
        this.fireResist = fireResist;
    }

    public Integer getColdResist() {
        return coldResist;
    }

    public void setColdResist(Integer coldResist) {
        this.coldResist = coldResist;
    }

    public Integer getLightningResist() {
        return lightningResist;
    }

    public void setLightningResist(Integer lightningResist) {
        this.lightningResist = lightningResist;
    }

    public Integer getPoisonResist() {
        return poisonResist;
    }

    public void setPoisonResist(Integer poisonResist) {
        this.poisonResist = poisonResist;
    }

    public Integer getArcaneResist() {
        return arcaneResist;
    }

    public void setArcaneResist(Integer arcaneResist) {
        this.arcaneResist = arcaneResist;
    }

    public Float getCritDamage() {
        return critDamage;
    }

    public void setCritDamage(Float critDamage) {
        this.critDamage = critDamage;
    }

    public Integer getDamageIncrease() {
        return damageIncrease;
    }

    public void setDamageIncrease(Integer damageIncrease) {
        this.damageIncrease = damageIncrease;
    }

    public Float getCritChance() {
        return critChance;
    }

    public void setCritChance(Float critChance) {
        this.critChance = critChance;
    }

    public Integer getDamageReduction() {
        return damageReduction;
    }

    public void setDamageReduction(Integer damageReduction) {
        this.damageReduction = damageReduction;
    }

    public Integer getLifeSteal() {
        return lifeSteal;
    }

    public void setLifeSteal(Integer lifeSteal) {
        this.lifeSteal = lifeSteal;
    }

    public Integer getLifePerKill() {
        return lifePerKill;
    }

    public void setLifePerKill(Integer lifePerKill) {
        this.lifePerKill = lifePerKill;
    }

    public Float getGoldFind() {
        return goldFind;
    }

    public void setGoldFind(Float goldFind) {
        this.goldFind = goldFind;
    }

    public Integer getMagicFind() {
        return magicFind;
    }

    public void setMagicFind(Integer magicFind) {
        this.magicFind = magicFind;
    }

    public Integer getThorns() {
        return thorns;
    }

    public void setThorns(Integer thorns) {
        this.thorns = thorns;
    }

    public Float getBlockChance() {
        return blockChance;
    }

    public void setBlockChance(Float blockChance) {
        this.blockChance = blockChance;
    }

    public Integer getBlockAmountMin() {
        return blockAmountMin;
    }

    public void setBlockAmountMin(Integer blockAmountMin) {
        this.blockAmountMin = blockAmountMin;
    }

    public Integer getBlockAmountMax() {
        return blockAmountMax;
    }

    public void setBlockAmountMax(Integer blockAmountMax) {
        this.blockAmountMax = blockAmountMax;
    }

    public Integer getLifeOnHit() {
        return lifeOnHit;
    }

    public void setLifeOnHit(Integer lifeOnHit) {
        this.lifeOnHit = lifeOnHit;
    }

    public Integer getPrimaryResource() {
        return primaryResource;
    }

    public void setPrimaryResource(Integer primaryResource) {
        this.primaryResource = primaryResource;
    }

    public Integer getSecondaryResource() {
        return secondaryResource;
    }

    public void setSecondaryResource(Integer secondaryResource) {
        this.secondaryResource = secondaryResource;
    }

    @Override
    public String toString() {
        return "{" +
                "life=" + life +
                ", damage=" + damage +
                ", toughness=" + toughness +
                ", healing=" + healing +
                ", attackSpeed=" + attackSpeed +
                ", armor=" + armor +
                ", strength=" + strength +
                ", dexterity=" + dexterity +
                ", vitality=" + vitality +
                ", intelligence=" + intelligence +
                ", physicalResist=" + physicalResist +
                ", fireResist=" + fireResist +
                ", coldResist=" + coldResist +
                ", lightningResist=" + lightningResist +
                ", poisonResist=" + poisonResist +
                ", arcaneResist=" + arcaneResist +
                ", critDamage=" + critDamage +
                ", damageIncrease=" + damageIncrease +
                ", critChance=" + critChance +
                ", damageReduction=" + damageReduction +
                ", lifeSteal=" + lifeSteal +
                ", lifePerKill=" + lifePerKill +
                ", goldFind=" + goldFind +
                ", magicFind=" + magicFind +
                ", thorns=" + thorns +
                ", blockChance=" + blockChance +
                ", blockAmountMin=" + blockAmountMin +
                ", blockAmountMax=" + blockAmountMax +
                ", lifeOnHit=" + lifeOnHit +
                ", primaryResource=" + primaryResource +
                ", secondaryResource=" + secondaryResource +
                '}';
    }
}
