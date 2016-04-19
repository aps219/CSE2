//////////////////////////////////////
//Aidan Spencer
//Games Java Program
//Program description = Game Center

//  import scanner
import java.util.Scanner;

//  define class
public class Games{
    
// GUESS THE BOX
    public static String guessTheBox() {
        Scanner myScanner = new Scanner( System.in );
        int prize = (int) (Math.random()*3)+1;
        
    //ask user to choose a box 
    boolean acceptable = false; //create boolean to confirm proper input
    int box = 0; //variable to store length
    while( !acceptable ){
        box = myScanner.nextInt();
        if( box < 1 || box > 3 ){
            System.out.println("ERROR: You must choose between Box 1, 2, or 3");
            System.out.println("Choose Box 1, 2, or 3: ");
            }
        else{
            acceptable = true;
            }
        }
    String message = "";
    if( box == prize ){
        message = "Congratulations! You won! " + prize;
    }
    else{
        message = "Sorry, your box did not contain the prize. " + prize;
    }
    return message;
}

// SPIN THE WHEEL

    public static String spinTheWheel() {

// MAIN METHOD
    public static void main(String [] args) {
        Scanner myScanner = new Scanner( System.in );
        System.out.println("Welcome to Aidan's game center:");
        System.out.println("Choose your game: guessTheBox, spinTheWheel or scrambler");
            String guess = "guessTheBox", spin = "spinTheWheel", scramble = "scrambler";
            String input = myScanner.next();//game selection
            if (input.equals(guess)){//checks if strings are equal to each other
                System.out.println("Select box 1, 2 or 3");
                String boxMessage = "";
                boxMessage = guessTheBox();//calls method, user imput is parameters
                System.out.println(boxMessage);
            }
            //if (choice.equals(spin)){//checks if strings are equal to each other
             //   System.out.println("Select red or black");
             //   System.out.println("Select an integer between 1 - 5");
             //   spinTheWheel();//calls method, user imput is parameters
            //}
            
            //if (choice.equals(scramble)){//checks if strings are equal to each other
             //   System.out.println("Enter a word");
             //   scrambler();//calls method, user imput is parameters
            //}
            else{
                System.out.println("Sorry, please select from the three games listed");
            }
}
}