package Week2;

import java.util.Scanner;

public class CarpimTablosu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üst sınırı giriniz (1-10): ");
        int n = scanner.nextInt();

        // Girdi kontrolü
        if (n < 1 || n > 10) {
            System.out.println("Hatalı giriş! Lütfen 1 ile 10 arasında bir sayı giriniz.");
            return; // Programı sonlandır
        }

        System.out.println("\nÇarpım Tablosu (" + n + " x " + n + "):\n");

        //Çarpım tablosu oluşturma
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%-4d", i * j); //Biçimli çıktı, 4 karakter genişlikte
            }
            System.out.println(); // Her satırdan sonra alt satıra geç
        }

    }
}
