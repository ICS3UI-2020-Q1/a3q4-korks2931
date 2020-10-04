import java.util.Scanner;
/**
 * This program will ask the user for a postive integer and find out if its in the range or not, printing out the written form of the integer.
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);
   // ask the user for an integer
   System.out.println("Please enter a positive integer:");
   
   //declare a varible to store number
   // prompt the user for the integer
   int number = input.nextInt();
   
   // make a switch case
   // positive integers in range or not 
   switch(number){
   case 1:
   System.out.println("one");
   break;
   case 2:
   System.out.println("two");
   break;
   case 3:
   System.out.println("three");
   break;
   case 4:
   System.out.println("four");
   break;
   case 5:
   System.out.println("five");
   break;
   case 6:
   System.out.println("six");
   break;
   case 7: 
   System.out.println("seven");
   break;
   case 9: 
   System.out.println("nine");
   break;
   case 10:
   System.out.println("ten");
   break;
   default:
   System.out.println("not in the range");
   }
    
   }
   
   
    
}
    
