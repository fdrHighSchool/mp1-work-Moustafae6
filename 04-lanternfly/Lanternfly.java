
import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("The lanternfly is an invasive species and ");
        System.out.println("is a threat to our trees and plants.");
        
        System.out.print("How many did you squash this summer? ");
        int num = input.nextInt();
        
        if (num < 10) {
            System.out.println("You can do better than that!");
        } // end if statement
        else if (num>19){
            System.out.println("you did an amazing job");
        }
        else {
            System.out.println("Thanks for doing your part");
        } // end else statement
        
    } // end main method

} // end class