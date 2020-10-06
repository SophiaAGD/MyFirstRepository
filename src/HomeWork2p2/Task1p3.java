package HomeWork2p2;
import java.util.Scanner;

public class Task1p3 {
    public static void main(String[] args) {
       power();
    }

    static void power() {
        System.out.println("Введите два числа");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = x; // записываем изначальное значение переменной x в новую переменную с постоянным для данного метода значением во избежание ошибки в вычислениях
        int y = sc.nextInt();
        if (y > 0) {
            for (int i = 1; i < y; i++) {
            z = z * x;
            }
            System.out.println(z);
        }else{
            System.out.println("Вводить отрицательные и дробные числа нельзя");
        }

    }
}