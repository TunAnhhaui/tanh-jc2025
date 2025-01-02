package JavaCoreUdemy.arraylist.arrays.Excercise;

public class RandomNumberMain {
    public static void main(String[] args) {
        RandomNumber randomNumber = new RandomNumber();
        int[] arr = randomNumber.generate(50);
        randomNumber.display(arr,50);
    }
}
