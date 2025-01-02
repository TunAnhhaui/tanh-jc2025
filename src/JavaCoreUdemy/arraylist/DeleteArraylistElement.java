package JavaCoreUdemy.arraylist;

import java.util.ArrayList;

public class DeleteArraylistElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(3);
        list.add(5);
        list.add(4);
        list.add(0,1);

        System.out.println(list.toString());
        list.remove(2);
        System.out.println(list.toString());

        for(Integer item:list){
            if(item == 1){
                list.remove(1);
                break;
            }
        }
        System.out.println(list.toString());

        //Xoa tat ca phan tu trong JavaCoreUdemy.arraylist
        list.clear();
        list.removeAll(list);
        System.out.println(list.toString());
    }
}
