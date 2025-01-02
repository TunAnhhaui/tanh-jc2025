package JavaCoreUdemy.arraylist.Method;

import java.util.Scanner;

public class StaticMethod {

    public static int input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int value = sc.nextInt();
        return value;
    }

    //main entry point: Diem thuc thi chinh cua chuong trinh java
    public static void main(String[] args) {
//        int value = StaticMethod.input();
//        System.out.println(value);
        //Neu 2 phuong thuc static cung o trong 1 lop. Thi co the goi truc tiep
        int value = input();
        System.out.println("Value: "+value);
    }
}
