package JavaCoreUdemy.arraylist;

import java.util.ArrayList;
import java.util.Random;

public class FindArrayListElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
       Random random = new Random();
       for(int i = 0; i < 10; i++){
           list.add(Math.abs(random.nextInt()%30));//0-30
       }
       System.out.println(list.toString());

       boolean flag = false;
       int find = 4;
       for(Integer item :list){
           if(item == find){
               flag = true;
               break;
           }
       }
       if(flag){
           System.out.printf("%d is found", find);
       }else{
           System.out.printf("%d is not found", find);
       }
    }
}
