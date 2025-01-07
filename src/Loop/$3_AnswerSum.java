package Loop;

import java.util.Random;
import java.util.Scanner;

public class $3_AnswerSum {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

//        //Cach 1:
//        int a;
//        int b;
//        int c;
//        int answer;
//        do {
//            a = random.nextInt(20)+1;
//            b = random.nextInt(20)+1;
//            c = a+b;
//            System.out.printf("So thu nhat la: %d\n", a);
//            System.out.printf("So thu hai la: %d\n", b);
//            System.out.print("Vui long tinh tong 2 so va tra loi: ");
//            answer = sc.nextInt();
//        }while (answer != c);
//        System.out.println("Ban da tra loi chinh xac!!!");

        //Cach 2:
        int num1 = (int) (Math.random()*10);
        int num2 = (int) (Math.random()*10);

        System.out.print("What is " + num1 +  " + " + num2 + "? ");
        int answer1 = sc.nextInt();
        while (num1 + num2 != answer1) {
            System.out.print("What is " + num1 +  " + " + num2 + "? ");
            answer1 = sc.nextInt();
        }

        System.out.println("Ban da tra loi chinh xac!!!");
    }
}
