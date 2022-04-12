package organ;

import armor.LegArmor;

/**
 * leg's organ class
 */
public class LegOrgan extends Organ {
    /**
     * <p>this method sets the organ's hp and armor by using super keyword and pass hp and armor to Organ class </p>
     *
     * @param hp hp of the organ
     */
    private LegOrgan(double hp) {
        super(hp, LegArmor.create());
    }

    /**
     * <p>this method creates a leg organ and returns it</p>
     *
     * @return leg's organ
     */
    public static LegOrgan create() {
        return new LegOrgan(55);
    }
}
