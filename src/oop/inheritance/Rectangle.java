package oop.inheritance;

public class Rectangle extends Shape{

    public Integer height;
    public Integer width;


    public Rectangle(String color, Integer height, Integer width) {
        super(color);
        this.height = height;
        this.width = width;
        System.out.println("Inside Rectangle");
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("height: " + height + " width: " + width);
    }
    public void showArea(){
        System.out.println("Inside Area: "+getArea());
    }

    public void calculateArea(){
        setArea((double)(height*width));
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("red", 10, 20);
        rectangle.showInfo();
        rectangle.calculateArea();
        rectangle.showArea();
    }
}
