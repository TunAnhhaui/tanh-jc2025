package JavaCoreUdemy.Method.Exercise;

public class QuadraticEquation {
    public void sovle(float a, float b, float c) {
        LinearEquation linearEquation = new LinearEquation();

        if(a == 0){
            linearEquation.sovle(b,c);
        }else{
            float delta = b*b - 4*a*c;
            if(delta < 0){
                System.out.println("The equation has no solution");
            }else if(delta == 0){
                float x = -b/(2*a);
                System.out.printf("One real solution: %.3f\n", x);
            }else{
                float x1 = (float) ((-b + Math.sqrt(delta))/(2*a));
                float x2 = (float) ((-b - Math.sqrt(delta))/(2*a));
                System.out.printf("Two real solution: \n x1 = %.3f\n x2 = %.3f", x1, x2);
            }
        }
    }

    public static void main(String[] args) {
        LinearEquation linearEquation = new LinearEquation();
        float a = linearEquation.enter("Enter a: ");
        float b = linearEquation.enter("Enter b: ");
        float c = linearEquation.enter("Enter c: ");

        System.out.printf("%.2fx^2 + %.2fx + %.2f = 0\n", a, b, c);
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        quadraticEquation.sovle(a,b,c);
    }

}
