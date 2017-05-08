/**
 * 
 */
package com.mycompany.ass3.chapter6;

/**
 * @author Gio
 *
 */
public class Program_Fig_6_10 {
	public static void main(String[] args) {
		 System.out.printf("Square of integer 7 is %d%n",square(7));
		 System.out.printf("Square of double 7.5 is %f%n",square(7.5));
		 } 
		
		public static int square(int intValue)
		 {
		 System.out.printf("%nCalled square with int argument: %d%n",  intValue);
		 return intValue * intValue;
		 }
		
		 // square method with double argument
		
		public static double square(double doubleValue)
		 {
		 System.out.printf("%nCalled square with double argument: %f%n",  doubleValue);
		 return doubleValue * doubleValue;
		 }
}
