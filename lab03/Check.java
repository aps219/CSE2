//////////////////////////////////////
//Aidan Spencer
//Check Java Program
//Program description = Check calculator

//  import scanner
import java.util.Scanner;

//  define class
public class Check{
    
//  add main method
  public static void main(String[] args) {
  
  //declare instance of scanner
  Scanner myScanner = new Scanner( System.in );
  
  //ask for cost of check
  System.out.print("Enter the original cost of the check in the form xx.xx: ");
  //accept input and assign to variable
  double checkCost = myScanner.nextDouble();
 
  //ask for desired tip percentage
  System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): " );
  //accept and assign
  double tipPercent = myScanner.nextDouble();
  tipPercent /= 100;    //convert percentage to a decimal
 
  //ask for the number of people splitting the check
  System.out.print("Enter the number of people who are splitting the check: ");
  //accept and assign
  int numPeople = myScanner.nextInt();
  
  //create variables to store calculations
  double totalCost;
  double costPerPerson;
  int dollars;
 
  //calculate values for total cost, tip, and cost per person
  totalCost = checkCost * (1+tipPercent);
  costPerPerson = totalCost/numPeople;
  dollars=(int) costPerPerson;
  //calculate decimal values for change
  int dimes=(int)(costPerPerson*10) % 10;
  int pennies=(int)(costPerPerson*100) % 10;
  System.out.println("Each person owes $"+ dollars + '.' + dimes + pennies);
  }
}