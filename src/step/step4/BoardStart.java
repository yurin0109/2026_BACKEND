package step.step4;

import java.util.Scanner;

public class BoardStart {
    public static void main(String[] args) {
        // [1] Controller 객체 생략
        for( ; ; ){
            System.out.println("============ My Community ============");
            System.out.println(" 1. 게시물 쓰기 2. 게시물 출력 ");
            System.out.println("======================================");
            System.out.print("선택>");
            Scanner scan = new Scanner( System.in );
            int ch = scan.nextInt();
            if( ch == 1 ){
                scan.nextLine();
                System.out.print("내용: "); String content = scan.nextLine();
                System.out.println("작성자: "); String writer = scan.nextLine();
                // BoardController.doPost() : static메소드( 클래스명.메소드명() ) vs bc.doPost() : 일반메소드( 객체명.메소드명() )
                // 함수 호출 후 반환(결과)에 따른 흐름제어 하기 위해 boolean result 변수에 결과값 저장
                boolean result = BoardController.doPost( content , writer );
                if( result ){ System.out.println("[안내] 글쓰기 성공"); } 
                else{ System.out.println("[안내] 글쓰기 실패" ); }
            }else if( ch == 2 ){
                BoardDto[] boards = BoardController.doGet();
                for( BoardDto board : boards ){ // board.writer 직접접근 [vs] board.getWriter() 간접접근
                    if( board != null )
                        System.out.printf("작성자 : %s , 내용 : %s \n" , board.getWriter() , board.getContent());
                }
            }
        }
    }
}

