package Lambdas;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //Lambda ile sayıları iki katına çıkartmak
        numbers.replaceAll(n -> n * 2);

        //Lambda ile sonuçları yazdırmak
        numbers.forEach(n -> System.out.println(n));
    }
}
