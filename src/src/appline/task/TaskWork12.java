package src.appline.task;
import java.util.Locale;
import java.util.Scanner;

public class TaskWork12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: I like Java!!!");
        String text = scanner.nextLine();

        boolean cont1 = text.contains("Java"); // Проверка на наличие Java в введённой строке.
        boolean cont2 = text.startsWith("I like"); // Проверка на наличие в начале введённой строки "I like".
        boolean cont3 = text.endsWith("!!!"); // Проверка на окончание "!!!" в введённой строке .

        if (cont1 && cont2 && cont3) {
            System.out.println(text.toUpperCase()); // Вывод введённой строки в верхнем регистре.
        }

        String texto = text.replaceAll("a", "o");
        System.out.println();
        System.out.println(texto.substring(7, 11));

    }

}
