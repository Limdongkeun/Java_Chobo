import java.util.ArrayList;
import java.util.Collections;

import static jdk.nashorn.internal.objects.Global.print;


public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList<>();
//        list1.add(new Integer(5));
        list1.add(5); //원래는 위에 처럼써줘야함
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        System.out.println("배열 복사");
        ArrayList list2 =new ArrayList<>(list1.subList(1,4));
        print(list1,list2);

        System.out.println("정렬");
        Collections.sort(list1); //list1과 list2를 정렬
        Collections.sort(list2);
        print(list1,list2);

        System.out.println("list1에 list2의 모든 요소가 있냐");
        System.out.println("list1.containsAll(list2) : " + list1.containsAll(list2));

        System.out.println("list2에 추가");
        list2.add("B");
        list2.add("C");
        list2.add(3,"A"); //추가할 인덱스번호를 알려준다
        print(list1,list2);

        System.out.println("3번째 있던 A를 AA로 바꿈");
        list2.set(3, "AA");
        print(list1,list2);

        //list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1,list2);

        //list2에서 list1에 포함된 객체들을 삭제
        for(int i= list2.size()-1; i>=0; i--){
            if (list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1,list2);
        //main 끝
    }
    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }
}