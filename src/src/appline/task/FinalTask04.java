package src.appline.task;

import java.util.Scanner;

public class FinalTask04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает.");
        String answer = scanner.nextLine();
        boolean help = false;

        for (int i = 0; i < 3; i++) {
            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                return;
            }

            if (answer.equalsIgnoreCase("Подсказка") && i == 0) {
                help = true;
                System.out.println("Не лук.");
                answer = scanner.nextLine();
            } else if (answer.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
                answer = scanner.nextLine();
                i--;
            } else if (help) {
                System.out.println("Обидно, приходи в другой раз.");
                return;
            } else if (i == 2) {
                break;
            } else {
                System.out.println("Подумай еще!");
                answer = scanner.nextLine();
            }
        }
        System.out.println("Обидно, приходи в другой раз.");
    }
}