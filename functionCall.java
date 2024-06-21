import java.util.Scanner;
class   functionCall  {
       public static void printTable(int n){    //  Formal Argument 
            
             for(int i=1;i<=10;i++){
                System.out.printf("\n %d * %d  = %d ",n ,i , n*i);
   }
}
public static void main(String args[]){
               Scanner sc = new Scanner(System.in);
            System.out.println("Enter Number"); 
             int a = sc.nextInt();
       printTable(a);                         //Actual Argument
}
}