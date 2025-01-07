package JavaCoreUdemy.arrays.Excercise;

import java.util.Scanner;

public class NumberArray {
    public int[] input(int[] arr){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do{
            System.out.printf("arr[%d] = ",i+1);
            arr[i]= sc.nextInt();
            i++;
        }while ((i<arr.length));
        return arr;
    }

    public void display(int[] arr){
        int row = 1;
        System.out.println();
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
            if(row%5 ==0){
                System.out.println();
            }
            row++;
        }
    }

    public int minArray(int[] arr){
        int min = Integer.MAX_VALUE;//Gia su min hien tai la gia tri min lon nhat
        for(int item : arr){
            if(min > item){
                min = item;
            }
        }
        return min;
    }
    public int maxArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int item : arr){
            if(max < item){
                max = item;
            }
        }
        return max;
    }

    public float average(int[] arr){
        int sum = 0;
        for(int item : arr){
            sum += item;
        }
        return sum/arr.length;
    }
}
