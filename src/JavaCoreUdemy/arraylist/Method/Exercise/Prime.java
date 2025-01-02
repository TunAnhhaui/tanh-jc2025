package JavaCoreUdemy.arraylist.Method.Exercise;

import java.util.Scanner;

public class Prime {

    public int enterNumber() {
        Scanner sc = new Scanner(System.in);
        int num =0;
        do{
            System.out.println("Enter a number");
            num = sc.nextInt();
            if(num < 0){
                System.out.println("Invalid number");
            }

        }while(num<0);
        return num;
    }

    public boolean isPrime(int num) {
        if( num < 0) return false;
        boolean flag = true;
        for ( int i = 2; i <= Math.sqrt(num) ; i++){
            if(num % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Prime  prime = new Prime();
        int n = prime.enterNumber();
        if(prime.isPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
}
