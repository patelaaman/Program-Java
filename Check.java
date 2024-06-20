//  Q1 =Write a program to accept a number N and print
//whether it is positive, negative or zero

/*
import java.util.Scanner;
class  Check {
  public static  void main(String [] args){
       Scanner sc = new Scanner(System.in);
   int a  = sc.nextInt();

if(a==0)
    System.out.println("The number is Zero : "+a);
else if(a>0)
    System.out.println("The Number is positive : "+a);
else 
   System.out.println("The Number is Negative : " +a);
}
}
*/

//==================================================


// Q2 =Write a program to accept two numbers and print
//the greater value of the two

/*
import java.util.Scanner;
class Check {
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
int  a = sc.nextInt();
int  b = sc.nextInt();

if(a>=b)
   System.out.println(" A is a Greater Number : "+a);
else 
  System.out.println("B is a Greater Number : "+b);

}
}
*/


//======================================================

// Q3  Write a program to accept a number N and print
// whether the number is EVEN or ODD

/*
import java.util.Scanner;
class Check {
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
int  a = sc.nextInt();

if(a%2==0)
   System.out.println(" The  Number is Even : "+a);
else 
  System.out.println(" The Number is  Odd :   "+a);

}
}
*/


// Q4 - Write a program to accept two numbers and print
//    whether their sum is EVEN or ODD

/*
import java.util.Scanner;
class Check {
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
int  a = sc.nextInt();
int b  = sc.nextInt();
if((a+b)%2==0)
   System.out.println(" The  Number is Even  ");
else if((a+b)%2 != 0)
  System.out.println(" The Number is  Odd  ");
else 
  System.out.println("Not a Number ");

}
}

*/


//  Home Work Task  

// Q1 - Write a Java program that takes three numbers from the user and prints the greatest number.
 /* Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87 
*/

/*
import java.util.Scanner;
class Check {
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
int  a = sc.nextInt();
int  b = sc.nextInt();
int  c = sc.nextInt();


if((a>b) &&(a>c) )
   System.out.println(" A is a Greater Number : "+a);
else if( (b>a) &&(b>c))
  System.out.println("B is a Greater Number : "+b);
else 
   System.out.println("C is a Greater Number : "+c);
}
}

*/


//===========================================================================

/*
// Q2. Write a Java program that reads a floating-point number and prints
&quot;zero&quot; if the number is zero. Otherwise, print &quot;positive&quot; or &quot;negative&quot;. Add
&quot;small&quot; if the absolute value of the number is less than 1, or &quot;large&quot; if it
exceeds 1,000,000.
Test Data
Input a number: 25
Expected Output :
Input value: 25
Positive number
*/

/*

import java.util.Scanner;
class  Check {
  public static  void main(String [] args){
       Scanner sc = new Scanner(System.in);
   int a  = sc.nextInt();

if(a==0)
    System.out.println("The number is Zero : "+a);
else {
if (a > 0) {
                System.out.print("Positive");
            } else {
                System.out.print("Negative ");
            }
            
            if (Math.abs(a) < 1) {
                System.out.println(" small");
            } else if (Math.abs(a) > 1_000_000) {
                System.out.println(" large");
            } 
}
}
}

*/


//====================================================

// Q3

/*
import java.util.Scanner;
class  Check {
  public static  void main(String [] args){
       Scanner sc = new Scanner(System.in);
   float a  = sc.nextFloat();
    float b  = sc.nextFloat();
  
  if( a == b)
      System.out.println("They are same ");
  else 
     System.out.println("They are Different");
}
}

*/

//==================================================

//Q4


/*
import java.util.Scanner;
class  Check {
  public static  void main(String [] args){
       Scanner sc = new Scanner(System.in);
   int  month  = sc.nextInt();
   int  year  = sc.nextInt();
  
switch(month){
   
case 1:
          System.out.println("January " + year +"has  31 days  ");
       break;
case 2:
       if(year %4 ==0)
              System.out.println("Febuary "+year +"has 29 days");
     else 
             System.out.println("Febuary "+year +"has 28 days");
     break;

case 3 : 
       System.out.println("March " + year +"has  31 days  ");
  break;

case 4 :
     System.out.println("January " + year +"has  30 days  ");
break;

case 5 :
     System.out.println("January " + year +"has  31 days  ");
break;

case 6 : 
   System.out.println("January " + year +"has  30 days  ");
break;

case 7 :
      System.out.println("January " + year +"has  31 days  ");
break;

case 8 :
     System.out.println("January " + year +"has  31 days  ");
break;

case 9 :
     System.out.println("January " + year +"has  30 days  ");
break;

case 10 : 
     System.out.println("January " + year +"has  31 days  ");
break;

case 11 :
    System.out.println("January " + year +"has  30 days  ");
break;

case 12:
    System.out.println("January " + year +"has  31 days  ");
break;

default :
     System.out.println("this has  days  ");
break;
       
}
  }
}


*/



//===========================================================

//Q5

/*
import java.util.Scanner;
class  Check {
  public static  void main(String [] args){
       Scanner sc = new Scanner(System.in);
   char ch = sc.next().charAt(0);
if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' ||ch=='U' )
       System.out.println("Input  Letter is  Vowel ");
else 
    System.out.println("Input Letter is Consonant ");

  }
}

*/


//================================================================

// Q6


/*
import java.util.Scanner;
class  Check {
  public static  void main(String [] args){
       Scanner sc = new Scanner(System.in);
   int year  = sc.nextInt();
if(year %4 == 0 )
       System.out.println(year +" is a leap Year ");
else 
    System.out.println(year +" is a leap Year  ");

  }
}

*/

//===================================================================

//Q7

/*
import java.util.Scanner;
class  Check {
  public static  void main(String [] args){
       Scanner sc = new Scanner(System.in);
   int a  = sc.nextInt();
  int b  = sc.nextInt();

  int c  = sc.nextInt();

  int d = sc.nextInt();
  int e  = sc.nextInt();

    int sum = a+ b+c +d+e;
System.out.println(" The Sum of 5 no is : " +sum);
   float  avg = sum /5;
  System.out.println(" The Average of 5 no is : " +avg);
   
  }
}

*/

//=========================================================

//Q8


/*
import java.util.Scanner;
class  Check {
  public static  void main(String [] args){
       Scanner sc = new Scanner(System.in);
   int a  = sc.nextInt();
  int sum = 0 ;
 int cr = 1;
for( int i = 1 ;i<=a;i++){

   System.out.println(cr);
    sum = sum + cr;
   cr  +=  2;

           }  
System.out.println("The  Sum of Odd  Natural Number  upto 5  term is : "+sum);
  } 
}
*/


//===============================================================

//Q9


import java.util.Scanner;
class  Check {
  public static  void main(String [] args){
       Scanner sc = new Scanner(System.in);
   int a  = sc.nextInt();
  int b  = sc.nextInt();
  int c  = sc.nextInt();

 if((a<b) && ( b<c))
   System.out.println("Increment order");
else 
    System.out.println("Decrement Order ");
  } 
}













