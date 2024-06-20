//   Q1 Write a program to print all numbers from 1 to 100 i.e. 1 2 3 4 5 6 7 . . . 98 99 100

/*
class  LoopBased{
    public static void main(String []  args ){

    for (int i = 1;i<=100;i++){
         System.out.print(i);
  }
}
}
*/

//================================================================================

//  Q2  Write a program to print alternate numbers starting from 1 to 99 i.e. 1 3 5 7 9 11 13 . . . 95 97 99

/*
class  LoopBased{
    public static void main(String []  args ){

    for (int i = 1;i<=100;i++){
       if(i%2 != 0) 
         System.out.print(i+ "  " );
  }
}
}

*/
//=================================================================================

// Q3  Write a program to print alternate numbers starting from 0 to 100 i.e. 0 2 4 6 8 10 12 . . . 96 98 100

/*

class  LoopBased{
    public static void main(String []  args ){

    for (int i = 1;i<=100;i++){
       if(i%2 == 0) 
         System.out.print(i+ "  " );
  }
}
}

*/

//===========================================================================

//  Q4  Write a program to print all numbers backwards from 100 to 0 i.e. 100 99 98 97 96 . . . 4 3 2 1 0
 
/*
class  LoopBased{
    public static void main(String []  args ){

    for (int i = 100;i>=0;i--){
         System.out.print(i +"  ");
  }
}
}

*/

//==================================================================================
// Q5  Write a program to print numbers backwards from 100 to 1 by skipping 2 numbers i.e. 100 97 94 91 //88 85 82 79. . . 22  19 16 13 10 7 4 1

/*
class  LoopBased{
    public static void main(String []  args ){
    int cr = 100;
    for (int i = 100;cr>=0;i--){
         System.out.print(cr +"  ");
      cr  -= 3;
  }
}
}

*/

//========================================================================
// Home Work  

//  Q1 Write a java program to print number from -5 to 5

/*
class  LoopBased{
    public static void main(String []  args ){

    for (int i = -5;i<=5;i++){
         System.out.print(i+"  ");
  }
}
}
*/

//=======================================================================

//Q2  Write a java program to print number from 100 to 91

/*
class  LoopBased{
    public static void main(String []  args ){

    for (int i = 100;i>=91;i--){
         System.out.print(i+"  ");
  }
}
}
*/


//=======================================================================

//Q3  Write a program to print alternate number from 80 To 70.

/*

class  LoopBased{
    public static void main(String []  args ){

    for (int i = 80;i>=70;i--){
           if(i%2!= 0){
             //  continue;
           System.out.println("Skip");
}
         System.out.print(i+"  ");
  }
}
}
*/


//========================================================================

// Q4 Write a program to print Sqaure of Even number from 10 To 20

/*
class  LoopBased{
    public static void main(String []  args ){
     
 int sqr;
    for (int i = 10;i<=20;i++){
       if( i %2 == 0){
             sqr = i *i;
         System.out.println(i+"  Square is  : "+ sqr);
         }              
  }
}
}

*/

//==============================================================

// Q5  Write a program to print cube of odd number from 1 to 10.

/*
class  LoopBased{
    public static void main(String []  args ){
     int sqr;
    for (int i = 1;i<=10;i++){
       if( i %2 != 0){
             sqr = i *i*i;
         System.out.println(i+"  Square is  : "+ sqr);
         }              
  }
}
}
*/

//===========================================================
// Q6

/*
import java.util.Scanner;
class  LoopBased{
    public static void main(String []  args ){
 Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
     int sum = 0;
   
    for (int i = 1;i<=num/2;i++){
       if( num %i == 0){
                   sum +=i; 
            if(i== num/2)
  System.out.print(i +"  " ); 
         else 
 System.out.print(i +"  +  " ); 
           }        
   
  }
 System.out.println("  =  " + sum );      
  
if( sum >= num )
       System.out.println(" As "+sum + " > " +num + " so " +num +"  is an Abundant  Number "); 
else 
      System.out.println(" As "+sum + " > " +num + " so " +num +"  is not  an Abundant  Number "); 


}
}

*/


//===========================================================================

//Q7  

/*
import java.util.Scanner;
class  LoopBased{
    public static void main(String []  args ){
 Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
    int r ,b;
  int c = num;
      int sum = 0;
while( num !=0){
      r= num %10;
      num =num/10;
     sum = sum +r;
}
   System.out.println(sum);
if( (c % sum) == 0)
    System.out.println("it is a Niven : " );
else 
      System.out.println("it is not  a Niven : " );

}
}

*/

//===========================================================================

//Q8

/*

import java.util.Scanner;
class  LoopBased{
    public static void main(String []  args ){
 Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
int r;
      int mul = 1;
      int sum = 0;
while( num !=0){
      r= num %10;
      num =num/10;
     sum = sum +r;
     mul = mul * r;
     
}
   System.out.println(" Sum of Digits : " +sum);
 System.out.println(" Product of Digit : "+mul);


}
}

*/

//===================================================================


// Q9

import java.util.Scanner;
class  LoopBased{
    public static void main(String []  args ){
 Scanner sc = new Scanner(System.in);
     int num = sc.nextInt();
int r;
 int c = num;
      int mul = 1;
      int sum = 0;
while( num !=0){
      r= num %10;
      num =num/10;
     sum = sum +r;
     mul = mul * r;
     
}
  if( (sum+mul) == c )
      System.out.println( " Special  two - digit  number ");
else 
     System.out.println( " Not  Special  two - digit  number ");

}
}





