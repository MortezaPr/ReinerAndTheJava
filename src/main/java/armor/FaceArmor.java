package armor;
import config.ConfigLoader;
import org.json.simple.parser.ParseException;

import java.io.IOException;

/**
 * face's armor class
 */
public class FaceArmor extends Armor {
    /**
     * <p>this method sets the armor's durability and k by using super keyword and pass durability and k to Armor class </p>
     *
     * @param durability durability of the armor
     * @param k each k units damage will reduce one unit of durability
     */
    private FaceArmor(double durability, double k) {
        super(durability, k);
    }

    /**
     * <p>this method creates a armor for face and returns it</p>
     *
     * @return face's armor
     */
    public static FaceArmor create() throws IOException, ParseException {
        return new FaceArmor(ConfigLoader.getDurability("face"), ConfigLoader.getK("face"));
    }
}
