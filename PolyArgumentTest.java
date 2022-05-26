class Product{
    int price;  //제품의 가격
    int bonusPoint; //제품구매 시 제공하는 보너스 점수

    Product(int price){
        this.price=price;
        bonusPoint = (int) (price/10.0); //보너스점수는 제품가격의 10프로
    }
    Product(){}
}

class Tv extends Product{
    //조상클래스의 생성자 Product(int price)를 호출
    public Tv() {super(100);} //tv가격은 100만원
    public String toString(){return "TV";} //object클래스의 toString()을 오버라이딩
}

class Computer extends Product{

    public Computer() {super(200);}
    public String toString(){return "Computer";}
}

class Audio extends Product{
    Audio(){super(50);}
    public String toString(){return "Audio";}
}
class Buyer{ // 물건을 사는 사람
    int money = 1000;  //소유금액
    int bonusPoint =0; //보너스 점수
    Product[] item = new Product[10];
    int i = 0;

    void buy(Product p){
        if(money<p.price){
            System.out.println("잔액이 부족해서 살 수 없습니다");
            return;
        }
        money -= p.price;  //가진 돈에서 구임한 제품의 가격을 뺀다
        bonusPoint += p.bonusPoint; //재품의 보너스 점수를 추가
        item[i++] = p; //제품을 Product[] item에 저장한다
        System.out.println(p + "물건을 구입하셨습니다");
    }
    void summary(){  //구매한 물품에 대한 정보를 요약해서 보여준다
        int sum =0;  //구입한 물품의 가격합계
        String itemList =""; // 구입한ㄴ 물품품목

        //반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다
        for(i=0;i<item.length;i++){
            if(item[i]==null) break;
            sum += item[i].price;
            itemList += item[i] + " ,";
        }
        System.out.println("구입하신 물품의 총 금액은 " + sum + " 만원입니다");
        System.out.println("구입하신 제품은 " + itemList + " 입니다");
    }
}
public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();

//        Product p = new Tv();
//        b.buy(p);
        //위에 두줄의 코드를 한 줄로 줄인것
        b.buy(new Tv()); //buy(Product p)
        b.buy(new Computer()); //buy(Product p)
        b.buy(new Audio());
        b.summary();

        System.out.println("현재 남은 돈은 " + b.money + " 만원입니다");
        System.out.println("현재 보너스점수는 " + b.bonusPoint + " 점입니다");
    }
}
