package src.appline.task;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TaskWork13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = scanner.nextLine(); //Вводим строку с клавиаитуры.

        String[] duch = text.split(" ");
        int count = 0;
        System.out.println("Слова, состоящие только из латиницы:");

        for (String str : duch) {
            if (str.matches("^[a-zA-Z]+$")) {

                System.out.println(str);
                count++;
            }
        }
        System.out.println("Количество слов состоящие только из латиницы: " + count);
    }
}
