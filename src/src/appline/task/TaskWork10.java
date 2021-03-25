package src.appline.task;
import java.util.Scanner;

public class TaskWork10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Укажите количество строк массива:");
        int a = scanner.nextInt();

        System.out.println("Укажите количество столбцов массива:");
        int b = scanner.nextInt();

        double[][] array = new double[a][b];
        for (int a1 = 0; a1 < a; a1++) {

            for (int b1 = 0; b1 < b; b1++) {

                System.out.println("Введите элемент №" + (b1 + 1) + " в строке №" + (a1 + 1));
                array[a1][b1] = scanner.nextDouble();

            }
        }
        scanner.close();

        System.out.println("Введённый массив:");
        // вывод полученного массива
        for (int i1 = 0; i1 < a; i1++) {
            for (int j1 = 0; j1 < b; j1++) {
                System.out.print(" " + array[i1][j1] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Вывод полученного массива, элементы которого умножены на число 3");
        for (int i1 = 0; i1 < a; i1++) {
            for (int j1 = 0; j1 < b; j1++) {
                System.out.print("" + (array[i1][j1] * 3) + " ");
            }
            System.out.println();

        }
    }
}