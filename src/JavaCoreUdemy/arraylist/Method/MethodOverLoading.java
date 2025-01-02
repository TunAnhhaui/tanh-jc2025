package JavaCoreUdemy.arraylist.Method;

public class MethodOverLoading {

    public int add(int a, int b) {
        System.out.println("add(int,int)");
    return a + b;
    }

    public int add(int a, int b,int c) {
        System.out.println("add(int,int,int)");
        return a + b + c;
    }

    public float add(float a, float b) {
        System.out.println("add(float,float)");
        return a + b;
    }

    public float add(float a, float b, float c) {
        System.out.println("add(float,float,float)");
        return a + b + c;
    }

    public static void main(String[] args) {
        MethodOverLoading ob = new MethodOverLoading();
        ob.add(1, 2);
        ob.add(2,3,4);
        ob.add(2.0f, 3.0f);
    }
}
