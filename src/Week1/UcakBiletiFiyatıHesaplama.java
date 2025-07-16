package Week1;

import java.util.Scanner;

public class UcakBiletiFiyatıHesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan veri alma
        System.out.print("Mesafeyi km türünden giriniz: ");
        int mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        int yolculukTipi = input.nextInt();

        // Girdi kontrolü
        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            double birimFiyat = 0.10;
            double normalTutar = mesafe * birimFiyat;
            double yasIndirimOrani = 0.0;

            // Yaş indirimi oranını belirleme
            if (yas < 12) {
                yasIndirimOrani = 0.50;
            } else if (yas >= 12 && yas <= 24) {
                yasIndirimOrani = 0.10;
            } else if (yas > 65) {
                yasIndirimOrani = 0.30;
            }

            // Yaş indirimi
            double yasIndirimi = normalTutar * yasIndirimOrani;
            double indirimliTutar = normalTutar - yasIndirimi;

            // Gidiş-dönüş indirimi
            double gidisDonusIndirimi = 0.0;
            if (yolculukTipi == 2) {
                gidisDonusIndirimi = indirimliTutar * 0.20;
                indirimliTutar = (indirimliTutar - gidisDonusIndirimi) * 2;
            }

            // Sonuç yazdırma
            System.out.printf("Toplam Tutar : %.2f TL\n", indirimliTutar);
        }

        input.close();
    }
}

