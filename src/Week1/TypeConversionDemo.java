package Week1;

import java.util.Scanner;

public class TypeConversionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan tam sayı alınır
        System.out.print("Bir tam sayı giriniz: ");
        int intNumber = scanner.nextInt();

        // Kullanıcıdan ondalıklı sayı alınır
        System.out.print("Bir ondalıklı sayı giriniz: ");
        double doubleNumber = scanner.nextDouble();

        // int -> double dönüşümü (otomatik - widening casting)
        double convertedDouble = intNumber;

        // double -> int dönüşümü (manuel - narrowing casting)
        int convertedInt = (int) doubleNumber;

        // Sonuçlar ekrana yazdırılır
        System.out.println("\n--- Tip Dönüşüm Sonuçları ---");
        System.out.println("Tam sayı (int): " + intNumber + " -> Ondalıklı (double): " + convertedDouble);
        System.out.println("Ondalıklı (double): " + doubleNumber + " -> Tam sayı (int): " + convertedInt);
    }
}
