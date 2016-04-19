//////////////////////////////////////
//Aidan Spencer
//Midterm Grade Java Program
//Program description = Midterm grade generator

//  import scanner
import java.util.Scanner;

//  import random number generator
import java.util.Random;

//  define class
public class lab10{
    
//  add main method
public static void main(String[] args) {
        
//  declare instance of scanner
    Random randomGenerator = new Random();
    int numStudents = randomGenerator.nextInt(6) + 5;
    System.out.println("Enter " + numStudents + " student names: ");
    String[] students;
    students = new String[numStudents];
   
    for( int x = 0; x < numStudents; x++){
        Scanner myScanner = new Scanner( System.in );
        students[x] = myScanner.next();
    }
    
    int[] midterm;
    midterm = new int[numStudents];
    for( int i = 0; i < numStudents; i++){
        midterm[i] = randomGenerator.nextInt(101);
    }
    System.out.println("");
    System.out.println("Here are the midterm grades of the " + numStudents + " students above: ");
    for( int c = 0; c < numStudents; c++){
        System.out.println(students[c] + ": " + midterm[c]);
    }
    
}
}