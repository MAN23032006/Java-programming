// Sample program to take user input class as well
import java.util.Scanner;

class Program {
    int n;
    String name;
    char Grade;
    float Marks;
    double per;
    boolean result;

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();
        System.out.println("Enter your name:");
        name = sc.next();
        System.out.println("Enter Marks");
        Marks = sc.nextFloat();


    }

    public void display() {
        System.out.println("Value of n is " + n);
        System.out.println("Name is " +name);
        System.out.println("Marks is" +Marks);
        


    }
        public static void main(String[] args) {
        Program obj = new Program();
        obj.accept();
        obj.display();
    }
}



