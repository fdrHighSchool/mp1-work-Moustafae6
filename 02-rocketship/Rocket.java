
/**
 * Write a description of class Rocket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rocket
{
    public static void main(String[] args) {
        triangle();
        segment();
        lines();
        segment();
        System.out.println("|United|\n|States|");
        segment();
        lines();
        segment();
        triangle();
    }//end of main method
    
    public static void triangle() {
        System.out.println("   /\\   ");
        System.out.println("  /  \\   ");
        System.out.println(" /    \\  ");
    }//end of triangle method
    
    public static void segment() {
        System.out.println("+------+");
    }//end of segment method
    
    public static void lines() {
        System.out.println("|      |");
        System.out.println("|      |");
    }//end of line method
}//end of main class