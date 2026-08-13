package day10.yuyu1;

import java.util.Scanner;

public class haha5 {

    public static void main(String[] args) {
        String 내용보관함1=null; String 작성자보관함1=null;
        String 내용보관함2=null; String 작성자보관함2=null;
        String 내용보관함3=null; String 작성자보관함3=null;
        Scanner scan = new Scanner(System.in);

        for ( ; ; ) {
            System.out.println("===== 게시판 =====");
            System.out.println("1. 게시물 작성 2. 게시물 출력");
            System.out.println("=================");
            int ch = scan.nextInt();


        if( ch == 1 ){
            String 내용 = scan.next();
            String 작성자 = scan.next();

            if( 내용보관함1 == null && 작성자보관함1 == null ){
                내용보관함1 = 내용; 작성자보관함1 = 작성자;
            }else if( 내용보관함2 == null && 작성자보관함2 == null ){
                내용보관함2 = 내용; 작성자보관함2 = 작성자;
            }else if( 내용보관함3 == null && 작성자보관함3 == null ){
                내용보관함3 = 내용; 작성자보관함3 = 작성자;
            }else{System.out.println("쓸 공간이 없습니다.");}
        }
        else if( ch == 2 ){
            if (내용보관함1 != null && 작성자보관함1 != null) {
                System.out.printf("내용 :  %s   ,  작성자 :  %s   \n", 내용보관함1 , 작성자보관함1);
            }
            if (내용보관함2 != null && 작성자보관함2 != null) {
                System.out.printf("내용 :  %s   ,  작성자 :  %s   \n", 내용보관함2 , 작성자보관함2);
            }
            if (내용보관함3 != null && 작성자보관함3 != null) {
                System.out.printf("내용 :  %s   ,  작성자 :  %s   \n", 내용보관함3 , 작성자보관함3);
            }
        }

        }

    }

}
