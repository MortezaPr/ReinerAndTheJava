package armor;
import config.ConfigLoader;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 *  foot's armor class
 */
public class FootArmor extends Armor {
    /**
     * <p>this method sets the armor's durability and k by using super keyword and pass durability and k to Armor class </p>
     *
     * @param durability durability of the armor
     * @param k each k units damage will reduce one unit of durability
     */
    private FootArmor(double durability, double k) {
        super(durability, k);
    }

    /**
     * <p>this method creates a armor for foot and returns it</p>
     *
     * @return foot's armor
     */
    public static FootArmor create() throws IOException, ParseException {
        return new FootArmor( ConfigLoader.getDurability("foot"), ConfigLoader.getK("foot"));
    }
}
