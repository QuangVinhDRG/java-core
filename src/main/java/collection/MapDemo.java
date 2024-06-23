package collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Khoa", 3);
        map.put("Long", 1);
        map.put("Đạt", 2);
        map.put("Hà", 0);
        map.put("Khoa", 0); // Nếu cùng key thì ghi đè phần tử đã có trước đó

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            String key = pair.getKey();
            Integer value = pair.getValue();
            System.out.printf("👉 %s: %d%n", key, value);
        }
        // entrySet(): trả về cặp key - value
        // keys(): trả về tập hợp key
        // values(): trả về tập hợp value
    }
}
