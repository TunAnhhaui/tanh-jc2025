package Variable;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name1 = sc.nextLine();
        System.out.print("Enter prices: ");
        int price1 = sc.nextInt();
        System.out.print("Enter quantity: ");
        int quantity1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter prices: ");
        int price2 = sc.nextInt();
        System.out.print("Enter quantity: ");
        int quantity2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter a name: ");
        String name3 = sc.nextLine();
        System.out.print("Enter prices: ");
        int price3 = sc.nextInt();
        System.out.print("Enter quantity: ");
        int quantity3 = sc.nextInt();

        System.out.printf("Product 1: %s, %d, %d\n ", name1, price1, quantity1);
        System.out.printf("Product 2: %s, %d, %d\n ", name2, price2, quantity2);
        System.out.printf("Product 3: %s, %d, %d\n ", name3, price3, quantity3);

        int avg = (price1 + price2 + price3)/3;
        System.out.printf("The average price is: %d\n", avg);

        int sum = price1*quantity1 + price2*quantity2 + price3*quantity3;
        System.out.printf("The sum of price is: %d\n", sum);



    }
}
