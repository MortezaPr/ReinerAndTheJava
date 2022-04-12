package config;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ConfigLoader {

    static JSONParser jsonParser = new JSONParser();
    static FileReader reader;

    static {
        try {
            reader = new FileReader("C:\\Users\\NS\\Desktop\\ReinerAndTheJava\\src\\main\\java\\config\\config.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Double getHP(String organ) throws IOException, ParseException {
        JSONObject ArmoredTitan = parse();
        JSONObject Organ = (JSONObject) ArmoredTitan.get(organ);
        Object hp = Organ.get("hp");
        return asDouble(hp);
    }

    public static Double getDurability(String organ) throws IOException, ParseException {
        JSONObject ArmoredTitan = parse();
        JSONObject Organ = (JSONObject) ArmoredTitan.get(organ);
        JSONObject armor = (JSONObject) Organ.get("armor");
        Object durability = armor.get("durability");
        return asDouble(durability);
    }

    public static Double getK(String organ) throws IOException, ParseException {
        JSONObject ArmoredTitan = parse();
        JSONObject Organ = (JSONObject) ArmoredTitan.get(organ);
        JSONObject armor = (JSONObject) Organ.get("armor");
        Object k = armor.get("k");
        return asDouble(k);
    }

    private static Double asDouble(Object o) {
        Double val = null;
        if (o instanceof Number) {
            val = ((Number) o).doubleValue();
        }
        return val;
    }

    public static JSONObject parse() throws IOException, ParseException {
        Object obj = jsonParser.parse(reader);
        JSONObject jsObj = (JSONObject) obj;
        JSONObject titansConfig = (JSONObject) jsObj.get("titansConfig");
        return (JSONObject) titansConfig.get("ArmoredTitan");
    }
}
