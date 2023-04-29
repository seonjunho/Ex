package Array;
import Ex.S;

import java.util.*;

//AraayList< > 이름=;
// Hashmap<key, value> 이름=HashMap<>();
//key=primary key(중복불가), value=unique key(중복가능)
public class hashmapEx01 {
    public static void main(String[] args) {
        HashMap<String,Integer> cafe=new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        cafe.put("아메리카노", 2000);
        cafe.put("카페라떼", 4000);
        cafe.put("망고스무디", 6000);
        cafe.put("자바칩프라프치노", 6500);
//        System.out.println(cafe.get("아메리카노"));
//        System.out.println(cafe.get("카페라떼"));
//        System.out.println(cafe.get("망고스무디"));
//        System.out.println(cafe.get("자바칩프라프치노"));
        
//        cafe.put("자바칩프라프치노", 7000);
//        System.out.println(cafe.get("자바칩프라프치노")); //이 출력문은 하나의 값을 잡아온다

//        if(cafe.containsKey("자바칩프라프치노")) {
//            System.out.println("자바칩프라프치노 줘");}
        if(cafe.containsValue(a)) {
            System.out.println("카페라떼 나왔습니다.");}

        cafe.entrySet().forEach(entry ->{
            System.out.println(entry.getKey() + " : " + entry.getValue());
        });

    }
}
