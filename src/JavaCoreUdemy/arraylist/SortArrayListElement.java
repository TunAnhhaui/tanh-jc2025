package JavaCoreUdemy.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class SortArrayListElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            list.add(Math.abs(random.nextInt()%30));//0-30
        }
        System.out.println(list);
        for(int i = 0; i < 10; i++){
            for(int j = i; j < list.size(); j++){
                if(list.get(i) > list.get(j)){
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        System.out.println(list);
    }
}
