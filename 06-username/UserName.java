import java.util.Scanner;

public class UserName {
  public static void main(String[] args) {
    // create Scanner object
    Scanner s = new Scanner(System.in);

    // get String input from user
    System.out.print("Enter your first name: ");
    String firstName = s.nextLine();
    System.out.print("Enter your last name: ");
    String lastName = s.nextLine();
    System.out.print("Enter your favorite number: ");
    String favnumber = s.nextLine();
    System.out.print("Are you a teacher? ");
    String answer = s.nextLine();
     s.close();
    
    if (answer.equals("yes")){
     System.out.println( initialize(firstName) + (lastName) + favnumber+ "@school.nyc.gov");

    }// ends if
    else {
        System.out.println( firstName + initialize(lastName) + favnumber+"@nycstudents.net" );

    
    }//end of else
       s.close(); 
    } // end main method

  /*
   * Name: initialize
   * Purpose: send back the first character (inital) of a name
   * Input: a name (String)
   * Return: a single character (String)
   */
 public static String initialize(String n) {
    return n.substring(0, 1);
  } // end initialize method
  public static String generatePassword(int length){
      String password = "";
         for (int i = 0; i<length;i++){
            int random1 = (int)(Math.random()*(122-97+1)+97);
            int random2 = (int)(Math.random()*(90-65+1)+65);
            int random3 = (int)(Math.random()*(57-48+1)+48);
            int random4 = (int)(Math.random()*(47-35+1)+35);
            char c1 =(char) random1 ;
            char c2 =(char) random2 ;
            char c3=(char) random3 ;
            char c4 =(char) random4 ;
             password+= c1+ c2 +c3+c4;
            System.out.println("Your password is "+password);
           
           
         }
         return password;
  }
} // end class
