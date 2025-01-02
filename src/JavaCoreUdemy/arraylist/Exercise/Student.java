package JavaCoreUdemy.arraylist.Exercise;

public class Student {
    public int id;
    public String name;
    public float javaPoint;
    public float htmlPoint;

    public Student() {
    }


    public Student(int id, String name, float javaPoint, float htmlPoint) {
        this.id = id;
        this.name = name;
        this.javaPoint = javaPoint;
        this.htmlPoint = htmlPoint;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getJavaPoint() {
        return javaPoint;
    }

    public void setJavaPoint(float javaPoint) {
        this.javaPoint = javaPoint;
    }

    public float getHtmlPoint() {
        return htmlPoint;
    }

    public void setHtmlPoint(float htmlPoint) {
        this.htmlPoint = htmlPoint;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", javaPoint=" + javaPoint +
                ", htmlPoint=" + htmlPoint +
                '}';
    }
}

