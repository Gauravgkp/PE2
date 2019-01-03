import java.util.Scanner;

public class Member {
   public static String name;
   public static int age;
   public static int salary;

  public static String inputType(String input){
      String inputDataType ="";
      if(input.matches("-?\\d+(\\.\\d+)?")){
          inputDataType = "Digit" ;
      }else if (input.matches("[a-zA-Z]+")){
          inputDataType = "String" ;
      }else{
          inputDataType = "Invalid" ;
      }
      return inputDataType;
  }

   public static Boolean setName(String input){
      String isProperName = inputType(input) ;
      String nameInput = "String";
      if(nameInput.equals(isProperName)){
          name = input;
          return true;
      }
      return false;
   }

   public static Boolean setAge(String input){
       int ageInt = 0 ;
       String isProperAge = inputType(input) ;
       String ageInput = "Digit";
       if(ageInput.equals(isProperAge)){
           ageInt =  Integer.parseInt(input);
           if(ageInt <= 125){
               age = ageInt;
               return true;
           }
       }
       return false;
   }

   public static Boolean setSalary(String input){
       String isProperSalary = inputType(input) ;
       String salaryInput = "Digit";
       if(salaryInput.equals(isProperSalary)){
               salary = Integer.parseInt(input);
           return true;
           }
       return false;
   }

   public static String getName(){
      return name;
   }

   public static int getAge(){
       return age;
   }

   public static int getSalary(){
       return salary;
   }

   public static void main(String[] args) {

       System.out.println("Kindly enter your input");
       Scanner scan = new Scanner(System.in);

       / *Read the user input in a string*/
       String input = scan.nextLine();

       System.out.println(inputType(input));
   }
}import java.util.Scanner;

public class Member {
   public static String name;
   public static int age;
   public static int salary;

  public static String inputType(String input){
      String inputDataType ="";
      if(input.matches("-?\\d+(\\.\\d+)?")){
          inputDataType = "Digit" ;
      }else if (input.matches("[a-zA-Z]+")){
          inputDataType = "String" ;
      }else{
          inputDataType = "Invalid" ;
      }
      return inputDataType;
  }

   public static Boolean setName(String input){
      String isProperName = inputType(input) ;
      String nameInput = "String";
      if(nameInput.equals(isProperName)){
          name = input;
          return true;
      }
      return false;
   }

   public static Boolean setAge(String input){
       int ageInt = 0 ;
       String isProperAge = inputType(input) ;
       String ageInput = "Digit";
       if(ageInput.equals(isProperAge)){
           ageInt =  Integer.parseInt(input);
           if(ageInt <= 125){
               age = ageInt;
               return true;
           }
       }
       return false;
   }

   public static Boolean setSalary(String input){
       String isProperSalary = inputType(input) ;
       String salaryInput = "Digit";
       if(salaryInput.equals(isProperSalary)){
               salary = Integer.parseInt(input);
           return true;
           }
       return false;
   }

   public static String getName(){
      return name;
   }

   public static int getAge(){
       return age;
   }

   public static int getSalary(){
       return salary;
   }

   public static void main(String[] args) {

       System.out.println("Kindly enter your input");
       Scanner scan = new Scanner(System.in);

       / *Read the user input in a string*/
       String input = scan.nextLine();

       System.out.println(inputType(input));
   }
}
