package Function;

public class $0_Function {

    public static void main(String[] args) {
        int i = 5;
        int j = 7;
        int k = max(i, j);
        System.out.printf("The max of %d and %d is %d", i, j, k);
    }

    public static int max(int num1, int num2) {
        int result;
        if (num1 > num2) {
            result = num1;
        } else {
            result = num2;
        }
        return result;
    }
}
