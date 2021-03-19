package src.appline.task;
import java.util.Scanner;

public class TaskWork05
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double x = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double y = scanner.nextDouble();

        System.out.println("Введите желаемую операцию из указанных ниже.");
        System.out.println("'+' для сложения;");
        System.out.println("'-' для вычитания;");
        System.out.println("'*' для умножения;");
        System.out.println("'/' для деления;");
        System.out.println("↓ Поле для ввода ↓");

        String oper = scanner.next();

       switch (oper) {
           case "+":
               System.out.println("Результат: " + (x+y));
               break;
           case "-":
               System.out.println("Результат: " + (x-y));
               break;
           case "*":
               System.out.println("Результат: " + (x*y));
               break;
           case "/":
               if (y == 0)
                   System.out.println("На ноль делить нельзя!");
               else
                   System.out.println("Результат: " + (x/y));
               break;
           default:
               System.out.println("Некорректная операция.");
               break;
       }

    }

}