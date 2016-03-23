//////////////////////////////////////
//Aidan Spencer
//Triangles Java Program
//Program description = Triangle generator

//  import scanner
import java.util.Scanner;

//  define class
public class Triangles{
    
//  add main method
    public static void main(String[] args) {
        
//  declare instance of scanner
    Scanner myScanner = new Scanner( System.in );
    
    //ask for user input 
    System.out.println("Enter a number between 5 and 30: ");
    int num = 0;
    num = myScanner.nextInt();

//For loop method    
    System.out.println("FOR LOOP: ");
    //create for loop to determine the number of lines
    for( int x = 1; x <= num; x++){
        //create for loop to determine the number of times to print a digit
        for( int y = 1; y < (x + 1); y++ ){
            System.out.print(x);
        }
        System.out.println("");
    }
    //repeat the process in the opposite direction for second half of triangle
    for( int x = (num - 1); x >= 1; x--){
        for( int y = 1; y <= x; y++){
            System.out.print(x);
        }
        System.out.println("");
    }
    
// While loop method
    System.out.println("WHILE LOOP: ");
    int x = 1; // initialize integer to determine the number of lines
    while( x <= num ){
        int y = 1; // initialize integer to determine how many digits print
        while( y < (x + 1) ){
            //print x x times 
            System.out.print(x);
            //increase counter
            y++;
        }
        System.out.println(""); //move to next line and repeat loop
        x++; //increase counter
    }
    //repeat process for second half of triangle
    x = (num - 1);
    while( x >= 1 ){
        int y = 1;
        while( y <= x ){
            System.out.print(x);
            y++;
        }
        System.out.println("");
        x--;
    }
    
// Do while loop method
    System.out.println("DO-WHILE LOOP: ");
    x = 1;//initialize counter for number of lines
    do {
        int y = 1;// initialize counter for number of digits
        do {
            //print x x times
            System.out.print(x);
            //increase counter for digits
            y++;
        }while( y < (x + 1) );
        //move to next line, increase line counter, repeat
        System.out.println("");
        x++;
    }while( x <= num );
    x = (num - 1);//change value of x
    //repeat process for second half of triangle
    do{
        int y = 1;
        do{
            System.out.print(x);
            y++;
        }while( y <= x );
        System.out.println("");
        x--;
    }while( x >= 1);
    
}
}