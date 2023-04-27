package Array;
//리스트 복습복습

import java.util.*;

public class collectionEx02 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        System.out.println("저장된 객체수 : " + list.size());
        list.add("111");  //boolean add(object obj)
        list.add("222");
        list.add("333");
        System.out.println("저장된 객체수 : " + list.size());

        list.add(333); //자동 []박싱(정수)
        System.out.println("저장된 객체수 : " + list.size());
        System.out.println(list);
        System.out.println(list.hashCode()); //주소 값

        list.add(0, "333");
        System.out.println(list);

//        list.remove("333"); //String 타입 삭제
//        list.remove("333"); // 위와 동일함
        System.out.println(list);

        System.out.println(list.contains("333"));  //확인용
        System.out.println(list.indexOf("333"));

        //ArrayList의 각 인덱스의 값 저장(st(index, object)
        for (int i = 0; i < list.size(); i++) {
            list.set(i, i + "");
        }

        System.out.println(list);

//        list.clear(); // 삭제
//        System.out.println(list);

//        for(int i = 0 ; i<list.size();i++){ //이렇게 처리할 경우 1과 3이 잔존
//            list.remove(i);
//        }
//        System.out.println(list);

        for(int i = list.size()-1 ; i>=0;i--){
            list.remove(i);
        }
        System.out.println(list);
    }
}
