package Variable;

import java.util.Scanner;

public class StringVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine(); // Khi enter thi no se ket thuc qua trinh nhap du lieu
        System.out.printf("Hello %s \n",s);

        System.out.print("Enter your age:");
        int age = sc.nextInt();
        System.out.printf("%s is %d years old.\n",s,age);

    }
}
