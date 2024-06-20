import java.util.Scanner;
class NumBased{
   public static void main(String [] args ){
        Scanner sc  = new Scanner(System.in);
   System.out.println("Enter Number");
int num = sc.nextInt();
   int sum  = 0;
int rem;
 int fac  = 0;
   while( num != 0){
           rem = num%10;
          num = num/10;
          sum = sum+rem;
 }
System.out.println(" The sum of Digits :" + sum);

for(int i = 1;i<=num;i++){
        rem  = num /i;
      if( rem  >=0){
          System.out.println(rem);
            fac = fac + rem;
     }
}
System.out.println(" Sum digits of Facter is : " + fac);

}
}