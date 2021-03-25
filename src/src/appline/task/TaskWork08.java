package src.appline.task;
import java.util.Scanner;

public class TaskWork08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите любое целое положительное число:");
        int n = scanner.nextInt();
        scanner.close();

        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 2 == 1) {
                sum = sum + i;
            }
        }

        System.out.println("Сумма всех положительных нечётных чисел до " + n + " = " + sum );
        }

    }