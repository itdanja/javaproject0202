package Day04;

public class Ex1_제어문 { // class s
    public static void main(String[] args) { // main s

        /*
            IF 형태
                1. if( 조건 ) { 실행문; }            --  실행문이 하나일때는 { } 생략
                2. if( 조건 ) { 실행문; 실행문; }
                3.
                    if( 조건 ) { true실행문; }
                    else{ false실행문; }

                4. 조건이 다수일때 -> 하나의 결과 얻을때
                    if( 조건1 ) { 참1 실행문; }
                    else if( 조건2 ) { 참2 실행문; }
                    else if( 조건3 ) { 참3 실행문; }
                    else{ 거짓 실행문; }

                    조건이 다수일때 -> 다수의 결과 얻을때
                    if( 조건1 ) { 참1 실행문; }
                    if( 조건2 ) { 참2 실행문; }
                    if( 조건3 ) { 참3 실행문; }
                    else{ 거짓 실행문; }

                5. if 중첩
                    if( 조건1 ){
                        if( 조건2 ) { }
                        else{ }
                    }else{
                        if( 조건3 ) { }
                        else { }
                    }

         */
        // 1. 만약에 3이 2보다 크면 ( ) 옆에 실행문 ; 하나를 실행
            // ( 3>2 ) 해당 조건이 참이면 실행 [ true ]
        if( 3 > 2 ) System.out.println(" [1] 3이 2보다 크다.");

        // 2. 만약에 3이 5보다 크면 ( ) 옆에 실행문 ; 하나를 실행
            // ( 3 > 5 ) 해당 조건이 거짓이므로 실행 안함 [ false ]
        if( 3 > 5 ) System.out.println(" [1] 3은 5보다 크다.");

        // 3.
        if( 3 > 5 )
            System.out.println(" [2] 3은 5보다 크다1. ");
            System.out.println(" [2] 3은 5보다 크다2. ");
        // 4.
        if( 3 > 5 ){
            System.out.println(" [2] 3은 5보다 크다1. ");
            System.out.println(" [2] 3은 5보다 크다2. ");
        }
        // 5. 만약에 3이 5보다 크면 true 아니면 false->else
            // 조건 ? 참 : 거짓
        if( 3 > 5 ){
            //true
            System.out.println(" [3] 3은 5보다 크다.");
        }else{
            // false
            System.out.println(" [3] 3은 5보다 작다.");
        }

        // 6.
        if( 5 > 7 ) {  System.out.println( "* 3 > 7 ");}
        else if( 5 > 5 ){   System.out.println("* 3 > 5 ");}
        else if( 5 > 3 ){   System.out.println("* 3 > 3 ");}
        else if( 5 > 1 ){   System.out.println("* 3 > 1 ");}
        else{  System.out.println("* 3은 제일 작다.");   }

        // vs
        if( 5 > 7 ) {  System.out.println( "** 3 > 7 ");}
        if( 5 > 5 ){   System.out.println("** 3 > 5 "); }
        if( 5 > 3 ){   System.out.println("** 3 > 3 "); }
        if( 5 > 1 ){   System.out.println("** 3 > 1 "); }
        else{  System.out.println("** 3은 제일 작다.");   }

        // 7.
        if( 8 > 5 ){
            if( 8 > 7 ){ System.out.println(" 8은 5보다 크고 7보다 크다.");  }
            else{  System.out.println(" 8은 5보다 크고 7보다 작다."); }
        }else{
            if( 8 > 10 ){    System.out.println("8은 5보다 작고 10보다 크다."); }
            else{  System.out.println("8은 5보다 작고 10보다 작다. "); }
        }

    } // main e
} // class e

/*
    - 코드 흐름 : 위에서 아래로 실행
    - 흐름 제어 : 컴퓨터를 판단력,경우의수,제어 등등
        - if : 만약에
    - 예)
        5살 동생에게 천원주고 밖에 나가서 콜라 사와
        5살 동생에게 천원주고
            만약에 집 10m A편의점에서 콜라가 1000 이하이면 사와
            아니면 집 20m B편의점에서 콜라가 1000 이하이면 사와
            없으면 집으로 돌아와

        int 5살 = 1000
        if( 5살 == A편의점 ){
            IF( 콜라 <= 1000 ) { 구매O }
            ELSE{ 구매X }
        }
        if( 5살 == B편의점 ) {
            IF( 콜라<=1000) { 구매O }
            ELSE{ 구매X }
        }
        집으로 가기

 */
