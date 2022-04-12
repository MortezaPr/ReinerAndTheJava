package organ;

import armor.Armor;
import interfaces.Damageable;

/**
 * Organ's class
 */
public abstract class Organ implements Damageable {
    protected double hp;
    protected Armor armor;

    /**
     * <p>sets hp and armor</p>
     *
     * @param hp hp of the organ
     * @param armor armor of the organ
     */
    public Organ(double hp, Armor armor) {
        this.hp = hp;
        this.armor = armor;
    }

    /**
     * @return organ's hp
     */
    public double getHp() {
        return hp <= 0 ? 0 : Double.parseDouble(String.format("%.2f",hp));
    }

    /**
     * @return organ's armor
     */
    public Armor getArmor() {
        return armor;
    }

    /**
     * <p>if hp of the armor is equal to 0 or less than 0 it will return true (organ destroys) </p>
     *
     * @param force force
     * @return organ's status (destroyed or not)
     */
    @Override
    public boolean takeDamage(double force) {
        hp -= ( force * calcResist(armor.getDurability())) / 100.0;
        hp = Double.parseDouble(String.format("%.2f",hp));
        return hp <= 0;
    }

    /**
     * @param x armor's durability
     * @return resistance
     */
    private double calcResist(double x) {
        return 100 - x/2.0;
    }
}
