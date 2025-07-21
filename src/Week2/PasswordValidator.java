package Week2;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Kullanıcıdan şifre alınır.
        System.out.println("Lütfen şifrenizi giriniz: ");
        String password = scanner.nextLine();

        //Kurallara göre kontrol yapılır.
        boolean isValid = true;

        // 1. En az 8 karakter olmalıdır.
        if (password.length() < 8) {
            isValid = false;
        }

        // 2. Boşluk karakteri olmamalıdır.
        if (password.contains(" ")) {
            isValid = false;
        }

        //3. ilk harf büyük olmalıdır.
        if (!Character.isUpperCase(password.charAt(0))) {
            isValid = false;
        }

        //4. Son karakter '?' olmalıdır.
        if (password.charAt(password.length() -1) != '?') {
            isValid = false;
        }

        //Sonuç yazdırılması
        if (isValid) {
            System.out.println("Geçerli şifre");
        } else {
            System.out.println("Geçersiz şifre");
        }
    }
}
