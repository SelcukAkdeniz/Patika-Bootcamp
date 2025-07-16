package Week1;

import java.util.Scanner;

class VucutKitleIndeksi {
    public static void main(String[] args) {
        // Kullanıcıdan veri almak için Scanner sınıfı
        Scanner input = new Scanner(System.in);

        // Boy ve kilo değişkenleri
        double boy, kilo, vki;

        // Kullanıcıdan boy ve kilo alma
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kilo = input.nextDouble();

        // Vücut Kitle İndeksi hesaplama
        vki = kilo / (boy * boy);

        // Sonucu ekrana yazdırma
        System.out.println("Vücut Kitle İndeksiniz: " + vki);

        input.close();
    }
}
