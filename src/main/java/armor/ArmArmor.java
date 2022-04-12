package armor;

/**
 * arm's armor class
 */
public class ArmArmor extends Armor {
    /**
     * <p>this method sets the armor's durability and k by using super keyword and pass durability and k to Armor class </p>
     *
     * @param durability durability of the armor
     * @param k each k units damage will reduce one unit of durability
     */
    private ArmArmor(double durability, double k) {
        super(durability, k);
    }

    /**
     * <p>this method creates a armor for arm and returns it</p>
     *
     * @return arm's armor
     */
    public static ArmArmor create() {
        return new ArmArmor(75, 3.4);
    }
}
