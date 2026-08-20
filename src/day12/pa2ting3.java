package day12;

import java.util.Scanner;

public class pa2ting3 {
    public static void main(String[] args) {

        String[] contents = new String[100];
        String[] writers = new String[100];

        Scanner scan = new Scanner(System.in);
        for( ; ; ){
            System.out.println(" == my community == ");
            System.out.println(" 1. 게시물 작성 2. 게시물 출력 ");
            System.out.println(" >선택 ");
            int ch = scan.nextInt();
            if( ch == 1 ){
                System.out.print(" 내용: "); String content = scan.next();
                System.out.print(" 작성자: "); String writer = scan.next();
                boolean save = false;
                for( int index = 0; index <= contents.length-1; index++ ){
                    if(contents[index] == null && writers[index] == null ){
                        contents[index] = content; writers[index] = writer;
                        save = true; break;
                    }
                }
                if( save == true ){System.out.println("게시물 작성 성공");}
                else{System.out.println("게시물 작성 실패");}
            }else if(ch == 2 ){
                for( int index = 0; index <= contents.length-1; index++ )
                    if( contents[index] != null && writers[index] != null ){
                        System.out.printf(" 내용 : %s , 작성자 : %s \n " , contents[index] , writers[index] );
                    } // if
                } // else if
            } // if
        } // main
    } // class
