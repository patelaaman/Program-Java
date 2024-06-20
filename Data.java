/*Q1-->  Write a Java program to convert a given integer (in seconds) to hours, minutes andseconds.
Test Data :
Input seconds: 25300Expected
*/


/*
import java.util.Scanner;
class Data{
    public static void main(String args[]){
  Scanner sc = new  Scanner(System.in);
  int Second;
  int hour ;
  int minute ;
 int rem;
   System.out.println("Enter Second ");
  Second = sc.nextInt();
  hour  = Second / (60*60);

 rem = Second %(60*60);
  minute = rem/60;
rem =  rem%60;
  Second = rem;
System.out.println("Hour : "+hour);
System.out.println("\nMinute:"+minute);
System.out.println("\nSecond:"+Second);
}
}

*/


//=========================================================

/*
Q2--> Write a Java program to convert a given integer (in days) to years, months and days,assumes
that all months have 30 days and all years have 365 days.

Test Data : Input no. of days: 2535
*/


/*

import java.util.Scanner;
class Data{
    public static void main(String args[]){
  Scanner sc = new  Scanner(System.in);
  int days;
  int year;
  int month ;
 int rem;
System.out.println("Enter days ");
days = sc.nextInt();
year = days /365;

rem = days %365;

month = rem/30;

rem = rem%30;

days = rem ;

 
 System.out.println("Hour : "+year);
System.out.println("\nMinute:"+month);
System.out.println("\nSecond:"+days);
}
}

*/


//===================================================================

/*
Q3. Write a Java program that read 5 numbers and print the average of all values.
Test Data :
First Number : 4
Second Number : 6
Third Number: 8
Fourth Number : 10
Fifth Number : 12
*/


/*

class Data{
    public static void main(String args[]){
   int f1=4;
  int f2=6;
  int f3=8 ;
 int  f4=10;
int f5=12;
 
 float avrg = (f1+f2+f3+f4+f5)  /5;
System.out.println("\nAverage of the all num :  "+avrg);
}
}

*/


// ====================================================================
/*
Q4. Write a Java program to integral quotient and remainder of a division
Input numerator : 2500
Input denominator : 235

*/

/*

import java.util.Scanner;
class Data{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
 int numerator;
System.out.println("Enter Numerator : ");
numerator = sc.nextInt();

System.out.println("Enter Denominator  : ");
int denominator = sc.nextInt();
 
int quotient = numerator /denominator;

int remainder = numerator %denominator;

 
System.out.println("\nQuotient  :  "+quotient);
System.out.println("\nRemainder   :  "+remainder);

}
}

*/


//=========================================================
/*
Q5 -> Write a java program that converts Centigrade to Fahrenheit.
Input a degree in Fahrenheit: 212
212.0 degree Fahrenheit is equal to 100.0 in Celsius
*/

import java.util.Scanner;
class Data{
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
 float  fehrenheit ;
System.out.println("Enter   in  fehrenheit  : ");
 fehrenheit = sc.nextFloat();

float  celsius =( fehrenheit -32)*5/9;
 
System.out.println(fehrenheit +"Degree  fehrenheit  is equal to "+ celsius + "in cellsius");

}
}



