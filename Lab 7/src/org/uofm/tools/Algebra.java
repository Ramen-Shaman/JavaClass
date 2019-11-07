package org.uofm.tools;

public class Algebra
{

	public double[] QuadraticEquation(double a, double b, double c)
	{
		//define an array to store the results of operations...
		double qResult[] = null;
		//define the Quadratic Equation formula...
		double result = b * b - 4.0 * a * c;
		
		//based on the resulyt of the operation, handle response...
		if (result > 0.0)
		{
			qResult = new double[2];
			
			qResult[0] = (-b + Math.pow(result, 0.5) / (2.0 * a));
			qResult[1] = (-b - Math.pow(result, 0.5) / (2.0 * a));
			return(qResult);
		}
		else if (result == 0.0)
		{
			qResult = new double[1];
			
			qResult[0] = -b / (2.0 * a);
			return (qResult);
		}
		else
		{
			qResult = new double[1];
			qResult[0] = -9999999.99;
			return(qResult);
		}
	}
	
	public double[] DifferentialEquation(double a, double b, double c, double d)
	{
		// define an array to store the results of operations...
		double[] results = new double[2];
		// define the equation...
		results[0] = (d - c/a) / (b - 1/a);
		results[1] = (c - results[0]) / a;
		//return the result...
		return(results);
	}
}
