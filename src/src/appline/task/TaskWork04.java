package src.appline.task;
import java.util.Scanner;

public class TaskWork04
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число x:");
        double x = scanner.nextDouble();

        System.out.println("Введите число y:");
        double y = scanner.nextDouble();

        System.out.println("Введите число z:");
        double z = scanner.nextDouble();

        double mid, div;

        mid = (x + y + z) / 3.0;
        System.out.println("Среднее арифметическое для x, y, z = " + mid); // Выводим среднее арифметическое для x, y, z.

        div = mid/2.0;
        int findiv = (int) div;

        if (findiv > 3.0)
            System.out.println("Программа выполнена корректно");
    }

}