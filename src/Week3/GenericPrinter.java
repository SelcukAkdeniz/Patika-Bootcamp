package Week3;

public class GenericPrinter {

    // Generic metot tanımı
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println(); // Satır sonu
    }

    // Test etmek için main metodu
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"Java", "Generics", "Ödev"};
        Double[] doubleArray = {3.14, 2.71, 1.41};

        printArray(intArray);
        printArray(strArray);
        printArray(doubleArray);
    }
}

