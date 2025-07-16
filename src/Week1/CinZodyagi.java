package Week1;

import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan doğum yılı al
        System.out.print("Doğum yılınızı giriniz: ");
        int dogumYili = input.nextInt();

        // %12 sonucuna göre Çin Zodyağı burcu seçimi
        String[] burclar = {
                "Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz",
                "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"
        };

        int kalan = dogumYili % 12;
        String zodyak = burclar[kalan];

        // Sonucu yazdır
        System.out.println("Çin Zodyağı Burcunuz: " + zodyak);

        input.close();
    }
}

