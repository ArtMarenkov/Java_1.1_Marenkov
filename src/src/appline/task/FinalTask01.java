package src.appline.task;

import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class FinalTask01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текущий курс доллара к рублю:");
        double buck = scanner.nextDouble();

        System.out.println("Введите количество рублей:");
        double rubl = scanner.nextDouble();

        scanner.close();

        double res;

        res = rubl / buck;

        String finres = String.format("%.2f", res);

        System.out.println("Итого: " + finres + " долларов");


    }

}