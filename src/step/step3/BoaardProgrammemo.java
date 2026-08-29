package step.step3;

import java.net.Socket;
import java.util.Scanner;

public class BoaardProgrammemo {


    public static void main(String[] args) {
        Board[] boards = new Board[100];
        for( ; ; ){
            System.out.println("=== 게시판 ===");
            System.out.println("1. 게시물 작성 2. 게시물 출력");
            System.out.println("=============");
            System.out.print("선택> ");
            Scanner scan = new Scanner(System.in);
            int ch = scan.nextInt();
            if( ch == 1 ){
                scan.nextLine();
                System.out.println("내용: ");
                String content = scan.nextLine();
                System.out.println("작성자: ");
                String name = scan.nextLine();
                Board 생성한게시물 = new Board();
                생성한게시물.내용 = content;
                생성한게시물.작성자 = name;

                boolean check = false;

                for(int index = 0; index<=boards.length-1; index++){
                    if( boards[index] == null){
                        boards[index] = 생성한게시물;
                        check = true;
                        break;
                    }
                }
                if(check == true ){
                    System.out.println("[안내] 게시물 작성 성공");
                }
                    else{
                        System.out.println("[주의] 게시물을 작성할 공간이 부족합니다");
                        }
            
                }else if( ch == 2 ){
            
                    for(int index = 0; index<=boards.length-1; index++ ){
                        Board 게시물 = boards[index];
                        if( 게시물 != null ){
                            System.out.println("내용: " + 게시물.내용);
                            System.out.println("작성자: " +게시물.작성자);
                            System.out.println("--------------------");
                        }
                    }       
                }
            }
        } // main end
} // class end

class Board{
    String 내용;
    String 작성자;
}