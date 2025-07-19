package Week1;

import java.util.Scanner;

public class PerfectNumberChecker {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int sum = 0;

        // 1'den number-1'e kadar olan sayılarla bölen kontrolü yapılır
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        // Mükemmel sayı kontrolü
        if (sum == number && number > 0) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }

        input.close();
    }
}

