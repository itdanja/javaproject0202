package Day02; // 패키지명

public class Ex2_연산자 { // 클래스 시작
    public static void main(String[] args) { // main s
        // 1. 산술연산자 : 결과를 값 반환
        System.out.println( 5+3 );  // 8
        System.out.println( 5-3 );  // 2
        System.out.println( 5*3 );  // 15
        System.out.println( 5/3 );  // 나누기 후 몫 : 1
        System.out.println( 5%3 );  // 나누기 후 나머지값 : 2
        System.out.println("-------------------------------------------");
        // 2. 비교연산자 : 결과를 true or false 반환
        System.out.println( 5 > 3 );    // true     // 5는 3보다 크다.
        System.out.println( 5 < 3 );    // false    // 5는 3보다 작다.
        System.out.println( 5 >= 3 );   // true     // 5는 3보다 크거나 같다.   [ => 조심 ]
        System.out.println( 5 <= 3 );   // false    // 5는 3보다 작거나 같다   [ =< 조심 ]
        System.out.println( 5 == 3 );   // false    // 5는 3과 같다.
        System.out.println( 5 != 3 );   // true     // 5는 3과 다르다.
        System.out.println("---------------------------------------------");
        // 3. 논리연산자 : 조건 2개일때 && ||
            // 사탕 이면서[&&] 초콜릿 먹을꺼야  // 사탕 또는[or] 초콜릿 먹을꺼야
        System.out.println( 5>3 && 5>4 );   // true and true -> true
        System.out.println( 5>3 && 5>6 );   // true and false -> false
        System.out.println( 5>3 || 5>4 );   // true or true -> true
        System.out.println( 5>3 || 5>6 );   // true or false -> true

        System.out.println("---------------------------------------------");
        // 4. 대입 : 특정위치에 넣는다.
        int 저장상자 = 10;      // 오른쪽에 있는 '10'를 '저장상자'에 대입하다.
        저장상자 = 5;           // * 대입시 기존 '10' 없어지고 '5' 대입 [ ! : 변수는 1개 저장 가능 ]
        저장상자 += 5;         // 오른쪽에 있는 '5'를 '저장상자' 에 더한 후에 결과를 대입 [ ! : 누적기능 ]
        // 저장상자 += 5;      // 1. 저장상자 + 5     2. 저장상자 = 결과
        System.out.println("---------------------------------------------");
        // 5. 삼항연산자 : 항 3개   ( 조건 : 비교/논리/true or false ) ? ( true ) : ( false )
        System.out.println( 5>3 ? "맞아" : "틀려" );
        System.out.println( 5>3 ? 5>4 ? "5 가장크다" : "4가크다" : "3이크다" );

        System.out.println("---------------------------------------------");
        // 6. 증감연산자 : ;
        int 정수상자 = 10;    // 데이터 1개를 저장할수 있는 변수[데이터 1개 할수 있는 상자]
        System.out.println( "변수안에 있는 데이터 : " + 정수상자 );
                            // 변수호출 : 변수이름
        System.out.println( "후위 증가 : " + ( 정수상자++ ) );     // 10 후위증가 이기때문에 출력후에 증가
        System.out.println( "확인 : " + 정수상자  );              // 11
        System.out.println( "선위 증가 : " + ( ++정수상자 ) );    //  12 선위증가 이기때문에 출력전에 증가

        System.out.println( "후위 감소 : " + ( 정수상자-- ) );      // 12 후위감소
        System.out.println( "확인 : " + 정수상자 );               // 11
        System.out.println( "선위 감소 : " + ( --정수상자 ) );      // 10 선위감소

        // 7. 연결연산자 : [  + : 더하기 vs 연결 ]
        System.out.println("---------------------------------------------");
        System.out.println("JAVA"+8);           // JAVA8 문자
        System.out.println("JAVA"+8+8);         // JAVA88
        System.out.println("JAVA"+ ( 8+8 ) );   // JAVA16

    } // main e
} // 클래스 끝
/*
    연산자 : 연산시 사용되는 특수문자/기호
        1. 산술연산자    :   +더하기    -빼기     *곱하기    /나누기    %나머지
        2. 비교연산자    :   >초과     <미만     >= 이상   <= 이하     == 같다     !=같지않다
        3. 논리연산자    :   && 이면서 면서 그리고 모두    || 이거나 거나 하나라도 또는   ! 부정/반대
                            &: shift+7                  | : shift+\
        4. 대입연산자    :
                            = 오른쪽 값을 왼쪽에 대입     [ 주의할점 :  = 대입  vs == 같다 ]
                            +=  -=  *=  /=  %=
        5. 삼항연산자    :
                            ( 조건 ) ? ( true ) : ( false )
        6. 증감연산자    :
                            ++ 1증가  ,   ++변수 : 선위증가 , 변수++ : 후위증가
                            -- 1감소  ,   --변수 : 선위감소 , 변수-- : 후위감소
        7. 연결연산자    :
                            3 + 3 => 6                     숫자+숫자 -> 숫자  [ 더하기 기능 ]
                            "안녕" + 3 => 안녕3             문자+숫자 -> 문자  [ 연결 기능 ]
                            "안녕" + 3 + 3 => 안녕33        문자+숫자 -> 문자+숫자 -> 문자
                            "안녕" + ( 3 + 3 ) => 안녕6     숫자+숫자 -> 문자+슷자 -> 문자



 */
