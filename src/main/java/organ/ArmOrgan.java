package organ;

import armor.ArmArmor;

/**
 * arm's organ class
 */
public class ArmOrgan extends Organ {
    /**
     * <p>this method sets the organ's hp and armor by using super keyword and pass hp and armor to Organ class </p>
     *
     * @param hp hp of the organ
     */
    private ArmOrgan(double hp) {
        super(hp, ArmArmor.create());
    }

    /**
     * <p>this method creates a arm organ and returns it</p>
     *
     * @return arm's organ
     */
    public static ArmOrgan create() {
        return new ArmOrgan(80);
    }
}
