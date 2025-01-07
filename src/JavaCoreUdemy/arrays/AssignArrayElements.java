package JavaCoreUdemy.arrays;

import java.util.Arrays;
import java.util.Random;

public class AssignArrayElements {
    //Gan gia tri cho cac phan tu mang 1 chieu
    public static void main(String[] args) {
        int nums[] = new int[5];
        nums[0] = 0;
        nums[1] = 1;
        nums[2] = 2;
        System.out.println(Arrays.toString(nums));
        Random rand = new Random();
        for (int i = 0; i<nums.length; i++) {
            nums[i] = rand.nextInt(); // Tao gia tri ngau nhien
        }
        System.out.println(Arrays.toString(nums));
    }
}
