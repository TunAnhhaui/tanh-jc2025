package oop.abstractMethod;

import oop.interf.SampleInterface;

public abstract class SimpleAbstractClass {

    private String name;

    public SimpleAbstractClass() {
    }

    //abstract Method
    public abstract void sayHello();

    //No abstract method has body
    public int calculate(int a, int b) {
        return a + b;
    }

    //static method
    public static void sayGoodbye() {
        System.out.println("Goodbye");
    }

    //final method
    public final void noChangeBody(){
        System.out.println(("Lop con khong duoc thay doi noi dung cua phuong thuc nay vi no la final method"));
    }
}
