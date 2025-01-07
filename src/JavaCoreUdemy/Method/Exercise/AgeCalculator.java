package JavaCoreUdemy.Method.Exercise;

import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {

    //Phuong thuc nhap nam sinh
    public int enterYearOfBirth() {
        int yob = 0;

        Scanner sc = new Scanner(System.in);//Luong nhap
        System.out.print("Enter year of birth: ");
        yob = sc.nextInt();

        return yob;
    }

    //Phuong thuc tinh tuoi dua vao nam sinh
    public int calcAge(int yearOfBirth) {
        Date now = new Date();
        return 1900+ now.getYear() - yearOfBirth + 1;
    }

    public void displayAge(int age) {
        System.out.println("Your age is " + age);
    }

    public static void main(String[] args) {
        AgeCalculator calc = new AgeCalculator();
        int yob = calc.enterYearOfBirth();
        System.out.println("Year Of Birth: "+yob);
        int age = calc.calcAge(yob);
        calc.displayAge(age);
    }
}
