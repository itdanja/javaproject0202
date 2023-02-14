package Day03;

import java.util.Scanner;

// https://github.com/itdanja/javaproject0202

public class Q1_회원가입 { // class s
    public static void main(String[] args) { // main s

        // 1. 입력 객체 [ Sc + 자동완성 ]
        Scanner scanner = new Scanner( System.in );
        // 2. 입력받은값을 String으로 가져와서 'id' 변수에 저장
        System.out.print("아이디 : ");     String id = scanner.next();
        System.out.print("비밀번호 : ");   short password = scanner.nextShort();
        scanner.nextLine();
        System.out.print("자기소개 : ");   String comment = scanner.nextLine();
        System.out.print("성별 :");       boolean sex = scanner.nextBoolean();
        System.out.print("선호번호 : ");   byte bno = scanner.nextByte();
        System.out.print("금액 : ");      int money = scanner.nextInt();
        System.out.print("키 : ");        float height = scanner.nextFloat();
        System.out.print("몸무게 : ");     double weight = scanner.nextDouble();

        // 3. 출력
        System.out.println("--------- 회원가입 정보 ---------");
        System.out.println(" - 아이디 : " + id );
        System.out.println(" - 비밀번호 : " + password );
        System.out.println(" - 자기소개 : " + comment );
        System.out.println(" - 성별 : " + sex );
        System.out.println(" - 선호번호 : " + bno );
        System.out.println(" - 금액 : " + money );
        System.out.println(" - 키 : " + height );
        System.out.println(" - 몸무게 : " + weight );
        System.out.println("*회원가입 해주셔서 감사합니다.");
        System.out.println("--------------------------------");

    } // main e
}  // class e
/*
    - 회원가입 만들기
        -입력조건
            - 아이디 [ String ]            15글자 내외
            - 비밀번호 [ short ]            4글자 숫자
            - 자기소개[ String]             띄어쓰기 100글자내외 가능
            - 성별[boolean]                남자:true 여자:false
            - 선언하는 회원번호[byte]       100 이하 숫자만 가능
            - 금액[ int ]                 20억 이내
            - 키 [ float ]               소수점 1자리까지  입력
            - 몸무게 [ double ]           소수점 2자리 까지 입력

        - 출력조건
        --------------- 회원가입 정보 ---------------
        - 아이디         qweqwe
        - 비밀번호       1234
        - 자기소개       안녕하세요 코드 처음입니다.
        - 성별           true
        - 회원번호        15
        - 금액           20000000
        - 키             182.2
        - 몸무게         90.25
        ** 회원가입을 해주셔서 감사합니다.**
        --------------------------------------------


 */