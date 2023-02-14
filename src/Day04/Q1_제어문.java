package Day04;


import java.util.Scanner;

public class Q1_제어문 {
    public static void main(String[] args) {

        // 1. 입력객체
        Scanner scanner = new Scanner(System.in);

        // ---------------- 1. --------------//
        // 1. 입력하기전 무엇 입력해야 되는지 안내문 출력
        System.out.print(" 문제1 데이터 : ");
        // 2. 입력받은 데이터를 int형으로 가져와서 int 변수에 저장
        int 문제1 = scanner.nextInt();
        // 3. 만액에 입력받은 데이터가 나누기 2를 했을때 나머지가 1이면
        if( 문제1 % 2 == 1 ){ // 홀수
            System.out.println("홀수입니다.");
        }else{ // 짝수
            System.out.println("짝수입니다.");
        }
        // --------------- 2. --------------- //
        System.out.print(" 문제2 데이터 : ");
        int 문제2 = scanner.nextInt();
        if( 문제2 % 7 == 0 ){
            // 만약에 입력받은 값이 나누기 7를 했을때 나머지가 0 이면
            System.out.println("- 7배수 입니다.");
        }else{
            System.out.println("- 7배수 아닙니다.");
        }
        // ---------------- 3. --------------- //
        // 1. 3개의 점수를 입력받는다.
        System.out.print("국어 : ");   int 국어 = scanner.nextInt();
        System.out.print("영어 : ");   int 영어 = scanner.nextInt();
        System.out.print("수학 : ");   int 수학 = scanner.nextInt();
        // 2. 입력받은 데이터를 이용한 연산 [ 평균 구하기 ]
        int 평균 = (국어+영어+수학)/3;
        // 3. 만약에 평균이 80점 이상이면
        if( 평균 >= 80 ){
            // * 국어점수가 90점 이상이면
            if( 국어>=90 ){      System.out.println("-합격 국어우수");     }
            // * 영어점수가 90점 이상이면
            if( 영어>=90 ) {     System.out.println("-합격 영어우수");     }
            // * 수학점수가 90점 이상이면
            if( 수학>=90 ) {     System.out.println("-합격 수학우수");      }

        }else if( 평균 >= 70 ){ // 아니고 평균이 70점 이상이면
            System.out.println("-합격");
        }else{ // 그외
            System.out.println("-불합격");
        }


    }
}

/*

    [ 삼항연산자 대신에 if ]
    문제1 : 입력받은 값이 홀수 이면 '홀수입니다' 아니면 '짝수입니다'
    문제2 : 입력받은 값이 7배수이면 '7배수입니다' 아니면 '7배수 아닙니다'
    문제3 : 국어 영어 수학 3개 점수를 입력받아
        평균이 80점이상 이면서
            국어가 90점이상이면 '[합격] 국어 우수'
            영어가 90점이상이면 '[합격] 영어 우수 '
            수학가 90점이상이면 '[합격] 수학 우수'
        평균이 70점이상이면   '합격'
        아니면  '불합격'
    문제4 : 2개의 정수를 입력받아 가장 큰수 출력
        입력 예) 3 5       출력 예 ) 3 이 가장 큽니다.
    문제5 : 3개의 정수를 입력받아 가장 큰수 출력
        입력 예) 3 5 2      출력 예 ) 5 이 가장 큽니다.
    문제6 : 4개의 정수를 입력받아 가장 큰수 출력
        입력 예) 3 5 2 8     출력 예 ) 8 이 가장 큽니다.
    문제7 : 3개의 정수를 입력받아 오름차순으로 출력
        입력 예) 3 5 2      출력 예 ) 2 3 5
    문제8 : 4개의 정수를 입력받아 내림차순 출력
        입력 예) 3 5 2 8     출력 예 ) 8 5 3 2
 */
