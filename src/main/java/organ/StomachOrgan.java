package organ;

import armor.StomachArmor;

/**
 * stomach's organ class
 */
public class StomachOrgan extends Organ {
    /**
     * <p>this method sets the organ's hp and armor by using super keyword and pass hp and armor to Organ class </p>
     *
     * @param hp hp of the organ
     */
    private StomachOrgan(double hp) {
        super(hp, StomachArmor.create());
    }

    /**
     * <p>this method creates a stomach organ and returns it</p>
     *
     * @return stomach's organ
     */
    public static StomachOrgan create() {
        return new StomachOrgan(50);
    }
}
