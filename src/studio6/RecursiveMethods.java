package studio6;

import edu.princeton.cs.introcs.StdDraw;

public class RecursiveMethods {

	/**
	 * Computes the geometric sum for the first n terms in the series
	 * 
	 * @param n the number of terms to include in the sum
	 * @return the sum of the first n terms of the geometric series (1/2 + 1/4 + 1/8
	 *         ...)
	 */
	public static double geometricSum(int n) {
		if (n==0) {
			return 0;}
		else {
			return Math.pow(.5, n) + geometricSum(n-1);}
			// FIXME compute the geometric sum for the first n terms recursively
			
	
	}

	/**
	 * This method uses recursion to compute the greatest common divisor
	 * for the two input values
	 * 
	 * @param p first operand
	 * @param q second operand
	 * @return greatest common divisor of p and q
	 */
	public static int gcd(int p, int q) {
		if (p % q == 0) {
			return q;
		}
		else {
			return gcd(q, p%q);
		}
		
			
		
	}

	

	/**
	 * This method uses recursion to create a reverse of the given array
	 * 
	 * @param array the array to create a reverse of, not to be mutated
	 * @return an array with the same data as the input but it reverse order
	 */
	public static int[] toReversed(int[] array) {
		int index = 0;
		if (array.length <= 1)
			return array;
		else
			return helper(index, array);
			
			
			// FIXME create a helper method that can recursively reverse the given array
			
		
	}
	public static int[] helper(int index, int[] array) {
		if (index == array.length/2)
			return array;
		else {
		int lastIndex = array.length - 1;
		int mirrorIndex = lastIndex - index;
		int temp = array[index];
		array[index] = array[mirrorIndex];
		array[mirrorIndex] = temp;
		return helper(index+1, array);
		}
	}

	/**
	 * @param xCenter                       x-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param yCenter                       y-coordinate of the center of the circle
	 *                                      at the current depth
	 * @param radius                        radius of the circle at the current
	 *                                      depth
	 * @param radiusMinimumDrawingThreshold radius above which drawing should occur
	 */
	public static void circlesUponCircles(double xCenter, double yCenter, double radius,
			double radiusMinimumDrawingThreshold) {
		
		// FIXME
	

	}}
