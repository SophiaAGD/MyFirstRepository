package HomeWork2p2;
import java.util.Scanner;

public class Task1p2 {
    public static void main(String[] args){
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int numbers = scan.nextInt();
        scan.close();
        int length_ = String.valueOf(numbers).length();
        System.out.println(length_);
        int answer = 1;
        for (int i  = 0; i < length_; i++){
            int number = numbers % 10;
            System.out.print(" " + number + " * ");
            answer = answer * number;
            numbers = numbers - number;
            numbers = numbers / 10;
        }
        System.out.print(" = " + answer);

    }
}

