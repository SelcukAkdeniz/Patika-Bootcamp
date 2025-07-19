package Week1;

import java.util.Scanner;

public class MaxMinFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz? : ");
        int n = input.nextInt();

        // En küçük ve en büyük değerleri tutacak değişkenler
        int min = Integer.MAX_VALUE;  // Başlangıç için en büyük int değeri
        int max = Integer.MIN_VALUE;  // Başlangıç için en küçük int değeri

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int number = input.nextInt();

            if (number < min) {
                min = number;
            }

            if (number > max) {
                max = number;
            }
        }

        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}

