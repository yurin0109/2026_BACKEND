package day10.yuyu1;

import java.util.Scanner;

public class Board {
    public static void main(String[] args) {
        String content1 = null;
        String writer1 = null; 

        String content2 = null;
        String writer2 = null;

        String content3 = null;
        String writer3 = null;

        Scanner scan = new Scanner(System.in);
    
        
        for( ; ; ) {
            System.out.println("===== my community =====");
            System.out.println("1. 게시물 작성 2. 게시물 출력");
            System.out.println(">선택");

            int ch = scan.nextInt();
            
        if ( ch == 1 ) {
            System.out.print("내용: ");
            String 내용 = scan.next();

            System.out.print("작성자: ");
            String 작성자 = scan.next();
        
        if( content1 == null && writer1 == null ) {
            content1 = 내용;
            writer1 = 작성자;
            System.out.println("내용을 작성했습니다");
        

        }else if( content2 == null && writer2 == null ){
            content2 = 내용;
            writer2 = 작성자;
            System.out.println("내용을 작성했습니다");

        }else if( content3 == null && writer3 == null ){
            content3 = 내용;
            writer3 = 작성자;
            System.out.println("내용을 작성했습니다");
        
        }else{System.out.println("더 이상 게시물을 등록할 수 없습니다");
        }
    }
        else if(ch==2){
            if( content1 != null && writer1 != null ){
                System.out.printf(
                "작성자 : %s, 내용 : %s \n",
                writer1,
                content1
                );

            }if( content2 != null && writer2 != null ){
                System.out.printf(
                "작성자 : %s, 내용 : %s \n",
                writer2,
                content2
                );

            }if( content3 != null && writer3 != null ){
                System.out.printf(
                "작성자 : %s, 내용 : %s \n",
                writer3,
                content3
                );
                }
            }
        }
    }
}


    
// 비어잇지 않은 지 확인 후 프린트f