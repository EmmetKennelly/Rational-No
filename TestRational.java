
public class TestRational {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RationalNumber fraction1 = new RationalNumber(8, 10);
		RationalNumber fraction2 = new RationalNumber(4, 2);

        System.out.println("Add:\n");
        fraction1.toString(fraction1.addition(fraction1,fraction2));
        System.out.println("Minus:\n");
        fraction1.toString(fraction1.subtraction(fraction1,fraction2));
        System.out.println("Multiply:\n");
        fraction1.toString(fraction1.multiply(fraction1,fraction2));
        System.out.println("Divide:\n");
        fraction1.toString(fraction1.divide(fraction1,fraction2));


}
}
