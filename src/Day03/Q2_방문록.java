package Day03;

import java.util.Scanner;

public class Q2_방문록 {
    public static void main(String[] args) {

        // 1. 입력객체
        Scanner scanner = new Scanner(System.in);
        // 2. 입력받은 데이터를 저장할 변수
        String output = "========== 방문록 ==========\n번호\t작성자\t방문록\n";
        String footer = "==========================\n";
        // *
        System.out.print(" [1] 작성자 : ");    output += 1 +"\t"+scanner.next()+"\t";
        System.out.print(" [1] 방문록 : ");    output += scanner.next() + "\n";
        System.out.print( output + footer ); // 3. 출력
        // *
        System.out.print(" [2] 작성자 : ");    output += 2 +"\t"+scanner.next()+"\t";
        System.out.print(" [2] 방문록 : ");    output += scanner.next() +"\n";
        System.out.print( output + footer );
        //*
        System.out.print(" [3] 작성자 : ");    output += 3 +"\t"+scanner.next()+"\t";
        System.out.print(" [3] 방문록 : ");    output += scanner.next() + "\n";
        System.out.print( output + footer);
        //*
        System.out.print(" [4] 작성자 : ");    output += 4 +"\t"+scanner.next()+"\t";
        System.out.print(" [4] 방문록 : ");    output += scanner.next() + "\n";
        System.out.print( output + footer );
        //*
        System.out.print(" [5] 작성자 : ");    output += 5 +"\t"+scanner.next()+"\t";
        System.out.print(" [5] 방문록 : ");    output += scanner.next() +"\n";
        System.out.print( output + footer  );

    }
}
/*
    조건1 : 제어문,배열,반복문 사용금지
    조건2 : 방문록 5번 작성한다.
    결과물 : 아래 그림 첨부
    정답/질문 알고싶으면 : itdanja@kakao.com

 */

