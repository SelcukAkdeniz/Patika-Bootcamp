package Week2;

import java.util.Scanner;

public class SayiyiYuvarla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan ondalıklı sayı alınır.
        System.out.println("Ondalıklı bir sayı giriniz: ");
        double sayi = scanner.nextDouble();

        // Aşağı, yukarı ve en yakın sayıya yuvarlama işlemleri.
        int asagiYuvarla = (int) Math.floor(sayi); //Aşağı yuvarlamak.
        int yukariYuvarla = (int) Math.ceil(sayi); //Yukarı yuvarlamak.
        int enYakin = (int) Math.round(sayi); //En yakın tam sayı

        //Sonuçları ekrana yazdırmak.
        System.out.println("Aşağı yuvarlamak: " + asagiYuvarla);
        System.out.println("Yukarı yuvarlamak: " + yukariYuvarla);
        System.out.println("En yakın tam sayı: " + enYakin);
    }
}
