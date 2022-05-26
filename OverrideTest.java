class pon{
    int x;
    int y;
        pon(int x, int y) {
            this.x = x;
            this.y = y;
        }
    String getLocation(){
        return "x:" + x + "y:" + y;
    }
}

class extendpon extends pon{
    int z;
    extendpon(int x, int y, int z){
      super(x,y);
      this.z = z;
        //생성자를 상위 클래스에 만들어뒀을때 수퍼로 불러오면 됨

    }


    String getLocation(int a){
        return "a";
    }
    //조상의 getLocation()을 오버라이딩
    String getLocation(){
        return "x: " + x + " y: " + y +" z: "+z;
    }
}
public class OverrideTest {

    public static void main(String[] args) {
        pon pd = new pon(3,4);
        extendpon pp = new extendpon(1,2,3);
//        pp.x = 10;
//        pp.y = 20;
//        pp.z = 30;
        //상속받아서 내가 오버라이딩한 메서드가 호출
        System.out.println(pp.getLocation());
        System.out.println(pp);
    }
}
