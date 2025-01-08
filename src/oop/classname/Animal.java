package oop.classname;

public class Animal {

    //Thuộc tính của class
    String name;
    int age;
    String gender;

    //Constructor: hàm khởi tạo
    public Animal(){

    }

    public Animal(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //Phương thức class
    void speak() {
        System.out.println("I'm speaking " + name + " " + age + " " + gender);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
