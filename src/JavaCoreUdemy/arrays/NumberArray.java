package JavaCoreUdemy.arrays;

import java.util.Random;

public class NumberArray {

    Random rand = new Random();
    //create array
    public int[] generate(){
        int[] arr = new int[10]; // KHoi tao va cap phat 10 phan tu cho mang
        for(int i  =0 ; i< arr.length ; i++){
            arr[i] = Math.abs(rand.nextInt()%31);//0-30
        }
        return arr; // Tra ve mot mang
    }

    //display array
    public void display(int[] arr, int length){
        for(int item: arr){
            System.out.printf("%d " , item);
        }
        System.out.println();
    }

    //Sort
    public int[] sort(int[] arr, int length){
        for(int i =0; i< arr.length-1; i++){
            for ( int j =i; j< arr.length; j++){
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr;
    }
}
