import  java.util.Scanner;
public class ScanEX1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int num = sc.nextInt();
        String str = sc.nextLine();
        int put = Integer.parseInt(str);

//        System.out.println(num);
        System.out.println("문자열 "+ str);
        System.out.println("숫자 "+ put);
    }
}
