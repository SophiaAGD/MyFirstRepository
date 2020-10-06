package HomeWork2p2;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Sort sort = new Sort();
        boolean exit  = false;
        while(exit == false){ //цикл для красоты и удобства
            System.out.println(" 1. Задание 4.2. Сортировка-пузырек \n 2. Задание 4.2. Шейкерная сортировка \n 3. Задание 4.4. Сортировка-пузырек \n 4. Задание 4.4. Шейкерная сортировка \n 5. Задание 4.5. Сортировка - пузырек \n 6. Задание 4.6. Шейкерная сортировка \n 7. Выход");
            System.out.println("Выберите пункт"); // идет активное взаимодействие с растерянным тестировщиком
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch(choice){
                case 1:
                    sort.testShowBubble();
                    break;
                case 2:
                    sort.testShowShake();;
                    break;
                case 3:
                    sort.randomArrayBubbleShow();
                    break;
                case 4:
                    sort.randomArrayShakeShow();
                    break;
                case 5:
                    sort.customArrayBubbleShow();
                    break;
                case 6:
                    sort.customArrayShakeShow();
                    break;
                case 7:
                    exit = true;
                    break;
            }

        /* System.out.println("Задание 4.2.1. Сортировка-пузырек ");
       sort.testShowBubble();
        System.out.println("Задание 4.2.2. Сортировка-шейкерная");
        sort.testShowShake();*/
            // sort.randomArrayBubbleShow();
            // sort.randomArrayShakeShow();
            // sort. customArrayBubbleShow();
            // sort.customArrayShakeShow();


        }
    }
}
class Sort{ //класс, отвечающий за методы с сортировкой массивов
    public static void testShowBubble(){
        int [] array1 = {1,2,3,4,5,6};
        int [] array2 = {1,1,1,1};
        int [] array3 = {9,1,5,99,9,9};
        int [] array4 = {};
        System.out.println("Массив 1:");
        System.out.println("Массив до:");
        show(array1);
        System.out.println("Массив после:");
        show(sortBubble(array1));
        System.out.println("Массив 2:");
        System.out.println("Массив до:");
        show(array2);
        System.out.println("Массив после:");
        show(sortBubble(array2));
        System.out.println("Массив 3:");
        System.out.println("Массив до:");
        show(array3);
        System.out.println("Массив после:");
        show(sortBubble(array3));
        System.out.println("Массив 4:");
        System.out.println("Массив до:");
        show(array4);
        System.out.println("Массив после:");
        show(sortBubble(array4));
    }
    public static void testShowShake(){
        int [] array1 = {1,2,3,4,5,6};
        int [] array2 = {1,1,1,1};
        int [] array3 = {9,1,5,99,9,9};
        int [] array4 = {};
        System.out.println("Массив 1:");
        System.out.println("Массив до:");
        show(array1);
        System.out.println("Массив после:");
        show(sortShake(array1));
        System.out.println("Массив 2:");
        System.out.println("Массив до:");
        show(array2);
        System.out.println("Массив после:");
        show(sortShake(array2));
        System.out.println("Массив 3:");
        System.out.println("Массив до:");
        show(array3);
        System.out.println("Массив после:");
        show(sortShake(array3));
        System.out.println("Массив 4:");
        System.out.println("Массив до:");
        show(array4);
        System.out.println("Массив после:");
        show(sortShake(array4));
    }
    public static void randomArrayBubbleShow(){
         int[] array = randomArray();
        System.out.println("Массив до:");
        show(array);
        System.out.println("Массив после:");
        show(sortBubble(array));

    }
    public static void randomArrayShakeShow(){
        int[] array = randomArray();
        System.out.println("Массив до:");
        show(array);
        System.out.println("Массив после:");
        show(sortShake(array));
    }
    public  static void show(int[] array){
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }
    public static void customArrayBubbleShow(){
        int[] array = ScanShow();

        System.out.println("Массив до:");
        show(array);
        System.out.println("Массив после:");
        show(sortBubble(array));
    }
    public static void customArrayShakeShow(){
        int[] array = ScanShow();

        System.out.println("Массив до:");
        show(array);
        System.out.println("Массив после:");
        show(sortShake(array));
    }
    public static int[] sortBubble(int[] array){
        for(int i = array.length - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    int buf = array[j];
                    array[j] = array[j+1];
                    array[j+1] = buf;
                }
            }
        }
        return array;
    }

    public static int[] sortShake(int[] array){
        int left = 0;
        int right = array.length - 1;
        do {
            for(int i = left; i < right; i++){
                if(array[i] > array[i + 1]){
                    int buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
            right--;
            for (int i = right; i > left; i--){
                if(array[i] < array[i-1]){
                    int buf = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buf;
                }
            }
            left++;

        }while(left <= right);
        return array;
    }
    public static int[] randomArray(){
     int _length = 0;
     _length = 0 + (int) (Math.random()* 10);
    int[] array = new int[_length];
    for(int i = 0; i < array.length; i++){
        array[i] = - 100 + (int) (201 * Math.random());
    }
        return array;
    }
    public static int[] ScanShow(){
        int length_ = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Введите длину массива");
             length_ = scan.nextInt();
        }while(length_ <= 0);
        int[] array = new int[length_];
        for(int i = 0 ; i < array.length; i++){
            System.out.println("Введите [" +  i + "] элемент массива");
            array[i] = scan.nextInt();
        }
        scan.close();
        return array;
    }
}
