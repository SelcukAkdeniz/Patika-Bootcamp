package Week3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HarfFrekansi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kelimeleri giriniz: ");
        String kelime = scanner.nextLine();

        // Tüm karakterleri küçük harfe çeviriyoruz
        kelime = kelime.toLowerCase();

        // Harf frekanslarını tutacak Map
        Map<Character, Integer> harfSayilari = new HashMap<>();

        // Her karakteri kontrol et
        for (char c : kelime.toCharArray()) {
            if (Character.isLetter(c)) { // Sadece harfleri say
                harfSayilari.put(c, harfSayilari.getOrDefault(c, 0) + 1);
            }
        }

        // Sonucu yazdır
        for (Map.Entry<Character, Integer> entry : harfSayilari.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        scanner.close();
    }
}
