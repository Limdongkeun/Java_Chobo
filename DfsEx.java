package DataStructure;

import java.util.LinkedList;
import java.util.Queue;

//
//class Queue2<T>{
//}
//class Graph{
//    class Node{
//
//    }
//}
class String1{
    String aa;


    String1(String aa){
        this.aa = aa;

    }
}

public class DfsEx {
    public static void main(String[] args) {
        String str = "asdff";
        String str1 = "asdff";
        System.out.println(str.equals(str1));

        String str3 = new String("korea");
        System.out.println(str3.toString());
        String[] str4 = new String[]{"das","ads","asd","adsrqwr"};
        System.out.println(str4.toString());
        System.out.println(!str.isEmpty());


        String1 h = new String1("aaaa");
        String1 h2 = new String1("aaaa");


        System.out.println(str.isEmpty());
        System.out.println("");
        System.out.println(!str.isEmpty());
        System.out.println();
        System.out.println(str.equals(str1));
        System.out.println(h.equals(h2));
        h2 =h;
        System.out.println(h.equals(h2));

        System.out.println(h.toString());


        Stack st =new Stack();
        st.push(1);
//        LinkedList<Integer> q = new LinkedList<>();
        Queue queue = new LinkedList();
//        queue.offer(1);
//        queue.offer(2)

        System.out.println(!st.isEmpty());
    }
}
