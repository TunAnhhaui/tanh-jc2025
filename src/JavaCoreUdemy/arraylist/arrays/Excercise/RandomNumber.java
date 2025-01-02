package JavaCoreUdemy.arraylist.arrays.Excercise;

import java.util.Random;

public class RandomNumber {
    public int[] generate(int size){
        Random rand = new Random();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            int num = Math.abs(rand.nextInt()%81); //20-100
            arr[i] = num;
        }
        return arr;
    }
    public void display(int[] arr,int length){
        int row =1;
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
            //Xac dinh so gia tri tren 1 hang
            if(row%10 == 0){
                System.out.println();
            }
            row++;
        }
        System.out.println();
    }

}
