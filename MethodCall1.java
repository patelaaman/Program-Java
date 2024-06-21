//  taking something and returning something

import java.util.Scanner;
class   MethodCall1  {
       public static int add(int a,int b){    //  Formal Argument 
                 
              return a+b;
              
}
public static void main(String args[]){
           
            Scanner sc = new Scanner(System.in);
                   System.out.println("Enter Number first :"); 
                   int x = sc.nextInt();
                   System.out.println("Enter Number Second :"); 
                  int y = sc.nextInt();

           int result  = add(x,y);
        System.out.println("Addition Of two number is : " +result);
}
}