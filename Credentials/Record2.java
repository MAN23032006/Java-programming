import Credentials.*;
import java.util.Scanner;

class Verify{
    public void Validate(){
        Credentils.record rec = new Credentials.Record();


        String username = rec.username();
        String pass = rec.Pass();

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Username: ");
        String username1 = sc.nextline();

        Sytem.out.print("Enter Password:");
        String pass1 = sc.nextLine();


        if(username.equals(username1) && pass.equals(pass1)){
            System.out.println("Login Successful");

        }
        else{
            System.out.println("Invalid Credemtials: ");

        }
        public static void main(String args){
            Verify obj = new Verify();
            verify.validate();
            
        }


}