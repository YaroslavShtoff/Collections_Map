import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class  Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("String1", List.of(1, 6, 12));
        map.put("String2", List.of(200, 150, 350));

        /* int mapSize = 5;
        int listSize = 3;
        for (int i = 0; i < mapSize; i++) {
            List<Integer> numbers = new ArrayList<>(3);
            for (int j = 0; j < listSize; j++) {
                numbers.add(random.nextInt(1_000));

            }
            map.put(String.valueOf(i),numbers);
        }*/
        System.out.println(map);

        Map<String, Integer> transformedMap = new HashMap<>();
        for (Map.Entry<String, List<Integer>> entry : map.entrySet()) {
            int sum = 0;
            List<Integer> numbers = entry.getValue();
            for (Integer number:numbers) {
                sum += number;
                transformedMap.put(entry.getKey(), sum);
            }
            System.out.println(transformedMap);
        }

    }
}
