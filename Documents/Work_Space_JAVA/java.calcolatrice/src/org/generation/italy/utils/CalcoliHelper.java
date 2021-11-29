package org.generation.italy.utils;

import java.math.BigDecimal;

public class CalcoliHelper {

//struttura la classe in modo che non possa esere instaziata e che presenti metodi static: somma,differenza,moltiplicazione, valore assoluto,minimo,massimo
	private CalcoliHelper(){
		
	}
	//numero Intero
	public static int somma(int a, int b) {
		return a+b;
	}
	
	
	public static int differenza(int a, int b) {
		return a-b;
	}
	
	
	public static int moltiplica(int a, int b) {
		return a*b;
	}
	
	
	public static int valoreAssoluto(int a) {
		return a*-1;
	}
	
	
	public static int max(int a, int b) {
		int max;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		return max;
	}
	public static int min(int a, int b) {
		int min;
		if(a<b) {
			min=a;
		}else {
			min=b;
		}
		return min;
	}

	
	
	//numero double
	public static double somma(double a, double b) {
		return a+b;
	}
	public static double differenza(double a, double b) {
		return a-b;
	}
	public static double moltiplica(double a, double b) {
		return a*b;
	}
	public static double valoreAssoluto(double a, double b) {
		return a*-1;
	}
	public static double max(double a, double b) {
		double max;
		if(a>b) {
			max=a;
		}else {
			max=b;
		}
		return max;
	}
	public static double min(double a, double b) {
		double min;
		if(a<b) {
			min=a;
		}else {
			min=b;
		}
		return min;
	}
}
