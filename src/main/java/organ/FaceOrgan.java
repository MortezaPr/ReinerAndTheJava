package organ;

import armor.FaceArmor;
import config.ConfigLoader;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * face's organ class
 */
public class FaceOrgan extends Organ {
    /**
     * <p>this method sets the organ's hp and armor by using super keyword and pass hp and armor to Organ class </p>
     *
     * @param hp hp of the organ
     */
    private FaceOrgan(double hp) throws IOException, ParseException {
        super(hp, FaceArmor.create());
    }

    /**
     * <p>this method creates a face organ and returns it</p>
     *
     * @return face's organ
     */
    public static FaceOrgan create() throws IOException, ParseException {
        return new FaceOrgan(ConfigLoader.getHP("face"));
    }
}
