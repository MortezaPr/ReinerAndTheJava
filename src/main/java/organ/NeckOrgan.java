package organ;

import armor.NeckArmor;
import config.ConfigLoader;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * neck's organ class
 */
public class NeckOrgan extends Organ {
    /**
     * <p>this method sets the organ's hp and armor by using super keyword and pass hp and armor to Organ class </p>
     *
     * @param hp hp of the organ
     */
    private NeckOrgan(double hp) throws IOException, ParseException {
        super(hp, NeckArmor.create());
    }

    /**
     * <p>this method creates a neck organ and returns it</p>
     *
     * @return neck's organ
     */
    public static NeckOrgan create() throws IOException, ParseException {
        return new NeckOrgan(ConfigLoader.getHP("neck"));
    }
}
