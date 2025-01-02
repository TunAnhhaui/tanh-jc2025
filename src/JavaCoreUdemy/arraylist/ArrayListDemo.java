package JavaCoreUdemy.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(3);
        list.add("hello");
        list.add(true);
        list.add(0,"Tanh");//Them vao vi tri mong muon

        Random rand = new Random();
        for (int i = 0; i< 10; i++) {
            list.add(rand.nextInt()%20);
        }
        //Truy xuat gia tri cua JavaCoreUdemy.arraylist
        for(Object o : list) {
            System.out.printf("%s ", o.toString());
        }
//        System.out.println(list.toString());
    }
}
