package day06;

public class Exam1 {
    public static void main(String[] args) {
        /* 
            생성자 : 인스턴스(객체) 생성할 때 사용되는 키워드
            선언하는 방법
                1) 클래스 내부
                2) 클래스명과 동일!
                3) 오버로딩 지원 : 동일한 이름으로 여러개 선언 , 조건
        목적 : 1) 빠른 초기화 2) 객체 생성 규칙/유효성 검사
        종류 : 1) 기본생성자(매개변수없는)
        
        */
    }
}

import java.util.Scanner;

public class OverallController {

    public static void main(String[] args) {
        Post[] posts = new Post[100];
        Scanner scan = new Scanner(System.in);

        for (;;) {
            System.out.println("============ My Community ============ ");
            System.out.println("1.게시물쓰기 2.게시물출력");
            System.out.println("====================================== ");
            System.out.print("선택>");
            int ch = scan.nextInt();

            if (ch == 1) {
                scan.nextLine();
                System.out.print("내용 : ");
                String content = scan.nextLine();
                System.out.print("작성자 : ");
                String writer = scan.nextLine();

                Post post = new Post(content, writer);
                boolean result = false;

                for (int index = 0; index <= posts.length - 1; index++) {
                    if (posts[index] == null) {
                        posts[index] = post;
                        result = true;
                        break;
                    }
                }

                if (result) {
                    System.out.println("[안내] 글쓰기 성공");
                } else {
                    System.out.println("[안내] 글쓰기 실패");
                }

            } else if (ch == 2) {
                for (Post post : posts) {
                    if (post != null) {
                        System.out.printf("작성자 : %s , 내용 : %s \n", post.writer, post.content);
                    }
                }
            }
        }
    }
}

class Post {

    String content;
    String writer;

    public Post() {}

    public Post(String content, String writer) {
        this.content = content;
        this.writer = writer;
    }
}










