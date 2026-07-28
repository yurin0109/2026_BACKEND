package day01; // 패키지(폴더명) , 클래스 위치 식별 용도

public class Exam {
    // public : 공개용 , 다른 패키지에서도 사용 가능한 클래스 뜻
    // class : 클래스 선언 사용하는 키워드
    // Exam : 클래스명은 아무거나 , 첫글자는 대문자!!
        // * 클래스란? 자바에서의 가장 최소 컴파일/번역/통역사 단위
    // 자바 = 자바스크립트 주석 동일    /*  */

    // 클래스{ } 안에서만 코드 작성!!


    // [1] 자바 실행 시작점 생성 = main함수( 번역한 코드를 읽어들이는 흐름 단위 = 메인스레드 )
    // m + 엔터 : main{ } 자동완성 , JS에 없는 이유는 브라우저 엔진 대신한다.
    int a = 10;
    public static void main(String[] args) { 
        // ** [ main함수 안 ] 선언/만들기 . 실행문 가능 **
        // so + 엔터 : System.out.println();
        System.out.println( "안녕자바" ); //JS의 console.log( ) 동일 역할
        // ;(세미콜론) : 코드의 한 문장이 끝났다는 뜻 , 해당 기준으로 컴파일
    } // main end


} // class end
