package Day03;

public class Ex2_타입 { // class s
    public static void main(String[] args) { // main s
        // 기본타입
        // 1. 논리형   boolean     : true or false 만 저장가능 1바이트
        boolean box1 = true;    System.out.println( box1 );
        // boolean box2 = 10;   // 10 저장 불가능

        // 2. 문자형   char        : 문자 1개 [ 유니코드 사용 ] 저장 ' '
        char box3 = 'A';        System.out.println( box3 );
        // char box4 = 'ABC';   // 문자열 저장 불가능

        // 3. 문자열 클래스 String  : 문자 여러개인 문자열 저장 " "
        String box5 = "ABC";    System.out.println( box5 );
        // String box6 = 'D';   // ' ' 저장 불가능

        // 4. 정수형
            // 1. byte          : +-100 정도
        byte box7 = 100;        System.out.println(box7);
       //  byte box8 = 300;     // 300 저장 불가능
            // 2. short         : +-3만 정도
        short box9 = 30000;     System.out.println( box9 );
        // short box10 = 60000;
            // 3. int           : +-21억 정도
        int box11 = 2000000000;  System.out.println( box11 );
        // int box12 = 200000000000000;
            // 4. long          : 21억이상 [ 900 경 ]
        long box13 = 2000000000000000000L; // (int)->(long)
            // 300 입력시에 (int) 생략

        // 5. 실수형
            // 1. float : 소수점 8자리까지 출력
        float box14 = 0.123456789123456789F;// (double)->(float)
        System.out.println( box14);
            // 2. double : 소수점 17자리까지 출력
        double box15 = 0.123456789123456789;
        System.out.println( box15 );


    }// main e
} // class e

/*
    컴퓨터 = 숫자 [ 0 , 1 ]
    사람 =  문자 [ 영어 , 한글 , 일본어 , 중국어 ]

        사람 [ 기계 ] ------아스키코드------>  사람[ 기계 ]
           A ---인코딩----  1000001 ---디코딩-----> A

       아스키코드 : 2의 7승 : 128문자      [ C언어 ]
       유니코드 : 전세계 모든 언어         [ 자바 ]


  - 자료형
	논리형
		boolean	1바이트 		true or false
	문자형
		char	2바이트 		유니코드 문자1개 ' '
		String 	2바이트x글자수	문자열클래스 " "
	정수형
		byte	1바이트		+-128정도
		short	2바이트		+-3만정도
		*int	4바이트		+-21억정도
		long 	8바이트		+-21억이상
	실수형
		float	4바이트		소수점 8자리 표현
		*double 	8바이트		소수점 17자리 표현

 */

