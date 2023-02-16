/*
    요구사항
        주제 : 예금프로그램
        사용되는문법 : 출력,입력,변수,연산,제어,반복
        조건
            1. 기능 메뉴 : 예금 , 출금 , 잔고확인
            2. 통장 : 1개[ 계좌번호 : 20221227 , 비밀번호 : 1234 , 초기잔금 : 0 ]
 */
package Day05; // 현재 클래스파일가 위치한 패키지[폴더]명 명시

import java.util.Scanner;

// ----------------------------- class -------------------------------
public class P1_예금프로그램 { // class start // 자바 코드는 무조건 클래스 { } 안에 작성한다.

    // ----------------------------- main -------------------
    public static void main(String[] args) { // main end
        // 자바 코드를 읽어주는 main함수(+쓰레드)[ 실행할 코드는 main { } 안에서 작성한다.]
        while (true){ // while start // 무한루프 [ 종료조건 : 4 입력시 ]
            System.out.println(" -------------- 이젠 은행 -------------- ");
            System.out.print("1.예금 2.출금 3.잔고 4.종료 : ");
            // 1. 입력받기
            Scanner scanner = new Scanner(System.in);
            int menuChoice = scanner.nextInt();
            // 2. 선택한 메뉴의 경우의수
            if( menuChoice == 1 ){
                System.out.println("--------------- 예금 -----------------");
            }
            else if( menuChoice == 2 ){
                System.out.println("--------------- 출금 -----------------");
            }
            else if( menuChoice == 3 ){
                System.out.println("--------------- 잔고 -----------------");
            }
            else if( menuChoice == 4 ){
                System.out.println("--------------- 종료 -----------------");
            }
        } // while end
    } // main end
    // -------------------------------------------------------
}// class end
// -----------------------------------------------------------------