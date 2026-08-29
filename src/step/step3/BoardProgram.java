package step.step3; // 'step.step3'라는 폴더 안에 이 코드가 들어있다고 컴퓨터에게 알려줘요.

import java.util.Scanner; // 키보드로 글을 쓸 수 있게 도와주는 도구(Scanner)를 불러와요.

public class BoardProgram { // 'BoardProgram'이라는 이름의 큰 상자를 시작해요.
    public static main(String[] args) { // 프로그램이 처음으로 움직이기 시작하는 출발점이에요.
        // [2] Board 객체 여러개 저장 = 배열 
        Board[ ] boards = new Board[ 100 ]; // 메모지를 100장까지 꽂아둘 수 있는 커다란 서랍장(boards)을 만들어요.
        for( ; ; ){ // 끝없이 계속해서 메뉴를 보여주도록 무한 반복문을 돌려요.
            System.out.println("========== My Community =========== "); // [3]출력 - 제목 글자를 화면에 보여줘요.
            System.out.println("1.게시물쓰기 2.게시물출력"); // 어떤 일을 할지 고르는 메뉴를 보여줘요.
            System.out.println("=================================== "); // 예쁜 테두리 선을 그려줘요.
            System.out.print("선택>"); // 어떤 번호를 고를지 물어보는 글자를 띄워줘요.
            Scanner scan = new Scanner( System.in ); // [4]입력객체 - 내가 키보드로 누르는 글자를 읽어줄 도구를 준비해요.
            int ch = scan.nextInt(); // 내가 누른 번호 숫자를 기억해 두었다가 'ch'라는 주머니에 넣어요.
            if( ch == 1 ){ // [5] 조건문 , 만약 누른 번호가 1번(글쓰기)이라면 아래 일을 해요.
                scan.nextLine(); // 번호 뒤에 남아있던 보이지 않는 찌꺼기(엔터)를 깨끗하게 청소해줘요.
                System.out.print("내용 : ");    // 화면에 '내용 :'이라고 글자를 적어줘요.
                String content = scan.nextLine(); // 내가 키보드로 친 내용을 'content' 주머니에 쏙 넣어요.
                System.out.print("작성자 : ");   // 화면에 '작성자 :'라고 글자를 적어줘요.
                String name = scan.nextLine(); // 내가 키보드로 친 이름을 'name' 주머니에 쏙 넣어요.
                Board 생성한게시물 = new Board();// [6] 객체 만들기 - 빈 메모지 한 장을 새로 꺼내와요.
                생성한게시물.내용 = content;     // [7] 방금 꺼낸 메모지에 아까 적어둔 내용을 꾹꾹 적어넣어요.
                생성한게시물.작성자 = name; // 방금 꺼낸 메모지에 아까 적어둔 이름을 꾹꾹 적어넣어요.
                // [8] 생성한 객체를 배열 . push 없으므로 직접
                boolean check = false; // true:저장성공 , false : 저장실패 - 자리가 성공적으로 잘 들어갔는지 확인할 깃발이에요.
                for( int index = 0 ; index <= boards.length-1; index++ ){ // 서랍장을 첫 번째 칸부터 마지막 칸까지 하나씩 열어봐요.
                    if( boards[index] == null ){ // 만약 지금 열어본 칸이 텅 비어있다면!
                        boards[index] = 생성한게시물; // 그 빈 칸에 방금 만든 메모지를 쏙 집어넣어요.
                        check = true; // 자리에 잘 넣었다고 깃발을 초록색(true)으로 바꿔요.
                        break; // 자리를 찾았으니 서랍장 열어보는 걸 그만 끝내요(탈출!).
                    } // if end
                } // for end
                if( check == true ){ // 만약 깃발이 초록색(성공)이라면
                    System.out.println("[안내] 글쓰기 성공 "); // 글이 잘 써졌다고 화면에 알려줘요.
                } // if end
                else{ // 만약 100칸이 꽉 차서 자리가 없다면
                    System.out.println("[경고] 게시물을 등록할 공간이 부족합니다. "); // 자리가 없다고 경고해줘요.
                } // else end
                // ******** 지역변수란? { } 안에서 선언(태어)한 변수는 } 끝나면 사라진다.
            }else if( ch == 2 ){ // 만약 누른 번호가 2번(글 보기)이라면 아래 일을 해요.

                for( int index = 0 ; index <= boards.length - 1 ; index++ ){ // 서랍장을 처음부터 끝까지 다시 싹 뒤져봐요.
                    Board 게시물 = boards[index]; // 서랍장의 index번째 칸에 있는 메모지를 꺼내봐요.
                    if( 게시물 != null ){ // 만약 그 칸에 메모지가 들어있다면!
                        System.out.print("작성자 : " + 게시물.작성자 ); // 메모지에 적힌 이름을 화면에 보여줘요.
                        System.out.println("  내용 : " + 게시물.내용 ); // 메모지에 적힌 내용을 화면에 보여줘요.
                        System.out.println("--------------------------------"); // 구분하기 쉽게 선을 그어줘요.
                    } // if end
                } // for end

            } // if end
        } // for end
    } // main end
} // class end

// [1] Board 클래스 선언    
class Board { // 메모지(Board)의 생김새를 정해주는 틀이에요.
    // 속성=멤버변수
    String 내용; // 메모지에 들어갈 '내용' 칸이에요.
    String 작성자; // 메모지에 들어갈 '작성자' 칸이에요.
}