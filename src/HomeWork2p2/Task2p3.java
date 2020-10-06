package HomeWork2p2;
import java.util.Scanner;

public class Task2p3 {
    public static void main(String[] args) {
        //doWhileReverse(); // цикл do...while для выведения введенного с клавиатуры массива в обратном порядке
        //cycleForRev(); // цикл for для выведения введенного с клавиатуры массива в обратном порядке
        //whileReverse(); // цикл while для выведения введенного с клавиатуры массива в обратном порядке
        forEachReverse(); // "цикл - костыль" for-each
    }


    static void doWhileReverse() {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] array = new int[k];
        int i = 0;
        System.out.println("Введите числа для записи в массив");
        do {
            array[i] = scan.nextInt();
            i++;
        } while (i < array.length);
        do {
            i--;
            System.out.print(array[i] + " ");
        } while (i > 0);

    }

    static void cycleForRev() {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] array = new int[k];
        System.out.println("Введите числа для записи в массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");

        }
    }

    static void whileReverse() {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] array = new int[k];
        System.out.println("Введите числа для записи в массив");
        int i = 0;
        while (i < array.length) {
            array[i] = scan.nextInt();
            i++;
        }
        scan.close();
        while (i > 0) {
            i--;
            System.out.print(array[i] + " ");


        }
    }

    static void forEachReverse() {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] array = new int[k];
        System.out.println("Введите числа для записи в массив");
        int pos = 0;
        for (int i : array) {
            array[pos] = scan.nextInt();
            pos++;
        }
        scan.close();
        for (int i : array) {
            pos--;
            System.out.print(array[pos] + " "); // в for-each невозможно вывести reverse-массив без использования костылей

        }
    }
}

