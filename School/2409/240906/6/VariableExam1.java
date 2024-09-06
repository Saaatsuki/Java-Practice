public class VariableExam1 {
    public static void main(String[] args) {
        boolean isTrue = true; // boolean 값, 참(True) 또는 거짓(False) 값을 저장

        byte smallNumber = 1; // byte 타입, -128부터 127까지의 정수 값을 저장
        short shortNumber = 2; // short 타입, -32,768부터 32,767까지의 정수 값을 저장
        int intNumber = 3; // int 타입, -2,147,483,648부터 2,147,483,647까지의 정수 값을 저장
        long largeNumber = 4L; // long 타입, 큰 정수 값을 저장. 'L'을 붙여서 long형 리터럴임을 명시

        float decimalValue = 5.0f; // float 타입, 소수점이 있는 숫자를 저장. 'f'를 붙여서 float형 리터럴임을 명시
        double preciseDecimal = 6.0; // double 타입, 더 정밀한 소수점 숫자를 저장

        char character = 'A'; // char 타입, 하나의 문자를 저장. 문자 리터럴은 작은따옴표로 감싸야 함

        // 변수의 값을 출력
        System.out.println(isTrue); // boolean 값 출력
        System.out.println(smallNumber); // byte 값 출력
        System.out.println(shortNumber); // short 값 출력
        System.out.println(intNumber); // int 값 출력
        System.out.println(largeNumber); // long 값 출력
        System.out.println(decimalValue); // float 값 출력
        System.out.println(preciseDecimal); // double 값 출력
        System.out.println(character); // char 값 출력
    }
}
