package day15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exam2 {
    public static void main(String[] args) {
        /* 스택(Stack): 후입선출( LIFO : 가장 마지막에 삽입된 자료가 가장 먼저 삭제된다. )
            예] 브라우저( 뒤로가기 ) , Ctrl+z(실행취소) 등등
            - Stack 클래스 이용한 구현 , push 삽입 , pop 출력
        */
        Stack<String> stack = new Stack<>(); // 스택 메모리 만든다.
        stack.add("네이버 메인 페이지");
        stack.push("뉴스 페이지");
        stack.push("블로그 페이지"); // 입력 : 1. 메인 -> 2. 뉴스 ->  3. 블로그
        while( !stack.isEmpty() ){ // !:부정문 , !변수명.isEmpty() , 비어있으면 반복문 종료
            System.out.println( stack.pop() ); // 출력: 3. 블로그 -> 2. 뉴스 -> 1. 메인
        }


        /* 큐( Queue ): 선입선출( FIFO : 가장 먼저 삽입된 자료가 가장 먼저 삭제된다. )
            예] 번호(웨이팅)표 , 프린트(인쇄)
            - LinkedList 클래스 이용한 구현 , offer 입력 , poll 출력
        */
        Queue<String> queue = new LinkedList<>();
        queue.add("1번 손님"); queue.offer("2번 손님"); queue.offer("3번 손님");
        while ( !queue.isEmpty() ) {
            System.out.println( queue.poll() );
        }


    } // main end
} // class end
