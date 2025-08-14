package Records;

public class Main {
    public static void main(String[] args) {

        //Student nesneleri oluşturmak
        Student student1 = new Student("Ali", "Biner", 101);
        Student student2 = new Student("Ayşe", "Yılmaz", 102);
        Student student3 = new Student("Ali", "Biner", 101); // student ile aynı bilgiler

        //Bilgileri ekrana yazdırmak
        student1.displayInfo();
        student2.displayInfo();

        //hashCode ve equals kontrolü
        System.out.println("student1.equals(student3): " + student1.equals(student3));
        System.out.println("student1.hashCode() == student3.hashCode(): " + (student1.hashCode() == student3.hashCode()));

    }
}
