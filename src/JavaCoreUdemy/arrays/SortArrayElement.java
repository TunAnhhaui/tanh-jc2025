package JavaCoreUdemy.arrays;

import java.util.Arrays;
import java.util.Random;

public class SortArrayElement {
    public static void main(String[] args) {
        int nums[]= new int[10];
        Random rand = new Random();
        for(int i = 0;i<nums.length;i++){
            nums[i] = rand.nextInt() % 11; //0-10
        }
        System.out.println(Arrays.toString(nums));

        //Bubble sort
        for ( int i=0; i<nums.length;i++){
            for(int j = i; j<nums.length;j++){
                if(nums[i] < nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println("Bubble Sort");
        System.out.println(Arrays.toString(nums));
    }
}
