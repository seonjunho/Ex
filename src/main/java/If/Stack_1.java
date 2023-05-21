package If;
import java.util.Stack;
public class Stack_1 {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.add("1번");
        st.add("2번");
        st.add("3번");

        System.out.println("stack 내부에 2번이 있는지 확인 : "+st.contains("2번"));
        // peek 는 최근 스택(top)의 데이터 조회 즉 다음 스택 출력값 확인
        System.out.println("stack pop : "+ st.peek());
        // 스택의 i번째 인덱스에 뭐가 있는지 확인.
        System.out.println("0번 인덱스 확인 : "+st.elementAt(0));
        // 스택 특정 값이 어느 인덱스에 위치에 있는지 확인.
        System.out.println("특정 값의 인덱스 확인 : "+st.indexOf("2번"));
        // 스택 i번 인덱스 삭제
        st.remove(2);
        // 스택 인덱스 값 변경
        st.set(1, "1번");
        // 스택 크기 설정
        // (설정 이전에 크기보다 스택의 크기가 작으면 나머지는 null처리.)
        st.setSize(5);

        System.out.println("===반복문 시작.===");
        for (int i=0;i<st.size();){
            System.out.println(st.pop());
        }
        st.clear();// 스택 비우기
        System.out.println(st.empty()); // 스택 비었는지 확인하기.
    }
}
