package MethodReference;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Ayşe");
        names.add("Ahmet");
        names.add("Zeynep");
        names.add("Mehmet");

        //Metod Reference ile liste elemanlarını yazdırma
        names.forEach(System.out::println);

    }
}
