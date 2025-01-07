package JavaCoreUdemy.Exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    private ArrayList<Student> list = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    public void input() {
        int size = 0;
        System.out.print("Enter the number of students: ");
        size = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < size; i++) {
            System.out.println("Student " + (i + 1) + ": ");
            System.out.print("ID: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("JavaPoint: ");
            float javaPoint = sc.nextFloat();
            System.out.print("HtmlPoint: ");
            float htmlPoint = sc.nextFloat();
            sc.nextLine();

            Student std = new Student();
            std.setId(id);
            std.setName(name);
            std.setJavaPoint(javaPoint);
            std.setHtmlPoint(htmlPoint);
            list.add(std);
        }
    }

    public void display() {
        System.out.printf("\n%10s %10s %10s %10s %20s",
                "ID", "Ho ten", "Java", "Html", "Diem trung binh");
        for(Student std : list) {
            displayStudents(std);
        }
        System.out.println("\n");
    }

    public void displayStudents(Student std) {
        System.out.printf("\n%10s %10s %10.1f %10.1f %13.1f",
                std.getId(), std.getName(),std.getJavaPoint(),std.getHtmlPoint(), (std.getJavaPoint() + std.getHtmlPoint())/2.0
        );
    }

    public void find(){
        System.out.print("Enter the student ID: ");
        int id = sc.nextInt();
        boolean flag = false;
        Student student = null;
        for(Student std : list) {
            if(std.getId() == id) {
                flag = true;
                student = std;
                break;
            }
        }
        if(flag == false) {
            System.out.println("Student not found");

        }else{
            System.out.println("Student found");
            displayStudents(student);
        }
    }

    public void delete() {
        System.out.print("Enter the student ID: ");
        int id = sc.nextInt();
        boolean flag = false;
        for(Student std : list) {
            if(std.getId() == id) {
                list.remove(std);
                flag = true;
                break;
            }
        }
        if(flag == false) {
            System.out.println("Student not found");
        }else{
            System.out.println("Student deleted");
            display();
        }
    }
}
