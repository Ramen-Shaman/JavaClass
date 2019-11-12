import org.uofm.tools.*;


public class InheritanceExample {

	public static void main(String[] args) 
	{	
		ProgramHelper pH = new ProgramHelper();
		
		pH.ProgramDescription();
		
		Algebra a = new Algebra();
		System.out.println("Addition: " +a.AddTwoNumbers(10, 30) + "");
		System.out.println("Subtraction: " +a.SubtractTwoNumbers(10, 30)+ "");
		System.out.println("Mutiplication:" +a.MultiplyTwoNumbers(10, 30) + "");
		System.out.println("Divition: " + a.DivideTwoNumbers(10, 30)+ "");
		
		double [] de = a.DifferentialEquation(55, 32, 9, 21);
		double [] qe = a.QuadraticEquation(1, 5, 2);
		
		System.out.println("Differintial: " +de[0]+ " and " +de[1]);
		System.out.println("Quadratic: " +qe[0]+" and " +qe[1]);
		System.out.println();
		
		pH.DeveloperInformation();

	}
}
