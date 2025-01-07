package JavaCoreUdemy.Method;

public class PassByReference {
    public void swap (Number a, Number b) {
        System.out.printf("a=%d, b=%d\n", a.value, b.value);
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
        System.out.printf("a=%d, b=%d\n", a.value, b.value);
    }

    public static void main(String[] args) {
        Number a = new Number();
        Number b = new Number();
        PassByReference p = new PassByReference();
        a.value = 5;
        b.value = 6;
        p.swap(a,b);
    }
}
