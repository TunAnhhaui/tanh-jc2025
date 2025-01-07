package JavaCoreUdemy.arrays.Excercise;

public class NumberArrayMain {
    public static void main(String[] args) {
        NumberArray numberArray = new NumberArray();
        int[] arr = new int[3];
        numberArray.input(arr);
        numberArray.display(arr);
        int min = numberArray.minArray(arr);
        int max = numberArray.maxArray(arr);
        System.out.println("\nMin array is: "+min);
        System.out.println("Max array is: "+max);
        float avg = numberArray.average(arr);
        System.out.println("Average array is: "+avg);
    }
}
