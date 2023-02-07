/*
    1.프로젝트 : 프로그램 소스들의 집합 폴더
        프로젝트이름 오른쪽클릭 -> open in ->  explorer
    2.패키지 : 프로젝트내 소스 집합 폴더
    3.클래스 : JAVA 100% 객체지향 언어 사용 / 클래스 단위로 코드 작성
*/

// : 한줄 주석
/*  여러줄 주석 */

package Day02; // 1. 현재 클래스가 위치한 패키지/폴더 명

import java.util.Arrays;

// 2.자바 무조건 class { } 안에서 코드를 작성
public class Ex1_출력 { // class start
    // 3. 실행되는 코드 무조건 main 함수 { } 안에서 코드를 실행한다. // m + 자동완성
    public static void main(String[] args) { // main start
        // 4. console 출력 // System.out.println("출력하고 싶은말"); // so + 자동완성
        System.out.println("안녕하세요");
        // 5. 실행 : 코드 왼쪽에 실행버튼 클릭하거나 ctrl+shift+f10

        // * 1. 출력 [ !:인텔리제이 기준 : 이클립스 혹은 vscode 다를수 있음 ]
        /*
            1. System.out.print( "하고싶은말" );	: console 출력
            2. System.out.printf( "하고싶은말" );	: 형식/모양/틀 출력 [ f : format ]
            3. System.out.println( "하고싶은말" );	: console 출력후 줄바꿈
         */
        System.out.println("JAVA 안녕");      // 1. println() : console창에 출력후 줄바꿈 함
        System.out.printf("JAVA 안녕2");      // 2. printf() : console창에 출력후 줄바꿈 안함
        System.out.print("JAVA 안녕3");
        System.out.println("Ex1_출력.main");  // 3. soutm : 자동완성기능 --> 현재 함수 출력
        System.out.println("args = " + Arrays.toString(args));  // 4. 변수 출력
        System.out.println("args = " + args);                   // 5. 변수 출력

        // * 2. 제어문자[ 이스케이프 문자 ] : 기능이 있는 특수문자
        /*
            1. \n  : 줄바꿈
            2. \t  : 들여쓰기
            3. \\  :   \ 출력
            4. \"  :   " 출력
         */
        // 예1)
        System.out.println("------------------- 공지사항 ------------------");
        System.out.println("번호\t\t제목\t\t\t\t작성자\t\t날짜\t\t조회수");
        System.out.println("1\t\t자바게시판\t\t유재석\t\t02-07\t\t3");
        System.out.println("\n *글쓰기 *뒤로가기 ");
        /*
            1. 출력하는 방법 : System.out.println();
            2. \t , \n
         */
    } // main end
} // class end

/*
    자바 외 단축키
        1. 키보드 키 중에 방향키 위에 insert키
        2. 키보드 키 중에 오른쪽 끝에 위치한 TAB 키    [ 들여쓰기 : { } 마다 안에 들어올때마다 ]
    용어
        클래스 : 설계도
        객체 : 설계도 기반으로 생성된 메모리

 */
