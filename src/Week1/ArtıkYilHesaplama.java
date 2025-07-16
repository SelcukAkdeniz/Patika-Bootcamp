package Week1;

import java.util.Scanner;

public class ArtıkYilHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan yıl al
        System.out.print("Yıl Giriniz: ");
        int yil = input.nextInt();

        // Artık yıl kontrolü
        boolean artikYilMi;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                // Yıl hem 4'e hem 100'e bölünüyor -> 400'e de bölünmeli
                artikYilMi = (yil % 400 == 0);
            } else {
                // Sadece 4'e bölünüyorsa artık yıldır
                artikYilMi = true;
            }
        } else {
            // 4'e bile bölünmüyorsa kesinlikle artık yıl değildir
            artikYilMi = false;
        }

        // Sonucu yazdır
        if (artikYilMi) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

        input.close();
    }
}

