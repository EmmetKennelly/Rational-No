public class RationalNumber {

	private int numerator;
	private int denominator;
   
	public RationalNumber(int numerator, int denominator) {
		  if(denominator == 0) {
	            System.out.print("denominator cant be equal to zero");
	            System.exit(denominator);
	        }
	        if(denominator < 0) {
	            numerator *= -1;
	            denominator *= -1;
	        }
	        this.numerator = numerator;
	        this.denominator = denominator;
	    }
	

	public RationalNumber() {
		 this.numerator = numerator;
	        this.denominator = 1;
		
	}
	
	public int getNumer() {
		return numerator;
	}
	
	
	public int getDenom(){
	        return denominator;
	       }

	

	public RationalNumber addition(RationalNumber fraction1,RationalNumber fraction2){
	        int sum1 = fraction1.denominator*fraction2.denominator;
	        int sum2 = fraction1.numerator*fraction2.denominator+fraction1.denominator*fraction2.numerator;
	        return new RationalNumber(sum2,sum1);
}
	public RationalNumber subtraction(RationalNumber fraction1,RationalNumber fraction2){
        int sum1 = fraction1.denominator*fraction2.denominator;
        int sum2 = fraction1.numerator*fraction2.denominator-fraction1.denominator*fraction2.numerator;
        return new RationalNumber(sum2,sum1);
	
	}
	
	public RationalNumber multiply(RationalNumber fraction1,RationalNumber fraction2){
        return new RationalNumber(fraction1.numerator*fraction2.numerator,fraction1.denominator*fraction2.denominator);
    }

	public RationalNumber divide(RationalNumber fraction1,RationalNumber fraction2){
        return new RationalNumber(fraction1.numerator*fraction2.denominator,fraction1.denominator*fraction2.numerator);
    }
	
	
    
	public double doubleValue() {
        return ((double) numerator)/((double) denominator);
    }

    public float floatValue() {
        return (float) this.doubleValue();
    }
    
  
    
    public void toString (RationalNumber fr){
        System.out.println(fr.numerator+"\""+"\n"+fr.denominator);
    }
}