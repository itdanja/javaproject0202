package Day05;

import java.util.Scanner;

public class Ex1_무한반복문 {
    public static void main(String[] args) {

        // 1. 무한출력
        /*
        while(true){ // 무한반복문 { } 안에 있는 코드는 무한반복
            System.out.println("무한반복중 ");
        } // while end 
        */
        // 2. 무한입력
        while ( true ){ // while(조건) { } : 만약에 조건이 true이면 { } 안에 있는 코드 실행
            Scanner scanner = new Scanner(System.in);
            scanner.next();
        } // while end


    } // main end 
} // class end 
