import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        double[] darr = {1.57, 7.654, 9.986};
        boolean[] barr = {true, false, true, false, true};

        for (int i = 0; i < darr.length; i++) {
            System.out.print(darr[i]);
            if (i < darr.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println();

        for (int i = 0; i < barr.length; i++) {
            System.out.print(barr[i]);
            if (i < barr.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println("Задача 3");
        for (int i = darr.length - 1; i >= 0; i--) {
            System.out.print(darr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        System.out.println("Задача 4");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = arr[i] + 1;
            }
                System.out.println(Arrays.toString(arr));
            }
        }
    }