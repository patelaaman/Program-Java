import  java.util.Scanner;
import java.text.DecimalFormat;  
class FuctionCalculation{
    String  name;
    String enroll;
    double per;
   int roll;
   int Total;
    char section;
      int E,M,C,P,H;

public void getdata(){
      Scanner sc = new Scanner(System.in);
 System.out.println("Enter Name number : ");
     name = sc.nextLine();

 System.out.println("Enter enroll number : ");
     enroll = sc.nextLine();

     System.out.println("Enter Roll number : ");
     roll = sc.nextInt();

 System.out.println("Enter Math number : ");
     M = sc.nextInt();

 System.out.println("Enter English number : ");
     E = sc.nextInt();

 System.out.println("Enter Chemistry number : ");
     C = sc.nextInt();

 System.out.println("Enter Physics number : ");
    P  = sc.nextInt();

 System.out.println("Enter Hindi number : ");
     H = sc.nextInt();

}

public void showdata(){
         System.out.println("Your Name : "+name);
        System.out.println("Your Name : "+enroll);
        System.out.println("Your  RollNumber is : "+roll);
      System.out.println("Your English Number is : "+E);
       System.out.println("Your Physics Number is : "+P);
     System.out.println("Your Chemistry Number is : "+C);
     System.out.println("Your Hindi Number is : "+H);
      System.out.println("Your English Number is : "+M);
}
public void getTotalmarks(){
        Total = P+C +M+E+H;
     System.out.println("Total Marks : "+Total);
       }
 public void getPercentage(){
           per = Total/5.0;
   System.out.println("Percentage is : "+(per));
   }

   
      public static void main(String args[]){
           FuctionCalculation f1 = new FuctionCalculation();
         f1.getdata();
          f1.showdata();
         f1.getTotalmarks();
         f1.getPercentage();

}
}