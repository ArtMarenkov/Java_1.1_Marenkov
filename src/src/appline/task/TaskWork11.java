package src.appline.task;
import java.net.Inet4Address;
import java.util.Scanner;

public class TaskWork11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        String val1 = scanner.nextLine(); //Вводим первое число с клавиатуры и записываем его в строковую переменную.

        System.out.println("Введите второе число:");
        int val2 = scanner.nextInt(); // Вводим второе число с клавиатуры. Тип переменной - int.
        System.out.println();

        scanner.close();

        int ival1 = Integer.parseInt(val1); //подготавливаем первое число к сравнению со вторым.

        double dval1 = (double) ival1; // подготавливаем первое число к выводу в формате double.
        double dval2 = (double) val2; // подготавливаем второе число к выводу в формате double.

        if (ival1 > val2) {
            System.out.println("Большее число: " + val1);
            System.out.println("Меньшее число в формате double: " + dval2);
        }
        else if (ival1 < val2) {
            System.out.println("Большее число: " + val2);
            System.out.println("Меньшее число в формате double: " + dval1);
        }
    }
}
