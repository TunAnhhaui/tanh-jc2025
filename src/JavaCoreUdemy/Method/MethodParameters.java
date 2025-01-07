package JavaCoreUdemy.Method;

public class MethodParameters {
    public void input(){
        System.out.println("Input JavaCoreUdemy.arraylist.Method");
    }

    public int add(int a,int b){
        System.out.printf("%d and %d\n ",a,b);
        return a+b;
    }
    public void display(String name, int age){
        System.out.printf("%s have %d",name, age);
    }

    public static void main(String[] args) {
        MethodParameters mp = new MethodParameters();
        mp.input();
        int a = 5;
        int b = 7;
        int result = mp.add(a,b);
        mp.display("result",result);
    }
}
