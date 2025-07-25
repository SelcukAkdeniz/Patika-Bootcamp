package Week2;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    //Kurucu metot
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    //Vergi hesaplamak
    public double tax() {
        if (salary < 1000) {
            return 0;
        }
        else {
            return salary * 0.03;
        }
    }
    //Bonus hesaplamak
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        }
        else {
            return 0;
        }
    }
    //Maaş artışı hesaplamak
    public double raiseSalary() {
        int currentYear = 2021;
        int yearWorked = currentYear - hireYear;

        if (yearWorked < 10) {
            return salary * 0.05;
        }else if (yearWorked < 20) {
            return salary * 0.10;
        }else {
            return salary * 0.15;
        }
    }

    // Bilgileri yazdırmak.
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();
        double salaryWithTaxAndBonus = salary - tax + bonus;
        double totalSalary = salary + raise;

        return "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax + "\n" +
                "Bonus : " + bonus + "\n" +
                "Maaş Artışı : " + raise + "\n" +
                "Vergi ve Bonunlar ile maaş : " + salaryWithTaxAndBonus + "\n" +
                "Toplam Maaş : " + totalSalary;
    }
    //Test etmek için main metodu
    public static void main(String[] args) {
        Employee emp = new Employee("Kemal", 2000.0, 45,1985);
        System.out.println(emp.toString());
    }
}
