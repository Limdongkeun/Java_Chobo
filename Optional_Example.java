import java.util.Optional;

public class Optional_Example {
    public static void main(String[] args) {
//        int [] arr = {};
        int[] arr = new int[0];
        System.out.println("arr.length =" +arr.length);

//        Optional<String> opt = Optional.empty(); //빈 문자열일때  null을 쓰는게 아니라 .empty()로 해야한다
        Optional<String> opt = Optional.of("abc"); //객체가 들어 있을때
        System.out.println("opt =" +opt);

    }
}
