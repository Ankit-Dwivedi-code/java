class first{
    int square(int x)
    {
        return x*x;
    }
}

class discriminant extends first
{
    int a, b, c;
    discriminant(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int discriminantvalue()
    {
        int d = super.square(b) - 4*a*c;
        return(d);
    }
}

class quadratic extends discriminant
{
    quadratic(int a, int b, int c)
    {
        super(a, b, c);
    }
    void checksolution()
    {
        int d = super.discriminantvalue();
        if (d >= 0) {
            System.out.println("Quadratic equation have real roots.");
        }
        else
        {
            System.out.println("Quadratic equation has imaginary roots.");
        }
    }
}

/**
 * usesuper
 */
public class usesuper {

    public static void main(String[] args) {
        discriminant d = new discriminant(2, 2, 2);
        System.out.println("Discriminant value: " + d.discriminantvalue());
        quadratic q = new quadratic(1, -3, 2);
        q.checksolution();
    }
}