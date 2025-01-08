package practice.package1;

public class Dog extends Animal{

    private String color;

    public Dog(){
        super();
    }

    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Dog";
        dog.color = "blue";
        System.out.println(dog.toString() );
    }
}
