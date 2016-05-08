//////////////////////////////////////
//Aidan Spencer
//Bowtie Java Program
//Program description = Bowtie generator

//  define class
public class Bowtie{
    
    //  add main method
    public static void main(String[] args) {
        
        int nStars = 9;
        int count = 0;
        int count2 = 0;
        int count3 = 0;
        int x = 0;
        
        while ( count < nStars ){
            while ( x < count3 ){
                System.out.print(" ");
                count3 ++;
            }
            while ( (nStars - (2 * x)) > count2 ){
                System.out.print("*");
                count2 ++;
            }
            System.out.println("");
            x ++;
            count ++;
            count2 = 0;
            count3 = 0;
        }
        
  }
}
