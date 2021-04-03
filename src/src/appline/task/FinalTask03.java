package src.appline.task;

import java.util.Scanner;

public class FinalTask03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк и сами строки:");

        String[] input = new String[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextLine();
        }

        scanner.close();

        double[] coeffs = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            char[] charStr = input[i].toCharArray();
            int sum = findDuplicates(charStr);

            double k = (double) input[i].length() - sum;
            coeffs[i] = k;
        }

        double max = coeffs[0];
        int num = 0;
        for (int i = 0; i < coeffs.length; i++) {
            if (max < coeffs[i]) {
                max = coeffs[i];
                num = i;
            }
        }

        System.out.println("Ответ:" + input[num]);

    }

    private static int findDuplicates(char[] char1) {
        int duplicateCount = 0;
        for (int i = 0; i < char1.length; i++) {
            for (int j = i + 1; j < char1.length; j++) {
                if (char1[i] == char1[j]) {
                    ++duplicateCount;
                }
            }
        }
        return duplicateCount;
    }
}