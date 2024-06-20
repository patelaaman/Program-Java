import java.util.Scanner;

class elseIfProgram{
   public static void main(String [] args){
   
Scanner sc   = new Scanner(System.in);
System.out.println("Enter   A Number  : ");

 char a =sc.next().charAt(1);
if('b'==a)
   System.out.println(" IT is a Lower case ");
else if('B' ==a)
   System.out.println("It is A Upper case ");
else 
   System.out.println("ood number : ");



}
}
