package Week1;

import java.util.Scanner;

public class AritmatikIslemler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("a sayısını girin: ");
        int a = input.nextInt();

        System.out.println("b sayısını girin: ");
        int b = input.nextInt();

        System.out.println("c sayısını girin: ");
        int c = input.nextInt();

        int sonuc = a + b * c - b;

        System.out.println("İşlem Sonucu: " + sonuc);

        input.close();
    }
}
