package JavaCoreUdemy.arraylist;

import java.util.ArrayList;

public class GenerateArrayList {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>(); //Ep kieu gia tri cho JavaCoreUdemy.arraylist
        list.add(3d);
//        list.add("hello");
//        list.add(true);
//        list.add(0,"Tanh");

        System.out.println(list.toString());
        double sum = 0;
        for(int i =0 ; i< list.size();i++){
//            double item = (double) list.get(i);
            double item = list.get(i);
            sum+=item;
        }
        System.out.println(sum);
    }
}
