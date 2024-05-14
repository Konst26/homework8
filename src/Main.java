import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задачи 1-2");
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] weights = {1.57, 7.654, 9.986};
        for (double a = 0; a < weights.length; a++) {
            System.out.print(weights[(int) a]);
            if (a < weights.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int[] mas = {10, 20, 30, 40, 50};
        for (int c = 0; c < mas.length; c++) {
            System.out.print(mas[c]);
            if (c < mas.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 3");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(i);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (double a = weights.length - 1; a >= 0; a--) {
            System.out.print(weights[(int) a]);
            if (a > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int c = mas.length - 1; c >= 0; c--) {
            System.out.print(mas[c]);
            if (c > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < arr.length; i++)
        if (arr[i] % 2 != 0) {
            arr[i] = arr[i] + 1;
        }
            System.out.println(Arrays.toString(arr));
        }
}
