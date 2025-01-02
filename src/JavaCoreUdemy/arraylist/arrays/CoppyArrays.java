package JavaCoreUdemy.arraylist.arrays;

import java.util.Arrays;
import java.util.Random;

public class CoppyArrays {
    public static void main(String[] args) {
        int nums[]= new int[20];
        Random rand = new Random();
        for(int i = 0;i<nums.length;i++){
            nums[i] = rand.nextInt() % 20; //0-100
        }
        System.out.println(Arrays.toString(nums));

        //Destination
        int destination[] = new int[20];
        for(int i = 0;i<nums.length;i++){
            destination[i] = nums[i];
        }
        System.out.println(Arrays.toString(destination));

        //CopyOf([],length)
        int arr[];
        arr = Arrays.copyOf(nums, nums.length);
        System.out.println(Arrays.toString(arr));
    }
}
