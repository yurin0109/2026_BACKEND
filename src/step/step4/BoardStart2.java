package step.step4;

import java.util.Scanner;

public class BoardStart2 {
    public static void main(String[] args) {
        for( ; ; ){
            System.out.println(" ============= 게시판 ============= ");
            System.out.println(" 1. 게시물 작성 2. 게시물 출력 ");
            System.out.print("선택 >");

            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();

            if( ch == 1 ){
                scan.nextLine();
                System.out.print("내용: "); String content = scan.nextLine();
                System.out.print("작성자: "); String writer = scan.nextLine();
                
                boolean result = BoardController.doPost( content , writer );
                if( result ){ System.out.println("[안내] 등록 성공"); }
                else{ System.out.println("[안내] 작성 실패"); }
            }else if( ch == 2 ){
                BoardDto[] boards = BoardController.doGet();
                for( BoardDto board : boards ){
                    if( board != null )
                        System.out.printf("내용: %s , 작성자: %s \n" , board.getContent() , board.getWriter() );
                }
            }
        }
    }
}
