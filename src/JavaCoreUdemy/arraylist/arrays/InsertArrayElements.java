package JavaCoreUdemy.arraylist.arrays;

import java.util.Arrays;

public class InsertArrayElements {
    public static void main(String[] args) {
        int nums[] = new int[10];
        nums[0] = 9;
        nums[1] = 2;
        nums[2] = 1;
        nums[3] = 5;
        nums[4] = 7;
        nums[5] = 3;
        nums[6] = 8;
        for (int i = 9; i>=1;i--){
            nums[i] = nums[i-1];
        }
        nums[2] = 6;
        System.out.println(Arrays.toString(nums));
    }
}
