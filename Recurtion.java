//  A function or method called itself is known ass  Recurtion


//  java work  as  stack  like FIFO( first in first out)


 class Recurtion{
     
   public  int Sum(int n){
     if(n==0)
         return 1;
    else 
        return   n+sum(n-1);
         
}
public static void main(String args[]){
                  System.out.println(sum(5));
}}
