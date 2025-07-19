package Week1;

public class ReverseTriangle {
    public static void main(String[] args) {

        // Basamak sayısı sabit olarak 10 atanıyor
        int basamak = 10;

        // Dış döngü: Her bir satırı temsil eder (10'dan 1'e kadar azalır)
        for (int i = basamak; i >= 1; i--) {

            // İç döngü: Her satırda yazılacak yıldız (*) sayısı = (2 * i) - 1
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*"); // Yıldız yazdırılır
            }

            System.out.println(); // Her satırdan sonra alt satıra geçilir
        }
    }
}
