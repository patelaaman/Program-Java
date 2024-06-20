//   Q1 
// =======================================================

/*
import  java.util.Scanner;

class StringBased{

     public static void main(String[] args){
      Scanner sc  =  new Scanner(System.in);

   System.out.println("Input the 1st String : ");

  String  f1 = sc.nextLine();
 
  System.out.println("Input the 2st String : ");
  String f2  = sc.nextLine();

 if(f1.equals(f2)){
     System.out.println("Strings are Equals ");
}
else 
     System.out.println("Strings are not  Equals ");
}
}

*/


//===============================================================

// Q2 

/*
import  java.util.Scanner;

class StringBased{
                          public static void main(String [] args ){

         Scanner sc = new Scanner(System.in);
   System.out.println("Enter String with digit : " );
    String  isn =  sc.nextLine();

int  al = 0;
int dig = 0;
int sp = 0;

for(int i = 0;i<isn.length();i++){
        char ch = isn.charAt(i);
      
if(Character.isLetter(ch))
     al++;
else if(Character.isDigit(ch))
     dig++;
else if(Character.isWhitespace(ch))
   sp++;
}

System.out.println("Number of Alphabet is : "+al);
System.out.println("Number of Digit  is : "+dig);
System.out.println("Number of WhiteSpace is : "+sp);

}
}

*/

//  =============================================================


//Q3

/*
import  java.util.Scanner;

class StringBased{
                          public static void main(String [] args ){

         Scanner sc = new Scanner(System.in);
   System.out.println("Enter String with digit : " );
    String  isn =  sc.nextLine();

int  vow= 0;
int con = 0;
for(int i = 0;i<isn.length();i++){
        char ch = isn.charAt(i);
      
      if(ch == 'a'  || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A'|| ch == 'E' || ch == 'I'|| ch == 'O' ||ch == 'U')
              vow++;
     else 
        con++;

    }

System.out.println("Number of Vowel is : "+vow);
System.out.println("Number of Consonent   is : "+con);
}
}

*/


//+++=====================================================



//Q4


import  java.util.Scanner;

class StringBased{
                          public static void main(String [] args ){

         Scanner sc = new Scanner(System.in);
   System.out.println("Enter String with digit : " );
    String  isn =  sc.nextLine();

int con = 0;
for(int i = 0;i<isn.length();i++){
        char ch = isn.charAt(i);
      
      if(ch <i)
            System.out.println("Enter String with digit : " +ch) ;
     else 
        con++;

    }

System.out.println("Number of Consonent   is : "+con);
}
}



