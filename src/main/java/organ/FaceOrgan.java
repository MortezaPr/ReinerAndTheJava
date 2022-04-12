package organ;

import armor.FaceArmor;

/**
 * face's organ class
 */
public class FaceOrgan extends Organ {
    /**
     * <p>this method sets the organ's hp and armor by using super keyword and pass hp and armor to Organ class </p>
     *
     * @param hp hp of the organ
     */
    private FaceOrgan(double hp) {
        super(hp, FaceArmor.create());
    }

    /**
     * <p>this method creates a face organ and returns it</p>
     *
     * @return face's organ
     */
    public static FaceOrgan create() {
        return new FaceOrgan(30);
    }
}
