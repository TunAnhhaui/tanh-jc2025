package Loop;

public class $6_Continue {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;

        while (number <= 6) {
            number++;
            if(number == 2|| number == 4){
                continue;
            }
            sum += number;
        }
        System.out.println(sum);
    }
}
