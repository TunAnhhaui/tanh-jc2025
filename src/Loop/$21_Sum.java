package Loop;

import java.util.Scanner;

public class $21_Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n;
        do {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            sum += n;
        }while (n != 0);
        System.out.println("The sum is: " + sum);
    }
}
