package Loop;

public class $4_NestedLoops {

    //Vong for
    public static void main(String[] args) {
        System.out.print("    ");
        for(int i = 1; i <= 9; i++){
            System.out.print("   "+i);
        }
        System.out.println(" ");

        System.out.println("---------------------------------------------");
        //Vong for long nhau
        for(int i = 1; i <= 9; i++){ //Day la for tao dong
            System.out.print(i+ " | ");
            for(int j = 1; j <= 9; j++){ // Day la for tao cot
                System.out.printf("%4d", i* j);
            }
            System.out.println();
        }
    }



}
