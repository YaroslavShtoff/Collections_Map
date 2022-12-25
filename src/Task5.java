import java.util.LinkedHashMap;
import java.util.Map;

public class Task5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        int n = 10;
        for (int i = 0; i < n; i++) {
            map.put(i, String.valueOf(i));
        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+ entry.getValue());
        }
    }
}
