package accessModifierTest;

public class MyParent{
    private   int prv; // 같은 클래스
              int dft; // 같은 패키지
    protected int prt; // 같은 패키지 + 자손(다른패키지)
    public    int pub; // 접근제한 없음

    public void printMember(){
        System.out.println(prv);
        System.out.println(dft);
        System.out.println(prt);
        System.out.println(pub);
    }
}

class accessTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();

//        System.out.println(p.prv); // 에러 private라서 같은 클래스 안에서만 접근할 수 있음
        System.out.println(p.dft);
        System.out.println(p.prt);
        System.out.println(p.pub);

    }
}
