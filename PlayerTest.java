abstract class Player{ //추상클래스(미완성 클래스)
    abstract void play(int pos); //추상메서드(미완성메서드)
    abstract void stop(); //추상메서드(선언부만 있고 구현부{}가 없다)
}
//추상 클래스는 상속을 통해 완성해야 개겣 생성가
class AudioPlayer extends Player{
    void play(int pos){System.out.println(pos + " 위치부터 play합니다");}
    void stop(){System.out.println("재생을 멈춥니다");}
}

public class PlayerTest {
    public static void main(String[] args) {
//        Player p = new Player(); //추상클래스의 객체를 생성 하지 추상클래스이기 때문에 객체 생성 불가
        AudioPlayer ap =new AudioPlayer();
//        Player ap =new AudioPlayer(); //다형성
        Player p = new AudioPlayer(); //다형성
        ap.play(100);
        ap.stop();
    }
}
