package day10;

public class Exam2 {
    public static void main(String[] args) {
        // 자바는 100% 개체지향언어
        // Object(슈퍼클래스) 클래스로부터 모든 클래스는 상속관계를 갖는다.
        // 1. A --> Object
        A a = new A(); // 총 2개 , A --> Object
        // 2. 
        B b = new B(); // 총 3개 , B --> A --> Object
        // 3.
        C c = new C(); // 총 3개 , C --> A --> Object
        // 4.
        D d = new D(); // 총 4개 , D --> B --> A --> Object
        // 5. 
        E e = new E(); // 총 4개 , E --> C --> A --> Object
        // [2] 자동타입변환
        A a2 = b; // B --> A [가능]
        Object o1 = a2; // A --> Object [가능]
        
        Object aa = 1;
        Object aaa= "ㅁㅁ";
        Object o1 = a2; // A --> Object [가능]
        // [3] 강제타입변환 / 다운캐스팅
        B b2 = (B)a2; // A --> B [가능] 태생이 B 이라서
        // C c2 = (C)b2; // 즉) B는 C를 포함하지 않기 때문에 불가능
        // [4] 타입확인 , 인스턴스 instatnceOf 타입명
        System.out.println( e instanceof Object ); // e --> Object // true
        System.out.println( e instanceof C); // e --> C // true
        // System.out.println( e instanceof D ); // e --> D // false 

}
