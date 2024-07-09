//containts() method  is search the value in the string if value are here then search  and print yes or not 
/*Q1 - Write a C program to check whether a given substring is present in the given string. Test Data : Input the string : This is a test string.
Input the substring to be search : search
Expected Output :
The substring is not exists in the string.
*/
/*
import java.util.Scanner;
class task4{
           

       public static void main(String args[]){

              Scanner sc = new Scanner(System.in);
            System.out.println("Input the String : ");
            String s1 =  sc.nextLine();
            System.out.println("input the substring  to be searched: " );
             String  sub = sc.nextLine();
           if(s1.contains(sub)){
                  System.out.println("The substring exists in the string :");
         }
      else{
              System.out.println("The substring does not exist  in the string ");
           }
}
}

*/
//===================================================================

/*
2. Write a program in java to read a sentence and replace lowercase
characters by uppercase and vice-versa. 
Test Data :
Input the string : This Is A Test String.
Expected Output :
The given sentence is : This Is A Test String.
After Case changed the string is: tHIS iS a tEST sTRING.

*/
/*

import java.util.Scanner;
class task4 {
           public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
          System.out.println("Input the string : ");
          String   s1 = sc.nextLine();
      System.out.println("The Given String  is: "+s1);

    StringBuilder cs = new  StringBuilder();
    
 for(int i=0;i<s1.length();i++){
           char c = s1.charAt(i);
     if(Character.isUpperCase(c)){
                  cs.append(Character.toLowerCase(c));
    }else if(Character.isLowerCase(c)){
            
             cs.append(Character.toUpperCase(c));
    }
      else {
                 cs.append(c);
       }
}
 
System.out.println("After case change the String is : "+cs.toString());

}
}


*/

// Q3  

/*
import  java.util.Scanner;

class task4{
        public static void main(String args[]){
        
     Scanner sc = new  Scanner(System.in);

System.out.println("Input any strring");
 String s1 =  sc.nextLine();
char ch;
for(int i=0;i<s1.length();i++){
     char c = s1.charAt(i);
            if(Character.isUpperCase(c)){
                  ch=(Character.toLowerCase(c));
System.out.println("After Chage the String : " + ch);

    }
      else 
               ch = Character.toUpperCase(c);
System.out.println("After Chage the String : " + ch);

   }

}}
    */  


========================================================

import java.util.Scanner;

java task4 {
      public static void main(String args[]){
       Scanner sc = new Scanner(System.in);

System.out.println("Input the String: " );
 String inputString = sc.nextLine();

        // Convert the string to lowercase
        inputString = inputString.toLowerCase();

        // Split the string into words
        String[] words = inputString.split("\\s+");

        // Initialize the count for the word "the"
        int count = 0;

        // Iterate through the words and count occurrences of "the"
        for (String word : words) {
            if (word.equals("the")) {
                count++;
            }
        }

        // Print the frequency of the word "the"
        System.out.println("The frequency of the word 'the' is: " + count);

           }
}
       
     
