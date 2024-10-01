import java.util.Scanner;

class Student{
    Scanner in = new Scanner(System.in);
    int rollno;
    String name;

    void inputName(){
        System.out.println("Enter name of student: ");
        name = in.nextLine();
    }

    void showName(){
        System.out.println("Candidate name: " + name);
    }
}

/**
 * inheritance
 */
class StudentInfo extends Student {

    void inputRoll(){
        System.out.println("Enter roll: ");
        rollno = in.nextInt();
    }

    void showRoll(){
        System.out.println("Candidate roll: " + rollno);
    }
}

class singleinheritance{
    public static void main(String[] args) {
        StudentInfo si = new StudentInfo();

        si.inputName();
        si.showName();
        si.inputRoll();
        si.showRoll();
    }
}