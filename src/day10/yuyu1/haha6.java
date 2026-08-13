package day10.yuyu1;

import java.util.Scanner;

public class haha6 {
    public static void main(String[] args) {
        String content1 = null; String writer1 = null;
        String content2 = null; String writer2 = null;
        String content3 = null; String writer3 = null;
        Scanner scan = new Scanner(System.in);


        for ( ; ; ){
            System.out.println("======= my community =======");
            System.out.println("1. 게시물 작성 2. 게시물 출력 ");
            System.out.println("선택>");
            int ch = scan.nextInt();
            

        if (ch==1){
            System.out.println("내용: "); String 내용 = scan.next();
            System.out.println("작성자: "); String 작성자 = scan.next();
            if(content1 == null && writer1 == null){
                content1 = 내용; writer1 = 작성자; 
                System.out.println("게시물 작성 성공!");
            }else if(content2 == null && writer2 == null){
                content2 = 내용; writer2 = 작성자;
                System.out.println("게시물 작성 성공!");
            }else if(content3 == null && writer3 == null){
                content3 = 내용; writer3 = 작성자;
                System.out.println("게시물 작성 성공!");
            }else{System.out.println("더 이상 게시물을 작성할 수 없습니다.");}
        }

        else if(ch==2){
            if(content1 != null && writer1 != null){
                System.out.printf(" 내용 : %s , 작성자 : %s \n "  , content1 , writer1 );
            }
            if(content2 != null && writer2 != null){
                System.out.printf(" 내용 : %s , 작성자 : %s \n ", content2 , writer2 );
            }if(content3 != null && writer3 != null){
                System.out.printf( "내용 : %s , 작성자 : %s \n " , content3, writer3 );
            }
            }
        }
    }
}
