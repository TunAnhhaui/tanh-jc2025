package oop.interf;

public class UserService implements SampleInterface{
    @Override
    public void getName() {
        System.out.println("UserService");
    }
}
