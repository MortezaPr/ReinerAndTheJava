package organ;

import armor.ChestArmor;

/**
 * chest's organ class
 */
public class ChestOrgan extends Organ {
    /**
     * <p>this method sets the organ's hp and armor by using super keyword and pass hp and armor to Organ class </p>
     *
     * @param hp hp of the organ
     */
    private ChestOrgan(double hp) {
        super(hp, ChestArmor.create());
    }

    /**
     * <p>this method creates a chest organ and returns it</p>
     *
     * @return chest's organ
     */
    public static ChestOrgan create() {
        return new ChestOrgan(210);
    }
}
