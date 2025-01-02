package JavaCoreUdemy.arraylist.Method.Exercise;

import java.util.Scanner;

public class LinearEquation {

    Scanner sc = new Scanner(System.in);
    public int enter(String msg){
        System.out.print(msg);
        return sc.nextInt();
    }

    public void sovle(float a, float b){
        if (a == 0){
            System.out.println("No solution");
        }else{
            float x = -b/a;
            System.out.printf("x = %.2f",x);
        }
    }

    public static void main(String[] args) {
        LinearEquation obj = new LinearEquation();
        float a = obj.enter("Enter a: ");
        float b = obj.enter("Enter b: ");

        System.out.printf("0 = %.2fx + %.2f\n",a,b);
        obj.sovle(a,b);
    }
}
