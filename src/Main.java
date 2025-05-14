import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Матусевич Алена", 10000),
                new Employee("Белоусов Стас", 60000),
                new Employee("Гершончик Лера", 35000),
                new Employee("Козлов Тимофей", 55000),
                new Employee("Гордеев Николай", 70000)
        };
        System.out.println("Отчёт на английском:");
        Report.generateReport(employees, new Locale("en", "US"));
        System.out.println("Отчёт на русском:");
        Report.generateReport(employees, new Locale("ru", "RU"));
    }
}