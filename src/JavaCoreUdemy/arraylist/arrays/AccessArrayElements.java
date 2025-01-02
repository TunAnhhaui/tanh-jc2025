package JavaCoreUdemy.arraylist.arrays;

public class AccessArrayElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int item = nums[0];
        System.out.println("item: " + item);

        for(int i =0;i< nums.length;i++){
            System.out.println(nums[i]);
        }

        //For-each
        System.out.println("For each element in array:");
        for(int item1 : nums){
            System.out.println(item1);
        }
    }
}
