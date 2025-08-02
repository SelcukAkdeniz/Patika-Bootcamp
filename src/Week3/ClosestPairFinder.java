package Week3;

import java.util.ArrayList;
import java.util.Collections;

public class ClosestPairFinder {
    public static void main(String[] args) {
        // 1. ArrayList oluştur ve 10 benzersiz, pozitif sayı ekle
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(17);
        numbers.add(9);
        numbers.add(25);
        numbers.add(14);
        numbers.add(8);
        numbers.add(40);
        numbers.add(33);
        numbers.add(13);
        numbers.add(22);

        // 2. Listeyi küçükten büyüğe sırala
        Collections.sort(numbers);

        // 3. En küçük farkı bulmak için değişkenleri hazırla
        int minDiff = Integer.MAX_VALUE;
        int num1 = 0, num2 = 0;

        // 4. Komşu elemanlar arasındaki farkı karşılaştır
        for (int i = 0; i < numbers.size() - 1; i++) {
            int diff = Math.abs(numbers.get(i) - numbers.get(i + 1));
            if (diff < minDiff) {
                minDiff = diff;
                num1 = numbers.get(i);
                num2 = numbers.get(i + 1);
            }
        }

        // 5. Sonuçları yazdır
        System.out.println("Dizi: " + numbers);
        System.out.println("Birbirine en yakın iki sayı: " + num1 + " ve " + num2);
        System.out.println("Aralarındaki fark: " + minDiff);
    }
}
