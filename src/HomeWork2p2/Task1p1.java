package HomeWork2p2;
import java.util.Scanner;

public class Task1p1 {
    public static void main(String[] args){
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.close();
        int sum = 1;
        for(int i = 1; i <= number; i++){
            sum = sum * i;
        }
        System.out.println(sum);


    }

}
