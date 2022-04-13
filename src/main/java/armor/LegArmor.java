package armor;
import config.ConfigLoader;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * leg's armor class
 */
public class LegArmor extends Armor {
    /**
     * <p>this method sets the armor's durability and k by using super keyword and pass durability and k to Armor class </p>
     *
     * @param durability durability of the armor
     * @param k each k units damage will reduce one unit of durability
     */
    private LegArmor(double durability, double k) {
        super(durability, k);
    }

    /**
     * <p>this method creates a armor for leg and returns it</p>
     *
     * @return leg's armor
     */
    public static LegArmor create() throws IOException, ParseException {
        return new LegArmor( ConfigLoader.getDurability("leg"), ConfigLoader.getK("leg"));
    }
}
