package JavaCoreUdemy.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CopyArrayListElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            list.add(Math.abs(random.nextInt()%30));//0-30
        }
        System.out.println(list.toString());

        //Copy phan tu list sang list1
        ArrayList<Integer> list1 = new ArrayList<>();
        for(Integer item : list){
            list1.add(item);
        }
        System.out.println(list1.toString());

        //Copy bang lambda
        ArrayList<Integer> list2 = new ArrayList<>();
        list.forEach(item->{
            list2.add(item);
        });
        System.out.println(list2.toString());

        //Copy sang list
        List<Integer> list3 = list.subList(0, list.size());
        System.out.println(list3.toString());
    }
}
