package armor;

/**
 * neck's armor class
 */
public class NeckArmor extends Armor {
    /**
     * <p>this method sets the armor's durability and k by using super keyword and pass durability and k to Armor class </p>
     *
     * @param durability durability of the armor
     * @param k each k units damage will reduce one unit of durability
     */
    private NeckArmor(double durability, double k) {
        super(durability, k);
    }

    /**
     * <p>this method creates a armor for neck and returns it</p>
     *
     * @return neck's armor
     */
    public static NeckArmor create() {
        return new NeckArmor(50, 2.1);
    }
}
