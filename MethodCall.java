
import java.util.Scanner;
class   MethodCall  {
       public static int add(){    //  Formal Argument 
                   Scanner sc = new Scanner(System.in);
                   System.out.println("Enter Number first :"); 
                   int a = sc.nextInt();
                   System.out.println("Enter Number Second :"); 
                  int b = sc.nextInt();
                  int c = a+b;

         return c;
              
}
public static void main(String args[]){
           
          
           int result  = add();
        System.out.println("Addition Of two number is : " +result);
}
}