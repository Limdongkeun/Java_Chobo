package SoloTest;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(input == 1){
            System.out.println(true);
        }
        int i =2;
        while (input > i){
            i = i*2;
            if(input == i){
                System.out.println(true);
            }
            System.out.println(false);
        }

    }
}
