package day01;

import java.net.Socket;

public class Exam2 {
public static void main(String[] args) {
    // 리터럴 : 상수 , 미리 상수로 구성한 자료들 
    // 3 , 'a' , true
    System.out.println(3);
    System.out.println(3.14);
    System.out.println('유');   // 작은 따옴표 : (한 글자) 문자
    System.out.println("리센느");   // 큰 따옴표 : 문자열 (N글자)
    System.out.println(true);

    // 자료타임 / 자료형 : 자료(데이터) 효율적으로 분류하는 방법
    // *효율 : 자료 크기에 따라 적당한 타입(크기) 선정해 빈 공간(여백) 줄이기
    
    // C/JAVA 정적(직접) 타입 VS PY/JS 동적(자동) 타입

    // 1) boolean : true / false 저장 타입 , 1byte( 1bit -> 8bit-> 1byte )
    boolean bool1 = true; // let/const --> boolean
    System.out.println( bool1 );

    // 2) char : ' 작은 따옴표로 감싼 문자 1개 저장하는 타입 (2byte) , 유니코드(코드 <-> 자연어) 번역 '
    char ch1 = 'A';
    System.out.println( ch1 );

    // 3) String : " 큰 따옴표로 감싼 문자 N개 저장하는 타입 , N * 2 byte , 객체(문자열) "
    String str1 = "ABC";
    System.out.println( str1 );


    // === 정수 ===
    // 4) byte : -128 ~ 127 저장하는 타입 , 1byte
    byte b1 = 100; System.out.println( b1 );
    // 5) short : +-3만 정도 , 2byte
    short sh1 = 30000;
    System.out.println( sh1 );
    // 6) int : +-21억 정도 , 4byte , ***** (정수) 리터럴 타입 *****
    int i1 = 2000000000; 
    System.out.println( i1 );
    // 7) long : +-21억 이상 , 8byte , 키보드로 입력한 정수는 int이므로 뒤에 L 붙이기
    long l1 = 3000000000L; System.out.println( l1 );


    // === 실수 ===    부동소수점 이용한 소수점 표현은 오차 o , 정교한 소수점/계산은 라이브러리
    // 8) float : 소수점 8자리 표현 , 4byte , 기본 실수 리터럴이 double 이므로 뒤에 F을 붙여야 함.
    float f1 = 0.12343543564563543548574548574875485748f;
    System.out.println( f1 );
    // 9) double : 소수점 17자리 표현 , 8byte , ** (실수) 리터럴 타입 ** 
    double d1 = 0.13458457982757289572;
    System.out.println( d1 );
    
    // 8가지 타입 (기본타입 , 리터럴 저장)
    // vs 그외(String) 타입 (참조타입 , 클래스/객체/배열/인터페이스 등등)
    } // 메인함수 끝
} // 클래스 끝





