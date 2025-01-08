package oop.classname;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal(); //Khởi tạo đối tượng
        animal.name="Kim Anh";
        Animal animal2 = new Animal("Kim Anh", 6, "Nu");
        System.out.println( animal2);
    }
}
