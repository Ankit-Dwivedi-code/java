import java.util.Scanner;

class shape{
    float r;
    final float pi= 3.14f;

    void inputradius(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter radius: ");
        r = in.nextFloat();
    }

    void showradius()
    {
        System.out.println("Radius = " + r);
    }
}

class circle extends shape{
    void areacircle(){
        System.out.println("Area of circle: " + pi * r * r);
    }

    void circumference()
    {
        System.out.println("Circumference of circle : " + 2 * pi * r);
    }

}

class sphere extends shape{
    void volumesphere(){
        System.out.println("Volume of sphere = " + (4 * pi * r * r * r)/3);
    }

    void surfacearea(){
        System.out.println("Surface area = " + 4 * pi * r * r);
    }
}

/**
 * multiinheritance
 */
public class multiinheritance {

    public static void main(String[] args) {
        circle c = new circle();
        c.inputradius();
        c.showradius();
        c.areacircle();
        c.circumference();

        sphere s = new sphere();
        s.inputradius();
        s.showradius();
        s.volumesphere();
        s.surfacearea();
    }
}