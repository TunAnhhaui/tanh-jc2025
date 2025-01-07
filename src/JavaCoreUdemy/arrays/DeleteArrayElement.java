package JavaCoreUdemy.arrays;

import java.util.Arrays;

public class DeleteArrayElement {
    public static void main(String[] args) {
        int nums[]= new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(nums));

        //Xoa phan tu trong mang
        int i = 2;
        while (i < nums.length-1) {
            nums[i] = nums[i+1];
            i++;
        }
        nums[nums.length-1]=0;
        System.out.println(Arrays.toString(nums));
    }
}
