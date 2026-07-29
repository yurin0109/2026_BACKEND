package day02;

public class Exam1 {
    public static void main(String[] args) {

        // == 다형성 == 
        // [1] 자동(묵시적) 타입 변환 : byte -> short -> int -> long -> float -> double / 작은 것 -> 큰 것
        byte bytevalue = 100;   // byte 타입에 bytevalue 변수명으로 100 리터럴 대입했다
        short shortvalue = bytevalue;   // [가능] , [*자료유지 , 타입변경]
        int intvalue = shortvalue;  // [가능] , [*자료유지 , 타입변경]
        long longvalue = intvalue; // [가능] , [*자료유지 , 타입변경]
        float floatvalue = intvalue; // [가능] , [*자료유지 , 타입변경]
        double doublevalue = floatvalue; // [가능] , [*자료유지 , 타입변경]

        // * 연산(계산) 중에 자동 타입 변환 , byte/short 연산 결과 => int()
        // 기본타입 int 초과면 더 큰 타입으로 결과 타입 반환 (byte -> short -> int -> long -> float -> double)

        // [2] 강제(명시적) 타입 변환 :  byte <- short <- int <- long <- float <- double / 큰 것 -> 작은 것 , * 자료 손실 발생 *
        double dvalue = 3.14;
        float fvalue = (float)dvalue;    // [불가능] , 자료 앞에 (변환할 타입명) 명시해 강제로 타입 변환
        long lvalue = (long)fvalue;    // 3.14 -> 3 손실 발생
        int ivalue = (int)lvalue;
        short svalue = (short)ivalue;
        byte bvalue = (byte)svalue;

    }
}
