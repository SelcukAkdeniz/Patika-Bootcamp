package Enums;

public enum Day {
    SUNDAY("KAPALI"),
    MONDAY("09:00 - 17:00"),
    TUESDAY("10:00 - 18:00"),
    WEDNESDAY("08:30 - 16:30"),
    THURSDAY("09:30 - 17:30"),
    FRIDAY("08:00 - 14:00"),
    SATURDAY("12:00 - 20:00");

    private final String workingHours; // Her günün çalışma saatini tutan değişken

    // Enum constructor – dışarıdan çağrılamaz, sadece enum sabitleri içinde kullanılır
    Day(String workingHours) {
        this.workingHours = workingHours;
    }

    public String getWorkingHours() {
        return workingHours;
    }


}

