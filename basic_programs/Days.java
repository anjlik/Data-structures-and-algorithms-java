// Kunal is allowed to go out with his friends only on the even days of a given month. Write a program to count the number of days he can go out in the month of August.
import java.util.*;
class Days{
    public static void main(String[] args) {
        int count=0 ;
        int August_days=31;
        for(int i=1;i<=August_days;i++){
            if(i%2==0){
                count++;
            }
        }
        System.out.print("total days are "+ count);
    }
}