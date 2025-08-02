package Week3;

import java.util.HashMap;
import java.util.Map;

public class MapYazdirma {
    public static void main(String[] args) {
        // Map oluşturuluyor
        Map<String, Integer> scores = new HashMap<>();

        scores.put("Ali", 85);
        scores.put("Ayşe", 92);
        scores.put("Mehmet", 78);
        scores.put("Zeynep", 90);
        scores.put("Burak", 88);

        // Map içeriğini satır satır yazdırma
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
