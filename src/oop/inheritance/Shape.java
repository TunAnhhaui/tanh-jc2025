package oop.inheritance;

public class Shape {


    public String color;
    private Double area; //Dong goi du lieu

    public Shape(String color) {
        this.color = color;
        System.out.println("created Shape");
    }

    public void showInfo(){
        System.out.println("Color: " + color);
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

}
