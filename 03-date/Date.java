import java.util.Scanner;

/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
      
    System.out.print("what day of the week is it?");  
    String day = s.nextLine();
    
    System.out.print("what month is it?");  
    String month = s.nextLine();
    
    System.out.print("what year is it?");  
    String year = s.nextLine();
    
    System.out.print("what day of the month is it?");  
    String num = s.nextLine();
    s.close();
    
    System.out.println("American format: "+day+", "+month+" "+num+", "+ year+".");

    System.out.println("birtish format: "+day+" "+num+" "+month+" "+ year+".");
    
    }//end if main method
}
