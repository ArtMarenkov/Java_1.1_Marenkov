package src.appline.task;

import java.util.Scanner;

public class FinalTask02 {

    public static void main(String[] args) {

        System.out.println("Введите уравнение");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        int a, b, res, var;
        //int eq = Character.getNumericValue(text.charAt(4));

        a = 0;
        b = 0;
        res = 0;
        var = 0;

        if (text.charAt(0) == 'x') {
            a = Character.getNumericValue(text.charAt(2));
            b = Character.getNumericValue(text.charAt(4));
            var = 1;
        } else if (text.charAt(2) == 'x') {
            a = Character.getNumericValue(text.charAt(0));
            b = Character.getNumericValue(text.charAt(4));
            var = 2;
        } else if (text.charAt(4) == 'x') {
            a = Character.getNumericValue(text.charAt(0));
            b = Character.getNumericValue(text.charAt(2));
            var = 3;
        }

        switch (var) {
            case 1:
                if (text.charAt(1) == '+') {
                    res = b - a;
                } else if (text.charAt(1) == '-') {
                    res = b + a;
                }
                break;
            case 2:
                if (text.charAt(1) == '+') {
                    res = b - a;
                } else if (text.charAt(1) == '-') {
                    res = a - b;
                }
                break;
            case 3:
                if (text.charAt(1) == '+') {
                    res = a + b;
                } else if (text.charAt(1) == '-') {
                    res = a - b;
                }
                break;
            default: ;
                ;
        }
        System.out.println(res);
    }
}