// Arrays in java application
// class Array{
//     public static void main(String[] args){
//         int[] arr = {1,2,3,3,4,4,4,};
//         System.out.println("Size of array is: "+ arr.length);

//     }
// }

// Arrays of objects in  java

// class Student{
//     public int rollno;
//     public String name;

//     Student(int rollno, String name){
//         this.rollno  = rollno;
//         this.name = name;

//     }
// }
//     public class Geeks{
//         public static void main(String[] args){

//             Student[] arr;
//             arr = new Student[5];
//         arr[0] = new Student(1, "aman");
//         arr[1] = new Student(2, "vaibhav");
//         arr[2] = new Student(3, "shikar");
//         arr[3] = new Student(4, "dharmesh");
//         arr[4] = new Student(5, "mohit");


//         // accessing the elements of the array.
//         for(int i = 0; i < arr.length; i++){
//             System.out.println("Element at: " + i );

//         }
    
//     }
// }


// passing arrays to methods

// Predefine math class


// using import statement
// import java.lang.*;
// we can access math functions


import java.io.*;
import java.util.Scanner;
import java.lang.*;
class Math_Fun{
      double a, b, res;
    public void accept(){
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();

    }

    public void Display(){
        res = Math.pow(a,b);
        
        System.out.println("Result of a raise to the power of b is: " + res);

    }


    public static void main(String[] args){
        Math_Fun obj = new Math_Fun();
        
        obj.accept();
        obj.Display();


    }
}










