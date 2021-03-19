package src.appline.task;
import java.util.Scanner;

public class TaskWork06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите что переводить:");
        System.out.println("'1' - масса;");
        System.out.println("'2' - расстояние;");
        System.out.println("↓ Поле для ввода ↓");
        int val = scanner.nextInt();

        switch (val) {
            case 1:
                System.out.println("Выберите что переводить:");
                System.out.println("'1' - Килограмм;");
                System.out.println("'2' - Фунт;");
                System.out.println("'3' - Унция;");
                System.out.println("'4' - Пуд;");
                System.out.println("↓ Поле для ввода ↓");
                int wght = scanner.nextInt();

                if ((wght == 1) | (wght == 2) | (wght == 3) | (wght == 4)) {

                    System.out.println("Введите количество единиц для подсчёта:");
                    System.out.println("↓ Поле для ввода ↓");
                    double reswght = scanner.nextDouble();

                    switch (wght) {
                        case 1:
                            System.out.println("Килограммы: " + reswght);
                            System.out.println("Фунты: " + (2.2046 * reswght));
                            System.out.println("Унции: " + (35.274 * reswght));
                            System.out.println("Пуды: " + (0.06105 * reswght));
                            break;
                        case 2:
                            System.out.println("Килограммы: " + (0.4536 * reswght));
                            System.out.println("Фунты: " + reswght);
                            System.out.println("Унции: " + (16 * reswght));
                            System.out.println("Пуды: " + (0.0277 * reswght));
                            break;
                        case 3:
                            System.out.println("Килограммы: " + (0.02835 * reswght));
                            System.out.println("Фунты: " + (0.0625 * reswght));
                            System.out.println("Унции: " + reswght);
                            System.out.println("Пуды: " + (0.00173 * reswght));
                            break;
                        case 4:
                            System.out.println("Килограммы: " + (16.3805 * reswght));
                            System.out.println("Фунты: " + (36.1128 * reswght));
                            System.out.println("Унции: " + (577.805 * reswght));
                            System.out.println("Пуды: " + reswght);
                            break;
                        default:
                            System.out.println("Некорректный ввод единицы массы.");
                            break;
                    }
                    break;
                }
                else {
                        System.out.println("Некорректный ввод единицы измерения.");
                        break;
                    }

            case 2:
                System.out.println("Выберите что переводить:");
                System.out.println("'1' - Метр;");
                System.out.println("'2' - Миля;");
                System.out.println("'3' - Ярд;");
                System.out.println("'4' - Фут;");
                System.out.println("↓ Поле для ввода ↓");
                int lght = scanner.nextInt();

                if ((lght == 1) | (lght == 2) | (lght == 3) | (lght == 4)) {

                    System.out.println("Введите количество единиц для подсчёта:");
                    System.out.println("↓ Поле для ввода ↓");
                    double reslght = scanner.nextDouble();

                    switch (lght) {
                        case 1:
                            System.out.println("Метр: " + reslght);
                            System.out.println("Миля: " + (0.0006 * reslght));
                            System.out.println("Ярд: " + (1.0936 * reslght));
                            System.out.println("Фут: " + (3.2808 * reslght));
                            break;
                        case 2:
                            System.out.println("Метр: " + (1609.344 * reslght));
                            System.out.println("Миля: " + reslght);
                            System.out.println("Ярд: " + (1760 * reslght));
                            System.out.println("Фут: " + (5280 * reslght));
                            break;
                        case 3:
                            System.out.println("Метр: " + (0.9144 * reslght));
                            System.out.println("Миля: " + (0.00057 * reslght));
                            System.out.println("Ярд: " + reslght);
                            System.out.println("Фут: " + (3 * reslght));
                            break;
                        case 4:
                            System.out.println("Метр: " + (0.3048 * reslght));
                            System.out.println("Миля: " + (0.000189 * reslght));
                            System.out.println("Ярд: " + (0.3333 * reslght));
                            System.out.println("Фут: " + reslght);
                            break;
                        default:
                            System.out.println("Некорректный ввод единицы длины.");
                            break;
                    }
                    break;
                }
                else {
                    System.out.println("Некорректный ввод единицы измерения.");
                    break;
                }
            default:
                System.out.println("Некорректный ввод величины измерения.");
                break;
        }

    }
}