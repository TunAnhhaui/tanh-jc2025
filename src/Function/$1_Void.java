package Function;

import java.util.Scanner;

public class $1_Void {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float score;
        do{
            System.out.println("Enter score: ");
            score = sc.nextFloat();
            System.out.println("Score: "+score);
            printGrade(score);
        }while (score !=0);

    }

    public static void printGrade(float score){
        if(score < 0 || score > 10){
            System.out.println("Gia tri khong hop le");
            return;
        }

        if(score >= 8.5){
            System.out.println("A");
        }else if( score >= 7.7f && score < 8.5f){
            System.out.println("B+");
        }else if( score >=7 && score < 7.7f){
            System.out.println("B");
        }else if( score >= 6 && score < 7){
            System.out.println("C+");
        } else if (score >= 5.4f && score < 6) {
            System.out.println("C");
        } else if (score >= 4.8f && score < 5.4f) {
            System.out.println("D+");
        } else if (score >= 4.0f && score < 4.8f) {
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
