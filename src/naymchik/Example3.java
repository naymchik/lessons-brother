package naymchik;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значение х");
        int x = scan.nextInt();
        System.out.println("Вы ввели значение х=" + x);
        System.out.println("Введите значение y");
        int y = scan.nextInt();
        System.out.println("Вы ввели значение y=" + y);
        double q = Math.pow((x + 1) / (x - 1), x);
        double q1 = 18 * x * y * y;
        double q2 = Math.abs(x * x - x * x * x);
        double q3 = (double) (7 * x) / (x * x * x - 15 * x);
        double q4 = (7 * x);
        double q5 = (x * x * x - 15 * x);
        double q6 = q4 / q5;


        System.out.println((q + q1) / (q2 - q6));
    }
}
