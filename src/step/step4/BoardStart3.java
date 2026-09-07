package step.step4;

import java.util.Scanner;

public class BoardStart3 {
    public static void main(String[] args) {
        for( ; ; ){
            System.out.println(" ========== 게시판 ========== ");
            System.out.println(" 1. 게시물 작성 2. 게시물 출력 ");
            System.out.print("선택>");

            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            if( ch == 1 ){
                scan.nextLine();
                System.out.print("내용: "); String content = scan.nextLine();
                System.out.print("작성자: "); String writer = scan.nextLine();

                boolean result = BoardController.doPost( content , writer );
                if( result ){ System.out.println("게시물 작성 성공"); }
                else{ System.out.println("게시물 작성 실패"); } 
            }
            else if( ch == 2 ){
                BoardDto[] boards = BoardController.doGet();
                for( BoardDto board : boards ){
                    if( board != null ){
                        System.out.printf("작성자: %s , 내용: %s \n " , board.getWriter() , board.getContent() );
                    }
                }
            }
        }
    }
}
