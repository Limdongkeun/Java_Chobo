class Time{
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour){
        if(isValidHour(hour)) return;

        this.hour=hour;
    }
    //매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 매서드
    //Time 클래스 안에서만 사용되기 때문에 private으로 한다
    private boolean isValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getHour() {
        return hour;
    }
}
public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
//        t.hour = 25;
//        System.out.println(t.hour);
        t.setHour(5);
        System.out.println(t.getHour());
    }
}
