package HomeWork2p2;

public class Task1p5v2 {
    public static void main(String[] args){
            for(int i = 1; i < 10; i++){
                for(int j = 2; j < 6; j++){
                    if (i*j < 10){
                        System.out.print(j + "*" + i + "= " + i*j + "|");
                    }else {
                        System.out.print(j + "*" + i + "=" + i * j + "|");
                    }
                }
                System.out.println("");
            }
        System.out.println("----------------------------");
            for(int i = 1; i < 10; i++){
                for(int j = 6; j < 10; j++){
                    if (i*j < 10){
                    System.out.print(j + "*" + i + "= " + i*j + "|");
                    }else {
                    System.out.print(j + "*" + i + "=" + i * j + "|");
                }
            }
            System.out.println("");
        }
        }

}
