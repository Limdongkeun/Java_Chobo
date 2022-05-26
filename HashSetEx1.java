import java.util.*;

class HashSetEx1 {
    public static void main(String[] args) {
                            // 1 하나는 문자고, 1나는 숫자이기 때문에 둘 다 나온다
        Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"}; //중복 저장안됨
        Set set = new HashSet();

        // 순서가 유지된다고 보장할 수 없음 원래 set은 순서가 없기 때문에
        for(int i=0; i < objArr.length; i++) {
            set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장한다.
        }
        // HashSet에 저장된 요소들을 출력한다.
        System.out.println(set);

        System.out.println("==출력의 다른 방법==");
        Iterator it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}