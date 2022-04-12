package titans;

import organ.*;

/**
 * armored titan's class
 */
public class ArmoredTitan {
    private FaceOrgan faceOrgan;
    private NeckOrgan neckOrgan;
    private ArmOrgan rightArmOrgan;
    private ArmOrgan leftArmOrgan;
    private ChestOrgan chestOrgan;
    private StomachOrgan stomachOrgan;
    private LegOrgan rightLegOrgan;
    private LegOrgan leftLegOrgan;
    private FootOrgan rightFootOrgan;
    private FootOrgan leftFootOrgan;

    /**
     * @param faceOrgan face organ
     * @param neckOrgan neck organ
     * @param rightArmOrgan right arm organ
     * @param leftArmOrgan left arm organ
     * @param chestOrgan chest organ
     * @param stomachOrgan stomach organ
     * @param rightLegOrgan eight leg organ
     * @param leftLegOrgan left leg organ
     * @param rightFootOrgan right foot organ
     * @param leftFootOrgan left foot organ
     */
    private ArmoredTitan(
            FaceOrgan faceOrgan,
			NeckOrgan neckOrgan,
			ArmOrgan rightArmOrgan,
			ArmOrgan leftArmOrgan,
			ChestOrgan chestOrgan,
			StomachOrgan stomachOrgan,
			LegOrgan rightLegOrgan,
			LegOrgan leftLegOrgan,
			FootOrgan rightFootOrgan,
			FootOrgan leftFootOrgan) {
        setFaceOrgan(faceOrgan);
        setNeckOrgan(neckOrgan);
        setRightArmOrgan(rightArmOrgan);
        setLeftArmOrgan(leftArmOrgan);
        setChestOrgan(chestOrgan);
        setStomachOrgan(stomachOrgan);
        setRightLegOrgan(rightLegOrgan);
        setLeftLegOrgan(leftLegOrgan);
        setRightFootOrgan(rightFootOrgan);
        setLeftFootOrgan(leftFootOrgan);
    }

    /**
     * @return face organ
     */
    public FaceOrgan getFaceOrgan() {
        return faceOrgan;
    }

    /**
     * @return neck organ
     */
    public NeckOrgan getNeckOrgan() {
        return neckOrgan;
    }

    /**
     * @return right arm organ
     */
    public ArmOrgan getRightArmOrgan() {
        return rightArmOrgan;
    }

    /**
     * @return left arm organ
     */
    public ArmOrgan getLeftArmOrgan() {
        return leftArmOrgan;
    }

    /**
     * @return chest organ
     */
    public ChestOrgan getChestOrgan() {
        return chestOrgan;
    }

    /**
     * @return stomach organ
     */
    public StomachOrgan getStomachOrgan() {
        return stomachOrgan;
    }

    /**
     * @return right leg organ
     */
    public LegOrgan getRightLegOrgan() {
        return rightLegOrgan;
    }

    /**
     * @return left leg organ
     */
    public LegOrgan getLeftLegOrgan() {
        return leftLegOrgan;
    }

    /**
     * @return right foot organ
     */
    public FootOrgan getRightFootOrgan() {
        return rightFootOrgan;
    }

    /**
     * @return right foot organ
     */
    public FootOrgan getLeftFootOrgan() {
        return leftFootOrgan;
    }

    /**
     * @param faceOrgan face organ
     */
    public void setFaceOrgan(FaceOrgan faceOrgan) {
        this.faceOrgan = faceOrgan;
    }

    /**
     * @param neckOrgan neck organ
     */
    private void setNeckOrgan(NeckOrgan neckOrgan) {
        this.neckOrgan = neckOrgan;
    }

    /**
     * @param rightArmOrgan right arm organ
     */
    private void setRightArmOrgan(ArmOrgan rightArmOrgan) {
        this.rightArmOrgan = rightArmOrgan;
    }

    /**
     * @param leftArmOrgan left arm organ
     */
    private void setLeftArmOrgan(ArmOrgan leftArmOrgan) {
        this.leftArmOrgan = leftArmOrgan;
    }

    /**
     * @param chestOrgan chest organ
     */
    private void setChestOrgan(ChestOrgan chestOrgan) {
        this.chestOrgan = chestOrgan;
    }

    /**
     * @param stomachOrgan stomach organ
     */
    private void setStomachOrgan(StomachOrgan stomachOrgan) {
        this.stomachOrgan = stomachOrgan;
    }

    /**
     * @param rightLegOrgan right leg organ
     */
    private void setRightLegOrgan(LegOrgan rightLegOrgan) {
        this.rightLegOrgan = rightLegOrgan;
    }

    /**
     * @param leftLegOrgan left leg organ
     */
    private void setLeftLegOrgan(LegOrgan leftLegOrgan) {
        this.leftLegOrgan = leftLegOrgan;
    }

    /**
     * @param rightFootOrgan right foot organ
     */
    private void setRightFootOrgan(FootOrgan rightFootOrgan) {
        this.rightFootOrgan = rightFootOrgan;
    }

    /**
     * @param leftFootOrgan left foot organ
     */
    private void setLeftFootOrgan(FootOrgan leftFootOrgan) {
        this.leftFootOrgan = leftFootOrgan;
    }

    /**
     * @return armored titan
     */
    public static ArmoredTitan create() {
        return new ArmoredTitan(
                FaceOrgan.create(),
                NeckOrgan.create(),
                ArmOrgan.create(),
                ArmOrgan.create(),
                ChestOrgan.create(),
                StomachOrgan.create(),
                LegOrgan.create(),
                LegOrgan.create(),
                FootOrgan.create(),
                FootOrgan.create()
        );
    }
}
