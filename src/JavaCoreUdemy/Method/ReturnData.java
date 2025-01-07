package JavaCoreUdemy.Method;

public class ReturnData {
    public int add(int a, int b) {
        int reult = a + b;
        return reult;
    }

    public void display(int value) {
        System.out.println(value);
        if(value < 0) {
            return;
        }
        System.out.println("display method");
    }

    public float subtract(float a, float b) {
        float reult = a - b;
        return reult;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        ReturnData returnData = new ReturnData();
        int r = returnData.add(a, b);
        returnData.display(r);
        r = returnData.add(-1,0);
        returnData.display(r);
    }
}
