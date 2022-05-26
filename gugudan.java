import java.text.Format;
import java.util.Scanner;

public class gugudan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("몇단을 출력하시겠습니까?");
        int num = sc.nextInt();

        if(num <2 || num >9) {
            System.out.println("1~9사이의 정수를 입렵하세요");
        }
        System.out.printf("입력하신 단은 %d단 입니다 %n",num);
        for(int i=1;i<=9;i++){
            System.out.printf("%d*%d = %d %n",num,i,num*i);
        }
//
//
//
//        for(int i=2;i<=9;i++){
//            for(int j=1;j<=9;j++){
//                System.out.printf("%d * %d =%d %n", i,j, i*j);
//            }
//            System.out.println();
//        }
    }
}
