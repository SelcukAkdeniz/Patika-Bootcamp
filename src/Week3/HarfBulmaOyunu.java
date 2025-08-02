package Week3;

import java.util.ArrayList;
import java.util.Scanner;

public class HarfBulmaOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Başlangıçta rastgele harf içeren 4 elemanlı bir liste oluştur
        ArrayList<String> harfListesi = new ArrayList<>();
        harfListesi.add("a");
        harfListesi.add("b");
        harfListesi.add("c");
        harfListesi.add("d");

        // 2. Kullanıcıdan 4 kez harf girişi al
        for (int i = 1; i <= 4; i++) {
            System.out.print(i + ". harfi giriniz: ");
            String girilenHarf = scanner.nextLine().toLowerCase();

            if (harfListesi.contains(girilenHarf)) {
                // Harf listede varsa, ilk bulunduğu indekse "found" yaz
                int index = harfListesi.indexOf(girilenHarf);
                harfListesi.set(index, "found");
                System.out.println("Harf bulundu, 'found' ile değiştirildi.");
            } else {
                // Harf listede yoksa, listeye ekle
                harfListesi.add(girilenHarf);
                System.out.println("Harf bulunamadı, listeye eklendi.");
            }
        }

        // 3. Güncellenmiş listeyi yazdır
        System.out.println("Güncellenmiş Liste: " + harfListesi);
        scanner.close();
    }
}
