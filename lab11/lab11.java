//////////////////////////////////////
//Aidan Spencer
//Search Java Program
//Program description = Random Array Search

//  import scanner
import java.util.Scanner;

//  import random number generator
import java.util.Random;

//  define class
public class lab11{
    
//  add main method
public static void main(String[] args) {
    
//  declare instance of scanner
    Random randomGenerator = new Random();
    int[] array1 = new int[50];
    int[] array2 = new int[50];
    for( int x = 0; x < 50; x++ ){
        array1[x] = randomGenerator.nextInt(101);
    }
    int max1 = 0;
    int min1 = 100;
    for( int y = 0; y < 50; y++ ){
        if( array1[y] > max1){
            max1 = array1[y];
        }
        if( array1[y] < min1){
            min1 = array1[y];
        }
    }
    System.out.println("The maximum of array1 is: " + max1);
    System.out.println("The minimum of array1 is: " + min1);
    
    array2[0] = randomGenerator.nextInt(101);
    for( int i = 1; i < 50; i++ ){
        array2[i] = array2[i-1] + randomGenerator.nextInt(101);
    }
    int max2 = 0;
    int min2 = 50000000;
    for( int z = 0; z < 50; z++ ){
        if( array2[z] > max2){
            max2 = array2[z];
        }
        if( array2[z] < min2){
            min2 = array2[z];
        }
    }
    System.out.println("The maximum of array2 is: " + max2);
    System.out.println("The minimum of array2 is: " + min2);
    
    System.out.print("Enter an int: ");
    Scanner myScanner = new Scanner( System.in );
    int target = 0;
    if( myScanner.hasNextInt() ){
            target = myScanner.nextInt();
        if( target >= 0 ){
                target = target;
        }
        else{
            System.out.println("You did not enter an int >= 0");
            return;
        }
    }
    else{
        System.out.println("You did not enter an int");
        return;
    }
    
    int low = 0;
    int high = array2.length - 1;
    while(low <= high){
        int mid = (low + high) / 2;
        if (target == array2[mid]){
            System.out.println(target + " was found in the list.");
            return;
        }
        else if (target < array2[mid]){
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
    }
    System.out.println(target + " was not found in the list.");
    System.out.println("The number above the key was " + array2[low]);
    System.out.println("The number below the key was " + array2[high]);
}
}