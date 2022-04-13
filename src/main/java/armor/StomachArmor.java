package armor;
import config.ConfigLoader;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * stomach's armor class
 */
public class StomachArmor extends Armor {
    /**
     * <p>this method sets the armor's durability and k by using super keyword and pass durability and k to Armor class </p>
     *
     * @param durability durability of the armor
     * @param k each k units damage will reduce one unit of durability
     */
    private StomachArmor(double durability, double k) {
        super(durability, k);
    }

    /**
     * <p>this method creates a armor for stomach and returns it</p>
     *
     * @return stomach's armor
     */
    public static StomachArmor create() throws IOException, ParseException {
        return new StomachArmor(ConfigLoader.getDurability("stomach"), ConfigLoader.getK("stomach"));
    }
}
