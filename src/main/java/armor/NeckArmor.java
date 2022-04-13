package armor;
import config.ConfigLoader;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * neck's armor class
 */
public class NeckArmor extends Armor {
    /**
     * <p>this method sets the armor's durability and k by using super keyword and pass durability and k to Armor class </p>
     *
     * @param durability durability of the armor
     * @param k each k units damage will reduce one unit of durability
     */
    private NeckArmor(double durability, double k) {
        super(durability, k);
    }

    /**
     * <p>this method creates a armor for neck and returns it</p>
     *
     * @return neck's armor
     */
    public static NeckArmor create() throws IOException, ParseException {
        return new NeckArmor(ConfigLoader.getDurability("neck"), ConfigLoader.getK("neck"));
    }
}
