package armor;
import config.ConfigLoader;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * chest's armor class
 */
public class ChestArmor extends Armor {
    /**
     *<p>this method sets the armor's durability and k by using super keyword and pass durability and k to Armor class </p>
     *
     * @param durability durability of the armor
     * @param k each k units damage will reduce one unit of durability
     */
    private ChestArmor(double durability, double k) {
        super(durability, k);
    }

    /**
     * <p>this method creates a armor for chest and returns it</p>
     *
     * @return chest's armor
     */
    public static ChestArmor create() throws IOException, ParseException {
        return new ChestArmor(ConfigLoader.getDurability("chest"), ConfigLoader.getK("chest"));
    }
}
