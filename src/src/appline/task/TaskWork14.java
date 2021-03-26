package src.appline.task;

import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class TaskWork14 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            arr[i] = random.nextInt(40 + 1) - 20; // [(20 - (-20) + 1) + (-20)] → (максимальное значение - минимальное значение) + минимальное значение; "+1" - для захвата границ диапазона.
        }

        int curvalmax, curvalmin;
        curvalmax = arr[0];
        curvalmin = arr[0];

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] > curvalmax) {
                curvalmax = arr[j];
            }
        }
        System.out.println("Максимальный элемент массива = " + curvalmax);

        for (int j = 0; j < arr.length; j++) {

            if (arr[j] < curvalmin) {
                curvalmin = arr[j];
            }
        }

        System.out.println("Минимальный элемент массива = " + curvalmin);

        int absmin = Math.abs(curvalmin);
        int absmax = Math.abs(curvalmax);

        if (absmin > absmax) {
            System.out.println("Наибольшее значение массива по модулю = " + absmin);
        } else if (absmin < absmax)
            System.out.println("Наибольшее значение массива по модулю = " + absmax);
    }
}