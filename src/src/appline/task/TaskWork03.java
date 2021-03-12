package src.appline.task;

import java.util.Arrays;

public class TaskWork03
{
    public static void main(String[] args)
    {
        int[] myArray01 = {1, 5, 6, 7, 9}; //1. Задайте массив из 5 любых целых чисел.

        int boof;
        boof = myArray01[0];
        myArray01[0] = myArray01[myArray01.length - 1];
        myArray01[myArray01.length - 1] = boof; // 2. Поменяйте местами первый и последний элемент в массиве.

        System.out.println(Arrays.toString(myArray01)); // Проверка корректности перестановки элементов массива.

        System.out.println(myArray01[0]+ myArray01[myArray01.length - 3]); //3. Вывести в консоль результат суммы первого и среднего элемента.
    }

}


