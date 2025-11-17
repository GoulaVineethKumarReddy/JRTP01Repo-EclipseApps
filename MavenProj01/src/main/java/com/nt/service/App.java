package com.nt.service;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
	public int sum(int x, int y) {
		return x+y;
	}
	public int sub(int x , int y) {
		return x-y;
	}
	public int getDifference(int x , int y) {
		return (x>y)?(x-y):(y-x);
	}
    public static void main( String[] args )
    {
        App app = new App();
        int summation = app.sum(10,20);
        System.out.println("sum is :: "+summation);
        
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number to which u need square root : ");
//        int num1 = Integer.parseInt(sc.nextLine().trim());
//        double squareRoot = Math.sqrt((double)num1); 
//        System.out.println("Square root of "+num1+" is :: "+squareRoot);
//        System.out.println("Square root of "+num1+" is :: "+squareRoot);
    }
}
