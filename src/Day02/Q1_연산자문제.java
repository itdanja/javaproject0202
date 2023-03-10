package Day02;

public class Q1_연산자문제 { // CLASS S
    public static void main(String[] args) { // main s
        // git : https://github.com/itdanja/javaproject0202
        // 문제1 : 국어가 30 , 영어가 70 , 수학이 80 일때 총점과 평균 구하기
        System.out.println("총점 : " + (30+70+80) ); // "문자열"+( 연산계산 )
        System.out.println("평균 : " + (30+70+80)/3 );
        /*  문제2 : 사다리꼴 넓이 구하기 [ 윗변 30 밑변 20 높이 10 일때 ]
                    공식 : (윗변*밑변)*높이 / 2
         */
        System.out.println("사다리꼴 넓이 : " + ( 30*20 )*10 /2);
        /*문제3 : 가중치가 적용된 3과목 합계 [ 중간고사 80 , 기말고사 75 , 수행평가 90 ]
            가중치 기준 : [ 중간고사 30% , 기말고사 30% , 수행평가 40% 반영 ]
         */
        // 1:100%   0.1:10%     0.01 : 1%   0.001 : 0.1%
        System.out.println("가중치가 적용된 합계 : " + ( 80*0.3 + 75*0.3 + 90*0.4 ));

        //문제4 : 3753 홀수이면 '홀수' 아니면 '짝수' 출력
        System.out.println( 3753 % 2 == 1 ? "홀수" : "짝수" );
        //문제5 : 2056 짝수이면 '짝수' 아니면 '홀수' 출력
        System.out.println( 2056 % 2 == 0 ? "짝수" : "홀수" );
        //문제6 : 4872 7배수이면 '7배수 O' 아니면 '7배수 X' 출력
        System.out.println( 4872 % 7 == 0 ? "7배수O" : "7배수X" );
        //문제7 : 7792 3배수이면 '3배수 O' 아니면 '3배수 X' 출력
        System.out.println( 7792 % 3 == 0 ? "3배수O" : "3배수X" );
        //문제8 : 78 7배수 이거나 3배수 이면 '합격' 아니면 '불합격' 출력
        System.out.println( (78 % 7 == 0 || 78 % 3 == 0) ? "합격" : "불합격" );
        //문제9 : 102 13배수 이면서 짝수 이면 '좌석' 아니면 '공백' 출력
        System.out.println( (102 % 13 == 0 && 102 % 2 == 0) ? "좌석" : "공백" );
        //문제10
        System.out.println( 45>=65 ? "노년" :
                                    45>=50 ? "장년" :
                                            45>=30 ? "중년" :
                                                    45>=19 ? "청년" : "청소년"
                         );



    } // main e
} // CLASS E

/*
    // 조건 : 1.변수사용불가 2.출력/연산자 만 이용한 문제
    문제1 : 국어가 30 , 영어가 70 , 수학이 80 일때 총점과 평균 구하기
    문제2 : 사다리꼴 넓이 구하기 [ 윗변 30 밑변 20 높이 10 일때 ]
        공식 : (윗변*밑변)*높이 / 2
    문제3 : 가중치가 적용된 3과목 합계 [ 중간고사 80 , 기말고사 75 , 수행평가 90 ]
        가중치 기준 : [ 중간고사 30% , 기말고사 30% , 수행평가 40% 반영 ]
    문제4 : 3753 홀수이면 '홀수' 아니면 '짝수' 출력
    문제5 : 2056 짝수이면 '짝수' 아니면 '홀수' 출력
    문제6 : 4872 7배수이면 '7배수 O' 아니면 '7배수 X' 출력
    문제7 : 7792 3배수이면 '3배수 O' 아니면 '3배수 X' 출력
    문제8 : 78 7배수 이거나 3배수 이면 '합격' 아니면 '불합격' 출력
    문제9 : 102 13배수 이면서 짝수 이면 '좌석' 아니면 '공백' 출력
    문제10 : 나이가 65세 이상이면 '노년' 50세 이상이면 '장년'
            30세 이상이면 '중년' 19세이상이면 '청년' 그외 '청소년'
            조건 : 나이가 45일때 해당하는 연령 출력
    문제11 : 356789 숫자의 금액이 존재할때 지폐 세기
        출력 예 :  십만원 3 장 ,  만원 5장 , 천원 7장 , 백원 7개
 */
/*
1.출력
	System.out.println("출력할내용");
2.연산자
	1. 산술연산자
		+ 더하기	-빼기 *곱하기 /나누기[몫] %나누기[나머지]
	2. 비교연산자
		>초과 <미만 >=이상 <=이하 ==같다 !=같지않다
	3. 논리연산자
		&&이면서 || 이거나 ! 부정
	4. 대입연산자
		=	오른쪽 데이터를 왼쪽에 대입
		+= *= /= %=
	5. 증감연산자
		++1증가	--1감소
	6. 삼항연산자
		조건 ? 참 : 거짓
	7. 연결연산자
		+
홀/짝 공식	 : 특정 값의 나누기 2를 했을때 나머지가 1이면 홀수 0이면 짝수
	값 % 2 == 1 [홀수]
	값 % 2 == 0 [짝수 ]
배수 공식 	: 특정 값의 나누기 수를 했을때 나머지가 0 이면 수는 그 값의 배수
	값 % 수 == 0 [ 배수찾기 ]


 */