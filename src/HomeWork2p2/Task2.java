package HomeWork2p2;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        doWhile(); // цикл do...while
        //cycleFor(); // цикл for
        //whiLe(); // цикл while
        //forEach(); // "цикл - костыль" for-each (получает копии элементов массива и не знает, как дальше работать без дополнительных манипуляций)
        //cycleForEvenOnly(); // цикл для четных чисел

    }

    static void doWhile() {
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
        i = 0;
        scan.close();
        do {
            System.out.print(array[i] + " ");
            i++;
        } while (i < array.length);

    }

    static void cycleFor() {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] array = new int[k];
        System.out.println("Введите числа для записи в массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    static void whiLe() {
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
        i = 0;
        while (i < array.length) {
            System.out.print(array[i] + " ");
            i++;

        }
    }

    static void forEach() {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] array = new int[k];
        System.out.println("Введите числа для записи в массив");
        int pos = 0;
        for (int i : array) { //другой ввод через for-each невозможен, потому что int i является копией элемента массива и мы не можем изменять array[i] напрямую через цикл for-each
            array[pos] = scan.nextInt();
            pos++;
        }
        scan.close();
       for (int i : array) {
            System.out.print(i + " ");

        }
    }

    static void cycleForEvenOnly() {
        System.out.println("Введите размер массива");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int[] array = new int[k];
        System.out.println("Введите числа для записи в массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }
        scan.close();
        for (int i = 0; i < array.length; i = i + 2) {
                System.out.print(array[i] + " ");
            }
        }

}

