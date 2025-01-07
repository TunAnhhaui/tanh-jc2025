package JavaCoreUdemy.arrays;

public class NumberArrayMain {
    public static void main(String[] args) {
        NumberArray na = new NumberArray();
        int[] arr = na.generate();
//        System.out.println(Arrays.toString(arr));
        na.display(arr,10);
        na.sort(arr,10);
        na.display(arr,10);
    }
}
