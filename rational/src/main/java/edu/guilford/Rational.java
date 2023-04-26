package edu.guilford;

import java.util.Random;

public class Rational {
    private int numerator;
    private int denominator;

    public static void Reset(Rational r1){
        r1.numerator = 2;
        r1.denominator = 4;
    }
    //constructor that takes no arguments and initializes ramdom rational number 0-100 
     public Rational(){
         Random rand = new Random();
         numerator = rand.nextInt(100);
         denominator = rand.nextInt(100);
         while( numerator == 0 || denominator == 0){
                numerator = rand.nextInt(100);
                denominator = rand.nextInt(100);
        }
    }
    //constructor that takes no arguments
    // public Rational() {
    //     numerator = 2;
    //     denominator = 4;
    // }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    //toString method 
    public String toString(){
        return numerator + "/" + denominator;
    }
    //second constructor takes two arguments and uses them to initialize the numerator and denominator 
    public Rational(int numerator){
        this.numerator = numerator;
        this.denominator = 1;
    }
    //method called negate that reverses the sign of the rational number
     public static void negate(Rational r1) {       //should be void because it is a modifier method
	 	r1.numerator = r1.numerator * -1;
	 	if(r1.denominator <= 0) {
     		r1.numerator = r1.numerator * -1;
			r1.denominator = r1.denominator * -1;
    }
 }
    //method that swaps numerator and denominator
    public static void invert(Rational r1) {
        int temp = r1.numerator;
        r1.numerator = r1.denominator;
        r1.denominator = temp;
    }
    //todouble
    public static double toDouble(Rational r1) {
        double result = (double)r1.numerator/(double)r1.denominator;
        return result;
    }
    //reduce
    public void Reduce(Rational r1){
        if((r1.numerator % r1.denominator == 0)){
            System.out.println("The rational number is already reduced");
            // System.out.println(r1);
    }
        else{
            int gcd = 1;
            for(int i = 1; i <= r1.numerator && i <= r1.denominator; i++){
                if(r1.numerator % i == 0 && r1.denominator % i == 0){
                    gcd = i;
                }
            }
            r1.numerator = r1.numerator / gcd;
            r1.denominator = r1.denominator / gcd;
        }
    }
    //random rational number
    public static Rational add(Rational r1, Rational r2){
        Rational result = new Rational();
        result.numerator = (r1.numerator * r2.denominator) + (r2.numerator * r1.denominator);
        result.denominator = r1.denominator * r2.denominator;
        return result;
    }


}