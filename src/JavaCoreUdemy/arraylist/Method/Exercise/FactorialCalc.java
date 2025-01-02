package JavaCoreUdemy.arraylist.Method.Exercise;

import java.util.Scanner;

public class FactorialCalc {

    public int enterNumber() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do{
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            if(num < 0){
                System.out.println("Enter a valid number is greater than zero");
            }
        }while ((num<0));
        return num;
    }

    public int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;

        }
        return fact;
    }

    public static void main(String[] args) {
        FactorialCalc fc = new FactorialCalc();
        int num = fc.enterNumber();
        int fact = fc.factorial(num);
        System.out.println(num+"! = "+fact);
    }
}
