package day15;

import java.awt.* ; // JAVA내 UI 

public class Exam3 {


    public static void main(String[] args) {
        /*  프로그램: 실행 가능한 코드들의 집합
            프로세스: 실행 중인 프로그램
            멀티태스킹: 두 가지 이상의 작업을 동시에 처리
                - 멀티프로세스: 운영체제가 여러 개 프로세스를 동시에 실행하는 구조
                - *멀티 스레드: 하나의 프로세스 내 여러 개 흐름 작업을 실행하는 구조 *
            스레드란? 하나의 프로세스 내 최소 작업 단위 또는 실행 흐름 단위
                - CPU (<-- 운영체제 -->) 가 프로세스 내 스레드를 통해 코드를 순차적으로 처리
            main함수란? JAVA 내 *단일 스레드 환경* main메소드가 제공한다.
            멀티스레드 구현
                1) Runnable 익명구현체 : new Runnable(){ run(); };
                2) Runnable 구현체*    : class 클래스 implements Runnable{ run(); }
                3) Thread 상속         : class 클래스 extends Thread{ run(); }
            주요 메소드
                1) run()   :  추상메소드 이면서 작업(멀티)스레드가 처리할 코드의 시작점
                2) start() :  구현된 run() 메소드 실행하는 메소드 , 주의할 점] Thread클래스 제공

            * 활용처: 1) 톰캣(웹서버/SPRING): 다수의 유저(클라이언트)가 1개의 서버(PC)에 요청시 병렬처리 제공
                    -> 동시 다발적으로 1개의 서버에 로그인 요청 / 채팅 요청 들을 병렬처리 한다.  

        */
        // [1] 단일(싱글) 스레드 : (컴파일된) 코드들을 실행 흐름 단위 1개일 때
        // -> main메소드가 main스레드 제공한다. (프로그램 당 1개 이상 존재)
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        // 1) 1초에 1번씩 '띵' 소리 발생
        for( int i = 1; i<=3; i++ ){
            toolkit.beep(); // '띵' 발생하는 함수
            // 현재 스레드(코드 실행하는 흐름 단위) 일시정지(밀리초)*예외필수
            try{ Thread.sleep(1000); } catch( Exception e){}
        }
        // 2)  1초에 1번씩 '띵' 출력 발생 ????
        for( int i = 1; i<=3; i++ ){
            System.out.println("띵");
            try{ Thread.sleep(1000); }catch( Exception e ){}
        }

        // [2] 멀테스레드 방법1: 익명구현체 ,  new 인터페이스타입(){ 오버라이딩 };
        // Runnable runnable = new Runnable() {};
        Runnable runnable = new Runnable() {
            // 새로운 스레드가 처리할 메소드 = run() 오버라이딩(재정의)
            @Override public void run() {
                for( int i = 1; i<=3; i++ ){
                    System.out.println("1번째 새로운 첫번째 스레드:" + i );
                    try{ Thread.sleep(1000); }catch( Exception e ){}
            }
        };
    }; // 익명구현체 구현 끝
    Thread thread1 = new Thread(runnable); // new Thread( 익명구현체 );
    thread1.start(); // 새로운 스레드가 run() 메소드 호출 = start() , MAIN / TASK1 (스레드 2개)

        // [3] 멀티스레드 방법2: 구현체
        작업스레드2 작업스레드2 = new 작업스레드2();
        Thread thread2 = new Thread( 작업스레드2 );
        thread2.start(); // MAIN / TASK1 / TASK2 ( 스레드 3개 )
        
        // [4] 멀티스레드 방법3: 상속
        작업스레드3 thread3 = new 작업스레드3();
        thread3.start(); // MAIN / TASK1 / TASK2 / TASK3 ( 스레드 4개 ) = 병렬처리( 처리 순서 보장 없다. )

    } // main end
} // class end
class 작업스레드3 extends Thread{
    @Override
    public void run() {
        for( int i = 1; i<=3; i++ ){
            System.out.println( ">> 2번째 새로운 스레드: " + i );
            try{ Thread.sleep(1000); }catch( Exception e ){}
        }
    }
}

class 작업스레드2 implements Runnable{
    @Override
    public void run() {
        for( int i = 1; i<=3; i++ ){
            System.out.println( ">> 2번째 새로운 스레드: " + i );
            try{ Thread.sleep(1000); }catch( Exception e ){}
        }
    }

}
