//////////////////////////////////////
//Aidan Spencer
//hw02-Arithmetic Java Program
//Program description = Arithmetic calculations

//  define class
public class hw02{
    
//  add main method
  public static void main(String[] args) {
      
    //  define variables for goods and costs
    int numPants=3;             //number of pairs of pants
    double pantsPrice=34.98;    //cost per pair of pants
    int numShirts=2;            //number of sweatshirts
    double shirtPrice=24.99;    //cost per sweatshirt
    int numBelts=1;             //number of belts
    double beltPrice=33.99;     //cost per belt
    double paSalesTax=0.06;     //PA sales tax
    
    //  create and calculate variables for total costs and taxes
    //also multiply calculations by 100 to eliminate fractional penneis later
    double totalCostOfPants=numPants*pantsPrice;
    double totalCostOfShirts=numShirts*shirtPrice;
    double totalCostOfBelts=numBelts*beltPrice;
    double taxOnPants=totalCostOfPants*paSalesTax;
    double taxOnShirts=totalCostOfShirts*paSalesTax;
    double taxOnBelts=totalCostOfBelts*paSalesTax;
    double totalCostBeforeTax=totalCostOfPants+totalCostOfShirts+totalCostOfBelts;
    double totalSalesTax=taxOnPants+taxOnShirts+taxOnBelts;
    double totalCost=totalCostBeforeTax+totalSalesTax;
    
    //  eliminate any fractional pennies
    //(do this by multiplying variables by 100, then converting to int
    //and then dividing by 100)
    int totalCostOfPantsInt=(int) (totalCostOfPants*100);
    totalCostOfPants=totalCostOfPantsInt/100.0;
    int totalCostOfShirtsInt=(int) (totalCostOfShirts*100);
    totalCostOfShirts=totalCostOfShirtsInt/100.0;
    int totalCostOfBeltsInt=(int) (totalCostOfBelts*100);
    totalCostOfBelts=totalCostOfBeltsInt/100.0;
    int taxOnPantsInt=(int) (taxOnPants*100);
    taxOnPants=taxOnPantsInt/100.0;
    int taxOnShirtsInt=(int) (taxOnShirts*100);
    taxOnShirts=taxOnShirtsInt/100.0;
    int taxOnBeltsInt=(int) (taxOnBelts*100);
    taxOnBelts=taxOnBeltsInt/100.0;
    int totalCostBeforeTaxInt=(int) (totalCostBeforeTax*100);
    totalCostBeforeTax=totalCostBeforeTaxInt/100.0;
    int totalSalesTaxInt=(int) (totalSalesTax*100);
    totalSalesTax=totalSalesTaxInt/100.0;
    int totalCostInt=(int) (totalCost*100);
    totalCost=totalCostInt/100.0;
    
    //print calculations
    System.out.println("The total cost of pants was "+totalCostOfPants+" dollars");
    System.out.println("The total cost of shirts was "+totalCostOfShirts+" dollars");
    System.out.println("The total cost of belts was "+totalCostOfBelts+" dollars");
    System.out.println("The sales tax on pants was "+taxOnPants+" dollars");
    System.out.println("The sales tax on shirts was "+taxOnShirts+" dollars");
    System.out.println("The sales tax on belts was "+taxOnBelts+" dollars");
    System.out.println("The total cost before tax was "+totalCostBeforeTax+" dollars");
    System.out.println("The total sales tax charged was "+totalSalesTax+" dollars");
    System.out.println("The total cost after tax was "+totalCost+" dollars");
    
  } //end main method
} //end class