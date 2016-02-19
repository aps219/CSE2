//////////////////////////////////////
//Aidan Spencer
//Card Generator Java Program
//Program description = Random card generator

//  define class
public class CardGenerator{
    
    //  add main method
    public static void main(String[] args) {
        
        //generate random number
        int random = (int) (Math.random()*51)+1;
        String suite ="";
        
        int cardInt=0; //int for defining card value regardless of suite
        
        //define suite
        if (random >= 40){
            suite = "Spades";
            cardInt = random - 39;
        }
        else if (random >= 27){
            suite = "Hearts";
            cardInt = random - 26;
        }
        else if (random >= 14){
            suite = "Clubs";
            cardInt = random - 13;
        }
        else {
            suite = "Diamonds";
            cardInt = random;
        }
        
        String card = "";
        //define card value
        switch( cardInt ){
            case 1:
            card = "Ace";
            break;
            case 11:
            card = "Jack";
            break;
            case 12:
            card = "Queen";
            break;
            case 13:
            card = "King";
            break;
            default:
            card = Integer.toString(cardInt);
        }   
        // Print card
        System.out.printf("You picked the %s of %s \n", card, suite);
    }
}
