import static java.awt.Color.orange;

class Car{
    String color;
    int door;

        Car(String color,int door){
            this.color=color;
            this.door=door;
        }

    void drive(){
        System.out.println("Drive Brrrr~~~~");
    }
    void stop(){
        System.out.println("멈춰");
    }
}

class FireEngine extends Car{
        FireEngine(String color,int door) {
            super(color,door);
        }

    void water(){
        System.out.println("Water~~~~");
    }
}
class am extends Car{

    am(String color, int door) {
        super(color, door);
    }
    void help(){
        System.out.println("HELP~~~~");
    }
}
public class fireEnginTest {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine("orange", 4);
        FireEngine fe2 = null;
        Car car1 = new Car("blue",3);
        am aa = new am("dd", 5);

        System.out.println(car1.color + car1.door);
        System.out.println(fe.color + fe.door);
        fe.water();
        car = (Car) fe; // 메소드를 줄이는 조상으로 형변화 ok
//        car.water(); //하지만 Car에 water메서드가 없기 때문에 사용 불가
        car.drive();
        fe2 = (FireEngine) car; //메서드를 늘리는것 자식이 더 많은데 자식으로 형변환 하는거
        fe2.water();
        fe.stop();

        System.out.println("");
        // 참조변수 instanceof 클래스명
        System.out.println(car instanceof FireEngine);  // 다운캐스팅
        System.out.println(fe instanceof  Car);        // 업캐스팅
        System.out.println(car1 instanceof Car);
//        System.out.println(fe instanceof am); // 형제끼리는 형변환 불가

    }
}
