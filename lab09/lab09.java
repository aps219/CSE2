//////////////////////////////////////
//Aidan Spencer
//Random Sentence Java Program
//Program description = Sentence generator

//  import scanner
import java.util.Scanner;

//  import random number generator
import java.util.Random;

//  define class
public class lab09{
    
    public static String adjective(){
        Random randomGenerator = new Random();
        int adjInt = randomGenerator.nextInt(10);
        
        String adj = "";
        switch( adjInt ){
            case 0:
            adj = "blue";
            break;
            case 1:
            adj = "brown";
            break;
            case 2:
            adj = "funny";
            break;
            case 3:
            adj = "happy";
            break;
            case 4:
            adj = "lazy";
            break;
            case 5:
            adj = "sad";
            break;
            case 6:
            adj = "fat";
            break;
            case 7:
            adj = "little";
            break;
            case 8:
            adj = "purple";
            break;
            case 9:
            adj = "yellow";
            break;
        }
        return adj;      
    }
    
    public static String subject(){
        Random randomGenerator = new Random();
        int subjInt = randomGenerator.nextInt(10);
        
        String subj = "";
        switch( subjInt ){
            case 0:
            subj = "dog";
            break;
            case 1:
            subj = "cat";
            break;
            case 2:
            subj = "moose";
            break;
            case 3:
            subj = "goose";
            break;
            case 4:
            subj = "mouse";
            break;
            case 5:
            subj = "pig";
            break;
            case 6:
            subj = "fox";
            break;
            case 7:
            subj = "chicken";
            break;
            case 8:
            subj = "bird";
            break;
            case 9:
            subj = "giraffe";
            break;
        }
        return subj;
    }
    
    public static String object(){
        Random randomGenerator = new Random();
        int objInt = randomGenerator.nextInt(10);
        
        String obj = "";
        switch( objInt ){
            case 0:
            obj = "goat";
            break;
            case 1:
            obj = "frog";
            break;
            case 2:
            obj = "lizard";
            break;
            case 3:
            obj = "monkey";
            break;
            case 4:
            obj = "peacock";
            break;
            case 5:
            obj = "pigeon";
            break;
            case 6:
            obj = "donkey";
            break;
            case 7:
            obj = "horse";
            break;
            case 8:
            obj = "snake";
            break;
            case 9:
            obj = "fish";
            break;
        }
        return obj;
    }
    
    public static String pastVerb(){
        Random randomGenerator = new Random();
        int verbInt = randomGenerator.nextInt(10);
        
        String verb = "";
        switch( verbInt ){
            case 0:
            verb = "passed";
            break;
            case 1:
            verb = "kissed";
            break;
            case 2:
            verb = "ate";
            break;
            case 3:
            verb = "found";
            break;
            case 4:
            verb = "stopped";
            break;
            case 5:
            verb = "jumped";
            break;
            case 6:
            verb = "loved";
            break;
            case 7:
            verb = "hurt";
            break;
            case 8:
            verb = "smelled";
            break;
            case 9:
            verb = "licked";
            break;
        }
        return verb;
    }
    
    public static void main(String [] args) {
    
    Scanner myScanner = new Scanner( System.in );
    
    boolean repeat = true;
    
    while( repeat ){
        String adj1 = adjective();
        String adj2 = adjective();
        String adj3 = adjective();
        String subj1 = subject();
        String obj1 = object();
        String verb1 = pastVerb();
        
        System.out.println("The " + adj1 + " " + adj2 + " " + subj1 + " " + verb1 + " the " + adj3 + " " + obj1 + ".");
        System.out.println("Would you like another sentence? (y/n): ");
        String response = "";
        if( response == "n" ){
        repeat = false;
        }
    }
    }
}