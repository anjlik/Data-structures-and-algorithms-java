import java.util.*;
import java.util.Scanner;
public class even_odd {
    public static void main(String[] args) {
        System.out.print("enter the number: ");
       Scanner input= new Scanner(System.in);
       int num=input.nextInt();
       if(num %2==0){
        System.out.println("Number is even"); 
       }
       else{
        System.out.println("Number is odd");
       }

    }
}
