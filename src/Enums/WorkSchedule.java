package Enums;

import java.util.Scanner;

public class WorkSchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir gün girin (Örn: MONDAY): ");
        String input = scanner.nextLine().trim().toUpperCase();
        
        try {
            Day day = Day.valueOf(input);
            System.out.println(day + " günü çalışma saatleri: " + day.getWorkingHours());
        } catch (IllegalArgumentException e) {
            System.out.println("Geçersiz gün girdiniz!");
        }
    }
}
