//Wap to display message of superclass into thier subclass by using "super"

class first{
    void showsuperclass()
    {
        System.out.println("This class is super class");
    }
}

class second extends first
{
    void showsubclass()
    {
        super.showsuperclass();
        System.out.println("The sub class represent a super class");
    }
}

/**
 * superclass
 */
public class superclass {

    public static void main(String[] args) {
        second z = new second();
        z.showsubclass();
    }
}