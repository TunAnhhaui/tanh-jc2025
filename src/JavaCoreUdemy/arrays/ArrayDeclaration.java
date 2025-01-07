package JavaCoreUdemy.arrays;

import java.util.Arrays;

public class ArrayDeclaration {
    public static void main(String[] args) {
        String[] students = new String[10];

        int numbers[] = {1,2,3,4,5};
        System.out.println(Arrays.toString(numbers));

        String name[] = {"Anh","Tuan"};
        System.out.println(Arrays.toString(name));

        Person p[] = {
                new Person(),
                new Person("AnhTT","a01")
        };
        System.out.println(Arrays.toString(p));

        //Cap phat du lieu cho mang
        int numbers3[] = new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(numbers3));

    }
}
