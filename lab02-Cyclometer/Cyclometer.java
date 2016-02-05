//////////////////////////////////////
//Aidan Spencer
//Cyclometer Java Program
//Program description = Bicycle cyclometer

//  define class
public class Cyclometer{
    
//  add main method
  public static void main(String[] args) {
      
    //  create variables for input data
    int secsTrip1=480;  //stores duration of trip 1
    int secsTrip2=3220; //stores duration of trip 2
    int rotsTrip1=1561; //stores number of rotations in Trip 1
    int rotsTrip2=9037; //stores number of rotations in Trip 2

    //  create variables for useful constants and distances
    double wheelDiameter=27.0;  //diameter of front wheel
    double pi=3.141592;    //value of pi for later calculations
    int feetPerMile=5280;   //number of feet in one mile
    int inchesPerFoot=12;   //number of inches in one foot
    int secondsPerMinute=60; //number of seconds in one minute
    double distanceTrip1, distanceTrip2, totalDistance; //stores values of various distances
    
    //  print stored values for seconds and wheel rotations
    System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
         rotsTrip1+" rotations. ");
    System.out.println("Trip 2 took "+
        (secsTrip2/secondsPerMinute)+" minutes and had "+
         rotsTrip2+" rotations. ");
    
    //  calculate distance values and store values
    distanceTrip1=rotsTrip1*pi*wheelDiameter;
    distanceTrip2=rotsTrip2*pi*wheelDiameter;
    // above gives Trip 1 distance in inches
    //(each rotation, the wheel travels its diameter in inches times pi)
    distanceTrip1/=inchesPerFoot*feetPerMile;   //converts distance to miles
    distanceTrip2/=inchesPerFoot*feetPerMile;   //converts distance to miles
    totalDistance=distanceTrip1+distanceTrip2;
    
    //  print newly calculated values
    System.out.println("Trip 1 was "+distanceTrip1+" miles");
    System.out.println("Trip 2 was "+distanceTrip2+" miles");
    System.out.println("The total distance was "+totalDistance+" miles");
    
  } //end main method
} //end class