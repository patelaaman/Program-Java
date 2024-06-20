// Q1= > write a program to print last digit of the given number -  ENter any  number 123 
/*
import java.util.Scanner;
class Homework {

     public static void main(String args[]){

      System.out.println("Enter three Digit of nubmer ");
       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
     int b   = a%10;
   System.out.println("The Last Digit number is : "+b);
}
}
*/

/*
import java.util.Scanner;
class Homework{
  public static void main(String args[]){
      System.out.println("PLease Enter Four Digit Number : ");
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int  b = a%100;
      int c = b/10;
      System.out.println("The Last Second Digit is : "+c);
}
}
*/
import java.util.Scanner;
class Homework{
  public static void main(String args[]){
      System.out.println("PLease Enter Four Digit Number : ");
      Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int  hun= a/100;
System.out.println("The 100 Note is: "+hun);
    int  b  = a%100;
       
       
       int  fif= b/50;
 System.out.println("The 50 Note is: "+fif);
        int c = b%50;
     int tw= c/20;
System.out.println("The 20 Note is: "+tw);
      int  d  = c % 20;
       int te = d /10;
 System.out.println("The 10 Note is: "+te);
     int e  = d%10;
       int fi= e /5;
 System.out.println("The 5 Note is: "+fi);
    int f  = e%5;
      int two = f /2;
 System.out.println("The 2 Note  is: "+two);
         int g = f%2;
      int on= g/1;
    System.out.println("The 1 Note is: "+on);
}
}