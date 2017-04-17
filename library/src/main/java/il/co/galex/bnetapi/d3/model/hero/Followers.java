package il.co.galex.bnetapi.d3.model.hero;

/**
 * @author Alexander Gherschon
 */

public class Followers {

    private Follower templar;
    private Follower scoundrel;
    private Follower enchantress;

    public Follower getTemplar() {
        return templar;
    }

    public void setTemplar(Follower templar) {
        this.templar = templar;
    }

    public Follower getScoundrel() {
        return scoundrel;
    }

    public void setScoundrel(Follower scoundrel) {
        this.scoundrel = scoundrel;
    }

    public Follower getEnchantress() {
        return enchantress;
    }

    public void setEnchantress(Follower enchantress) {
        this.enchantress = enchantress;
    }

    @Override
    public String toString() {
        return "{" +
                "templar=" + templar +
                ", scoundrel=" + scoundrel +
                ", enchantress=" + enchantress +
                '}';
    }
}
