import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;

public class Application {

    public static void main(String[] args) throws Exception {
        JSONObject jsonObject = (JSONObject) runObjectStream("target/object.json");
        Hero hero1 = new Hero(
                (String) jsonObject.get("name"),
                Integer.parseInt(jsonObject.get("age").toString()),
                (String) jsonObject.get("label"),
                (String) jsonObject.get("hairColor"));
        System.out.println(hero1);
    }

    private static Object runObjectStream(String filename) throws Exception {
        FileReader reader = new FileReader(filename);
        JSONParser jsonParser = new JSONParser();
        return jsonParser.parse(reader);
    }
}
