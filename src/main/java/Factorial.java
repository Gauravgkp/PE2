import java.util.Scanner;

public class Factorial {

   public static String intFactorial(int a) {
       String factorial = "true";
       int fact = 1;
       for (int i = 1; i <= a; i++) {
           fact = fact * i;
           if (fact >= 479001700) {
               System.out.println("The Factorial of " + a + " is out of range");
               factorial = "false";
               return factorial;
           }
       }

       factorial = "The Factorial of " + a + " is: " + fact;
       return factorial;
   }

   public static String longFactorial(int j) {

       String factorial = "true";
       long fact = 1l;
       for (int i = 1; i <= j; i++) {
           fact = fact * Long.valueOf(i);
           if (fact >= Long.MAX_VALUE) {
               System.out.println("The Factorial of " + i + " is out of range");
               factorial = "false";
               return factorial;
           }
       }
       factorial = "The Factorial of " + j + " is: " + fact ;
       return factorial;
   }



   public static void main(String[] args) {

       int a;
       Scanner sc = new Scanner(System.in);
       a = sc.nextInt();
       String intOrLong = "true";
       for (int i = 1; i <= a; i++) {
           if (intOrLong.equals("false")) {
               for (int j = 1; j <= a; j++) {
                   System.out.println(longFactorial(j));
               }
           }else{
               intOrLong = intFactorial(i);
               System.out.println(intOrLong);
           }

       }
   }
}



