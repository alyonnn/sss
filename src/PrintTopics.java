import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class PrintTopics {
    public static void printTopics(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("task1", locale);

        System.out.println("Темы по Java (" + locale.getDisplayLanguage() + "):");

        Set<String> keys = bundle.keySet();
        for (String key : keys) {
            System.out.println(bundle.getString(key));
        }
    }




    public static void main(String[] args) {
        System.out.println("Вывод на русском:");
        printTopics(new Locale("ru", "RU"));

        System.out.println("\nВывод на английском:");
        printTopics(new Locale("en", "EN"));
    }
}