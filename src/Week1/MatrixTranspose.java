package Week1;

public class MatrixTranspose {
    public static void main(String[] args) {

        // Örnek matris (2x3)
        int[][] matrix = {
                {2, 3, 4},
                {5, 6, 4}
        };

        // Satır ve sütun sayılarını alalım
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Transpoz matrisini oluşturalım (3x2 olacak)
        int[][] transpose = new int[cols][rows];

        // Matrisin transpozunu hesaplayalım
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j]; // Satır ve sütun yer değiştiriyor
            }
        }

        // Orijinal matrisin yazdırılması
        System.out.println("Matris : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }

        // Transpoz matrisin yazdırılması
        System.out.println("Transpoze : ");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
