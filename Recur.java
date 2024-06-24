import java.util.Scanner;
class Recur{
             public static int fact(int n){
               if(n==1){
                  return 1;}
int  a= 0 , b=1, c =0;

   for(int i=2;i<n;i++){
         c = a+b ;
        a=b;
        b=c;
    return c;
 // System.out.println(c+"  ");
}
return b;
            }
      
    
             public static void main(String args[]){
                 fact(8);
             }
}