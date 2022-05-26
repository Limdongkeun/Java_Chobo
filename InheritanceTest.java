class point{
//    int a;
    int x;
    int y;
}

//상속
class Circle1 extends point{
    int z;
}

//포함
class Circle{
    point p = new point();
    int a;
}

public class InheritanceTest {
    public static void main(String[] args) {
        Circle1 c1 = new Circle1();

        c1.x=10;
        c1.y=20;
        c1.z=30;

        System.out.println("c1.x = " +c1.x);
        System.out.println("c1.y = " +c1.y);
        System.out.println("c1.z = " +c1.z);
        System.out.println(c1.toString()); //object를 자동 상속받기 때문에 사용할 수 있음
//        System.out.println(c1); //위에랑 같은거 println이 자동으로 toString으로 만들어주는 기능이 있음
        System.out.println("위에는 상속 밑에는 포함");

        Circle c2 = new Circle();
        c2.p.x=10;
        c2.p.y=20;
        c2.a=30;

        System.out.println("c1.p.x = " +c2.p.x);
        System.out.println("c1.p.y = " +c2.p.y);
        System.out.println("c1p..z = " +c2.a);
        System.out.println(c2.toString()); //object를 자동 상속받기 때문에 사용할 수 있음



    }
}
