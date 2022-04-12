package armor;

import interfaces.Damageable;

/**
 * Armor's class
 */
public abstract class Armor implements Damageable {
    protected double durability;
    protected double k;

    /**
     * <p>sets durability and k</p>
     *
     * @param durability durability of the armor
     * @param k each k units damage will reduce one unit of durability
     */
    public Armor(double durability, double k) {
        this.durability = durability;
        this.k = k;
    }

    /**
     * @return durability
     */
    public double getDurability() {return durability <= 0 ? 0 : Double.parseDouble(String.format("%.2f",durability));}

    /**
     * @return k
     */
    public double getK() {
        return k;
    }

    /**
     * <p>if durability of the armor is equal to 0 or less than 0 it will return true (armor breaks) </p>
     *
     * @param force force
     * @return armor's status (broken or not)
     */
    @Override
    public boolean takeDamage(double force) {
        durability -= force/k;
        durability = Double.parseDouble(String.format("%.2f",durability));
        return durability <= 0;
    }
}
