package Day03;

import java.util.Scanner; // import : 클래스 가져오기

public class Ex3_입력 { // class s
    public static void main(String[] args) { // main s

        // 입력객체 // * Scan + 자동완성
        Scanner scanner = new Scanner(System.in);

        System.out.print(" next[ String ] 띄어쓰기불가 입력 : ");
        String 문자열1 = scanner.next();           System.out.println(" 입력1 : " + 문자열1 );

        scanner.nextLine(); // ! : nextLine() 앞에 다른 next 존재했을경우 오류 보완
        System.out.print(" nextLine [ String ] 띄어쓰기포함 입력 : ");
        String 문자열2 = scanner.nextLine();      System.out.println(" 입력2 : " + 문자열2 );

        System.out.print(" nextBoolean[ boolean ] 입력 : ");
        boolean 논리형 = scanner.nextBoolean();   System.out.println(" 입력3 : " + 논리형 );

        System.out.print(" next().charAt(0)[ char ] 입력 : ");
        char 문자 = scanner.next().charAt(0);     System.out.println(" 입력4 : " + 문자 );

        System.out.print(" nextByte()[ byte +-128 ] 입력 : ");
        byte 정수1 = scanner.nextByte();          System.out.println(" 입력5 : " + 정수1 );

        System.out.print(" .nextShort()[ short +-3만정도 ] 입력 : ");
        short 정수2 = scanner.nextShort();        System.out.println(" 입력6 : " + 정수2 );

        System.out.print(" .nextInt()[ int +-21억정도 ] 입력 : ");
        int 정수3 = scanner.nextInt();            System.out.println(" 입력7 : " + 정수3 );

        System.out.print(" .nextLong()[ long +-21억정도 이상 ] 입력 : ");
        long 정수4 = scanner.nextLong();          System.out.println(" 입력8 : " + 정수4 );

        System.out.print(" .nextFloat()[ float 8자리까지 ] 입력 : ");
        float 실수1 = scanner.nextFloat();        System.out.println(" 입력9 : " + 실수1);

        System.out.print(" .nextDouble()[ double 17자리까지 ] 입력 : ");
        double 실수2 = scanner.nextDouble();      System.out.println(" 입력10 : " + 실수2);
    } // main e
} // class e

/*

클래스
	1. System		: 시스템 관련 제공하는 클래스 		java.lang 패키지
		System.out : 출력
		System.in : 입력
	2. String		: 문자열 관련 클래스  		java.lang 패키지
	3. Scanner	: 입력 관련 클래스 			java.util 패키지

	* java.lang 패키지만 import 생략


    입력
        1.입력객체 : Scanner scanner = new Scanner(System.in);
        2.입력객체의 메소드 사용해서 입력데이터 가져오기
            - 메소드
                scanner.next();             : 입력받은 문자열[String] 가져오기 ( 띄어쓰기 X )
                scanner.nextLine();         : 입력받은 문자열[String] 가져오기 ( 띄어쓰기 O )
                scanner.nextBoolean();      : 입력받은 논리형[boolean] 가져오기
                scanner.next().charAt(0);   : 입력받은 문자형[char] 가져오기
                scanner.nextByte();         : 입력받은 정수형[byte] 가져오기
                scanner.nextShort();
                scanner.nextInt();
                scanner.nextLong();
                scanner.nextFloat()         : 입력받은 실수형[float] 가져오기
                scanner.nextDouble()

 */

