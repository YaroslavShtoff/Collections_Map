import java.util.HashMap;
import java.util.Map;

public class Task3 {
    private static Map<String, Integer> Map = new HashMap<>();


    public static void main(String[] args) {
        Map.put("str1",2);
        System.out.println(Map);
        tryPut("str2",1);
        System.out.println(Map);
        try {
            tryPut("str1", 2);
        } catch (IllegalArgumentException ignored) {
            System.out.println(ignored.getMessage());
        }
        tryPut("str1",5);
        System.out.println(Map);
    }

    private static void tryPut(String key, Integer value) {
        if (Map.containsKey(key) && Map.get(key).equals(value)) {
            throw new IllegalArgumentException("Такой ключ и значение уже есть в карте");
        }
        Map.put(key, value);
    }

}
