package Innerclass;

public class Employee {

    private String firstname;
    private String lastName;
    private ContactInfo contactInfo;

    //Dış sınıfın constructor'ı
    public Employee(String firstname, String lastName, String phone, String email) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.contactInfo = new ContactInfo(phone, email); // Inner Class kullanımı
    }

    //İç sınıf - ContactInfo
    public class ContactInfo {
        private String phoneNumber;
        private String email;

        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getEmail() {
            return email;
        }
    }

    //Çalışan bilgilerini gösteren metot
    public void displayEmployeeInfo() {
        System.out.println("Çalışan: " + firstname + "" + lastName);
        System.out.println("Telefon: " + contactInfo.getPhoneNumber());
        System.out.println("E-posta: " + contactInfo.getEmail());
        System.out.println("----------------------------");
    }

    //Test için main metodu
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ali", "Biner", "0555 123 45 67", "ali.biner@example.com");
        Employee emp2 = new Employee("Ayşe", "Yılmaz", "0532 987 65 43", "ayse.yilmaz@example.com");

        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
    }
}
