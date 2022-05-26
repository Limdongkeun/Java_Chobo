package accessModifierTest2;
import accessModifierTest.MyParent;

class MyChild extends MyParent {
    public void printMember(){
//        System.out.println(prv); //에러
//        System.out.println(dft); //에러
        System.out.println(prt);
        System.out.println(pub);
    }

}
public class MyParent2 {
    public static void main(String[] args) {
//        MyChild c = new MyChild();
        MyParent p = new MyParent();

//        System.out.println(p.prv); // 에러 private라서 같은 클래스 안에서만 접근할 수 있음
//        System.out.println(p.dft);
//        System.out.println(p.prt);
        System.out.println(p.pub);


    }
}
