package Week2;

import java.util.Scanner;

public class RecursiveAsalKontrol {
    // Recursive metot: sayının asal olup olmadığını kontrol eder
    static boolean isPrime(int number, int divisor) {
        // 2'den küçük sayılar asal değildir
        if (number < 2) {
            return false;
        }
        // Bölünecek sayıya kadar geldiysen asal demektir
        if (divisor == 1) {
            return true;
        }
        // Sayı kendisinden başka bir sayıya tam bölünüyorsa asal değildir
        if (number % divisor == 0) {
            return false;
        }
        // Bir önceki bölen ile tekrar kontrol et
        return isPrime(number, divisor - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz : ");
        int number = scanner.nextInt();

        boolean result = isPrime(number, number - 1);

        if (result) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }
    }
}