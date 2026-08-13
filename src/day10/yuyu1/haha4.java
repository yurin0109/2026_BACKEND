package day10.yuyu1;

import java.net.Socket;
import java.util.Scanner;

public class haha4 {


    public static void main(String[] args) {
        String content1=null; String write1=null;
        String content2=null; String write2=null;
        String content3=null; String write3=null;
        Scanner scan = new Scanner(System.in);

        for( ; ; ) {
            System.out.println("===== new community =====");
            System.out.println("1. 게시물 작성 2. 게시물 출력");
            System.out.println("=========================");
            int ch = scan.nextInt();

            if( ch == 1) {
                System.out.println("내용을 입력하세요: ");
                String 내용 = scan.next();
                System.out.println(" 작성자를 입력하세요: ");
                String 작성자 = scan.next();
                if( content1 == null && write1 == null){
                    content1 = 내용;
                    write1 = 작성자;
                    System.out.println("베리굿");
                }else if(content2 == null && write2 == null){
                    content2 = 내용;
                    write2 = 작성자;
                    System.out.println("베리굿");
                }else if(content3 == null && write3 == null){
                    content3 = 내용;
                    write3 = 작성자;
                    System.out.println("베리굿");
                }else{System.out.println("출력 더 못함");}
            }
            
            else if( ch == 2){
                if( content1 != null && write1 != null){
                    System.out.printf("작성자 : %s  내용 : %s \n " , write1 , content1 );}
                if( content2 != null && write1 != null){
                    System.out.printf("작성자 : %s 내용 : %s \n " , write2 , content2 );}
                if( content3 != null && write3 != null){
                    System.out.printf("작성자 : %s 내용 : %s \n" , write3 , content3 );}
                else{System.out.println("없다");}
            }
        }
    }
}                  

    