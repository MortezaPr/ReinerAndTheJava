package organ;

import armor.FootArmor;

/**
 * foot's organ class
 */
public class FootOrgan extends Organ{
    /**
     * <p>this method sets the organ's hp and armor by using super keyword and pass hp and armor to Organ class </p>
     *
     * @param hp hp of the organ
     */
    private FootOrgan(double hp) {
        super(hp, FootArmor.create());
    }

    /**
     * <p>this method creates a foot organ and returns it</p>
     *
     * @return foot's organ
     */
    public static FootOrgan create() {
        return new FootOrgan(45);
    }
}
