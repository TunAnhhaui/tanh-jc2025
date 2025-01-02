package JavaCoreUdemy.arraylist.Method;

public class Varargs {
//    public int add(int a, int b) {
//        return a + b;
//    }
//
//    public int add(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public int add(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }
    //Su dung vararg de tao  phuong thuc add nhieu bien
    public int add(int ... nums){
        int sum = 0;
        for(int item : nums){
            sum+=item;
        }
        return sum;
    }

    public static void main(String[] args) {
        Varargs varargs = new Varargs();
        int a = varargs.add(1,2,3,4,5,10);
        System.out.println(a);
    }
}
