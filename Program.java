class Program{
    public int Rollno = 1;
    String name = "ABC";
    char grade = 'A';

    public void Display(){
        System.out.println("Student Information is \n Rollno is" + Rollno);
        System.out.println("Name=" + name);
        System.out.println("Grade=" + grade);
    }

    public static void main(String args[]){
        Program obj = new Program();
        obj.Display();
    }

    }

