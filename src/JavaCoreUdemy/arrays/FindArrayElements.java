package JavaCoreUdemy.arrays;

import java.util.Arrays;
import java.util.Random;

public class FindArrayElements {
    public static void main(String[] args) {
        int nums[]= new int[20];
        Random rand = new Random();
        for(int i = 0;i<nums.length;i++){
            nums[i] = rand.nextInt() % 20; //0-100
        }
        System.out.println(Arrays.toString(nums));

        //Tim kiem gia tri co ton tai trong mang hay khong?
        int find = 5;
        boolean flag = false;
        for ( int item : nums){
            if(item == find){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.printf("%d is found: ", find);
        }else{
            System.out.printf("%d is not found: ", find);
        }
    }
}
