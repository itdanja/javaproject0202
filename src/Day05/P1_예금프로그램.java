/*
    요구사항
        주제 : 예금프로그램
        사용되는문법 : 출력,입력,변수,연산,제어,반복
        조건
            1. 기능 메뉴 : 1.예금 , 2.출금 , 3.잔고확인 4.종료 5.이체 6.비밀번호변경
            2. 통장 :
                    본인 1개[ 계좌번호 : 20230216 , 비밀번호 : 1234 , 초기잔금 : 0 ]
                    친구 1개[ 친구계좌번호 : 20230217 , 초기잔금 : 0 ]
 */
package Day05; // 현재 클래스파일가 위치한 패키지[폴더]명 명시

import java.util.Scanner;

// ----------------------------- class -------------------------------
public class P1_예금프로그램 { // class start // 자바 코드는 무조건 클래스 { } 안에 작성한다.

    // ----------------------------- main -------------------
    public static void main(String[] args) { // main end
        // 자바 코드를 읽어주는 main함수(+쓰레드)[ 실행할 코드는 main { } 안에서 작성한다.]

        // * 통장 데이터 변수 [ while 밖에 만드는 이유 : 통장 관련 변수들은 선언 1번 ]
        // -- 본인 통장
        int account = 20230216; // -- 계좌번호 변수
        int password = 1234;    // -- 초기 비밀번호 변수
        int money  = 0 ;        // -- 통장 잔금 변수
        // -- 친구 통장
        int faccount = 20230217;
        int fmoney = 0;

        while (true){ // while start // 무한루프 [ 종료조건 : 4 입력시 - break; 반복문종료 ]
            System.out.println(" -------------- 이젠 은행 -------------- ");
            System.out.print("1.예금 2.출금 3.잔고 4.종료 5.이체 : ");
            // 1. 입력받기
            Scanner scanner = new Scanner(System.in);   // 1. 입력객체
            int menuChoice = scanner.nextInt();         // 2. 입력객체로 부터 입력받은 값을 정수형으로 변환후 가져와서 menuChoice 에 저장
            // 2. 선택한 메뉴의 경우의수
            // ---------------------------------- 1. 예금 --------------------------------
            if( menuChoice == 1 ){  // 1. 입력한 데이터가 '1' 이면
                System.out.println("--------------- 예금 -----------------");
                // 1. 계좌번호 입력
                System.out.print(" 계좌번호 입력 : ");            int 계좌번호 =scanner.nextInt();
                // 2. 계좌번호 검증
                if( account == 계좌번호 ){ // 만약에 계좌번호와 입력받은계좌번호와 같으면
                    // 3. 금액 입력
                    System.out.print(" 예금 할 금액 입력 : ");     int 예금액 = scanner.nextInt();
                    if( 예금액 < 0 ){ // 만약에 입력받은 금액이 0보다 작으면
                        System.out.println("[경고] 예금할수 없는 금액입니다.");
                    }else{ // 금액이 0보다 크면 예금처리 하기
                        money += 예금액;   // 4. 통장 잔고에 입력받은 금액을 누적 더하기
                        System.out.println("[성공] 해당 계좌번호에 예금 되었습니다. ");
                    } // if end
                }else{ // 계좌번호가 다를경우
                    System.out.println("[경고] 계좌번호가 일치하지 않습니다.");
                } // if end
            } // if end
            // ---------------------------------2. 출금---------------------------------------
            else if( menuChoice == 2 ){ // 2. 입력한 데이터 '2' 이면
                System.out.println("--------------- 출금 -----------------");
                System.out.print(" 계좌번호 입력 : ");    int 계좌번호 = scanner.nextInt();
                System.out.print(" 비밀번호 입력 : ");    int 비밀번호 = scanner.nextInt();
                // 1. 검증 [ 계좌번호가 1.일치한다 vs 2.안한다 ]
                if( account == 계좌번호 ){
                    // 2. 검증 [ 비밀번호가 1.일치한다 vs 2.안한다 ]
                    if( password == 비밀번호 ){
                        System.out.print(" 출금 할 금액 입력 : ");   int 출금 = scanner.nextInt();
                        // 3. 검증 [ 출금할 금액이 잔금보다 1.크다 vs 2.안크다 ]
                        if( money < 출금 ){
                            System.out.println("[경고] 잔고가 부족합니다. ");
                        }else{
                            money -= 출금;    // 통장 잔고에서 입력받은 출금 금액 누적 빼기
                            System.out.println("[성공] 해당 계좌번호에 요청한 금액이 출금 되었습니다. ");
                        }
                    }else{
                        System.out.println("[경고] 비밀번호가 일치하지 않습니다.");
                    } // if end
                }else{
                    System.out.println("[경고] 계좌번호가 일치하지 않습니다.");
                } // if end
            } // if end
            // ----------------------------------3. 출금--------------------------------------
            else if( menuChoice == 3 ){// 3. 입력한 데이터 '3' 이면
                System.out.println("--------------- 잔고 -----------------");
                System.out.print(" 계좌번호 입력 : ");    int 계좌번호 = scanner.nextInt();
                System.out.print(" 비밀번호 입력 : ");    int 비밀번호 = scanner.nextInt();
                //1.검증
                if( account == 계좌번호 ){
                    //2.검증
                    if( password == 비밀번호 ){
                        System.out.println("[알림] 현 계좌의 잔고 : "  + money + "원" );
                    }else{
                        System.out.println("[경고] 비밀번호 일치하지 않습니다. ");
                    }// if ned
                }else{
                    System.out.println("[경고] 계좌번호 일치하지 않습니다. ");
                } // if end
            } // if end
            // ----------------------------------4. 종료-----------------------------------------
            else if( menuChoice == 4 ){ // 4. 입력한 데이터 '4' 이면
                System.out.println("--------------- 종료 -----------------");
                break; // -- whlie문 종료
            } // if end
            // ----------------------------------5. 이체 -----------------------------------------
            else if( menuChoice == 5 ){
                System.out.println("--------------- 이체 -----------------");
                System.out.print(" 계좌번호 입력 : "); int 계좌번호 = scanner.nextInt();
                System.out.print(" 비밀번호 입력 : "); int 비밀번호 = scanner.nextInt();
                // 1. 검증
                if( account == 계좌번호 ){
                    // 2. 검증
                    if( password == 비밀번호 ){
                        System.out.print(" 이체할 계좌번호 : ");   int 이체번호 = scanner.nextInt();
                        // 3. 검증
                        if( faccount == 이체번호 ){
                            System.out.print(" 이체할 금액 : ");   int 이체금액 = scanner.nextInt();
                            // 4.검증
                            if( money < 이체금액 ){
                                System.out.println("[경고] 이체할 금액이 부족합니다.");
                            }else{
                                money -= 이체금액;  // 내 통장에서 이체금액 빼기
                                fmoney += 이체금액;
                                System.out.println(" 내 계좌 잔금 : " + money +" 원");
                                System.out.println(" 친구 계좌 잔금 : " + fmoney+" 원" );
                            } // if end
                        }else{
                            System.out.println("[경고] 이체할 계좌번호의 정보가 없습니다.");
                        } // if end
                    }else{
                        System.out.println("[경고] 비밀번호가 일치하지 않습니다.");
                    } // if end
                }else{
                    System.out.println("[경고] 계좌번호가 일치하지 않습니다.");
                }// if end
            } // if end
        } // while end
    } // main end
    // -------------------------------------------------------
}// class end
// -----------------------------------------------------------------








