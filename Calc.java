package interestCompute;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 
		 * main interest computation method that takes in   principal and interest type 
		 * and returns the interest. use Double to store the currency and round 
		 *  to the nearest decimal where applicable. 
            Ideally create a different method for each computation type and use a switch statement 
            in the  main interest computation method to switch between them
		 * 
		 */
		/*first declare variables for the interest calculation*/
		//principal
		double principal =  12000;
		//interest rate 
        double interestRate =5;
        //amount after interest is calculated
       double interestAmount;
       // time in years
       int timeFactor=3;
      
       
       //String interest type (basically compound or simple) The process will dictate the type
       //toggle between compound and simple
       String interestType="compound";
       //interest amount rounded off
       double roundedIntAmount;
       
       
       
       
        switch (interestType) {
            case "simple":  interestAmount=(principal * interestRate *  timeFactor )/100 ;
            roundedIntAmount =  Math.round(interestAmount);
            System.out.println("Simple Interest is: " +roundedIntAmount);  
                     break;
                     // principle * (Math.pow((1 + rate / 100), time)) - principle
                     //principle * (Math.pow((1 + rate / 100), time)) - principle;
            case "compound":  interestAmount = (principal * (Math.pow((1 + interestRate/100) ,timeFactor ))) - principal ;
            roundedIntAmount =  Math.round(interestAmount);
            System.out.println("Compound Interest is: " +roundedIntAmount);
                     break;
           
	}

}
	
}
