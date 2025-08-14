package Records;

public record Student(String firstName, String lastName, int sutudentNumber) {

    // İsteğe bağlı olarak custom metot ekleyebilirsiniz
    public void displayInfo() {
        System.out.println("Ad: " + firstName);
        System.out.println("Soyad: " + lastName);
        System.out.println("Öğrenci No: " + sutudentNumber);
        System.out.println("----------------------------");
    }
}
