public class PrimeNumber1{
             public static void main(String args[]){
                  for(int i=1;i<=100;i++){
                      if(isPrime(i)){
                       System.out.println(i+"is a prime Number");
           }
}}

public static Boolean isPrime(int num){
       if(num<1){
       return false ;
    }
 for(int i=2;i<=Math.sqrt(num);i++){
     if(num%i==0){
      return false;
    }}
    return true;
 }
}
