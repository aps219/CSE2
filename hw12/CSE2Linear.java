//////////////////////////////////////
//Aidan Spencer
//Linear Program
//Program description = Grade Search

//  import scanner
import java.util.Scanner;

//  import random number generator
import java.util.Random;

//  define class
public class CSE2Linear{
    
//  add main method
public static void main(String[] args) {
    
    Scanner myScanner = new Scanner( System.in );
    
//  prompt user to enter test grades
    System.out.println("Enter 15 ints for final grades in CSE2: ");
    int[] tests = new int[16];
    tests[0] = 0;
    for( int i = 1; i < 16; i++ ){
        if( myScanner.hasNextInt() ){
            tests[i] = myScanner.nextInt();
            if( tests[i] < 0 || tests[i] > 100 ){
                System.out.println("Error: You must enter an int between 0-100 ");
                return;
            }
            if( tests[i] < tests[i - 1] ){
                System.out.println("Error: Please input grades in increasing order ");
                return;
            }
        }
        else{
            System.out.println("Error: You did not enter an int ");
            return;
        }
    }
    
    System.out.println("Sorted: ");
    for( int c = 1; c < 16; c++ ){
        System.out.print(tests[c] + " "); 
    }
    System.out.println("");
    System.out.print("Enter a grade to search for: ");
    int search1 = myScanner.nextInt();
    int iterations1 = 0;
    boolean found = false;
    for( int i = 1; i < 16; i++ ){
        iterations1 = iterations1 + 1;
        if( search1 == tests[i] ){
            found = true;
            System.out.println( search1 + " was found in the list with " + i + " iterations" );
            break;
        }
    }
    if( !found ){
        System.out.println( search1 + " was not found in the list with " + iterations1 + " iterations");
    }
    
    System.out.println("Scrambled: ");
    Random random = new Random();
    for (int i=0; i<tests.length; i++) {
	int target = (int) (tests.length * Math.random() );
	int temp = tests[target];
	tests[target] = tests[i];
	tests[i] = temp;
    }
    for( int c = 1; c < 16; c++ ){
        System.out.print(tests[c] + " "); 
    }
    
    System.out.print("Enter a grade to search for: ");
    int search2 = myScanner.nextInt();
    int iterations2 = 0;
    boolean found2 = false;
    for( int i = 1; i < 16; i++ ){
        iterations2 = iterations2 + 1;
        if( search2 == tests[i] ){
            found2 = true;
            System.out.println( search2 + " was found in the list with " + i + " iterations" );
            break;
        }
    }
    if( !found2 ){
        System.out.println( search2 + " was not found in the list with " + iterations2 + " iterations");
    }
}
}