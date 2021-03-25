package src.appline.task;
import java.util.Scanner;

public class TaskWork07 {

    public static void main(String[] args) {

        int x, y, z;
        x = 6;
        y = 12;
        z = 33;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите количество строк массива:");
        int a = scanner.nextInt();

        System.out.println("Укажите количество столбцов массива:");
        int b = scanner.nextInt();

        int[][] array = new int[a][b];
        for (int a1 = 0; a1 <  a; a1++) {
            for (int b1= 0;  b1 < b; b1++) {

                    System.out.println("Введите элемент №" + (b1 + 1) + " в строке №" + (a1 + 1));
                    array[a1][b1] = scanner.nextInt();
                if (array[a1][b1] == x) {
                    System.out.println("Данное значение имеется в константах");
                }
                if (array[a1][b1] == y) {
                    System.out.println("Данное значение имеется в константах");
                }
                if (array[a1][b1] == z) {
                    System.out.println("Данное значение имеется в константах");
                }
            }
        }
        scanner.close();
        // вывод полученного массива
        for (int i1 = 0; i1 < a; i1++) {
            for (int j1 = 0; j1 < b;  j1++){
                System.out.print(" " + array[i1][j1] + " ");
            }
            System.out.println();
        }
    }
    }






