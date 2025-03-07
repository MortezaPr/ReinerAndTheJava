package organ;

import armor.StomachArmor;
import config.ConfigLoader;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * stomach's organ class
 */
public class StomachOrgan extends Organ {
    /**
     * <p>this method sets the organ's hp and armor by using super keyword and pass hp and armor to Organ class </p>
     *
     * @param hp hp of the organ
     */
    private StomachOrgan(double hp) throws IOException, ParseException {
        super(hp, StomachArmor.create());
    }

    /**
     * <p>this method creates a stomach organ and returns it</p>
     *
     * @return stomach's organ
     */
    public static StomachOrgan create() throws IOException, ParseException {
        return new StomachOrgan(ConfigLoader.getHP("stomach"));
    }
}
