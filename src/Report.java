import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Report {
    private static final double USD_TO_RUB = 90.0;

    public static void generateReport(Employee[] employees, Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("report", locale);
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
        String currencySymbol = "₽";
        System.out.println(bundle.getString("report.title"));

        for (Employee emp : employees) {
            double salary = emp.getSalary();

            if (locale.equals(Locale.US)) {
                salary /= USD_TO_RUB;
                currencySymbol = "$";
            }

            String formattedSalary = numberFormat.format(salary);
            System.out.printf("%-20s %15s%n", emp.getFullName(), formattedSalary);
        }
    }
}
