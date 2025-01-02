package JavaCoreUdemy.arraylist.Method;

public class InstanceMethod {
    public int add(int a, int b) {
        int result = a + b;

        return result;
    }
    public void display(int a) {
        System.out.println("result: "+a);
    }

    public static void main(String[] args) {
        //Tạo ra doi tuong va cap phat bo nho cho doi tuong
        InstanceMethod instanceMethod = new InstanceMethod();
        int c = instanceMethod.add(1, 2);
        instanceMethod.display(c);
    }
}
