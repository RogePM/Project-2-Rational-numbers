package edu.guilford;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        
       // print rational numbers // test rational 
        Rational r1 = new Rational(2, 4);
        System.out.println("\n"+r1+" first test");
        
        //test negate method
        Rational.negate(r1);
        System.out.println("\n"+r1+" negated rational");
        //reset rational 
        Rational.Reset(r1);
    

        //test invert method
        Rational.invert(r1);
        System.out.println("\n"+r1+" inverted rational");
        Rational.Reset(r1);


        //test toDouble method
        double result = Rational.toDouble(r1);
        System.out.println("\n"+result+" double rational");
        Rational.Reset(r1);

        //test reduce method
        r1 = (new Rational(40, 80));
        r1.Reduce(r1);
        System.out.println("\n"+r1+" reduced rational");
        Rational.Reset(r1);

        //test add method
        r1 = (new Rational(2, 4));
        Rational r2 = new Rational(4, 8);
        Rational r3 = Rational.add(r1, r2);
        System.out.println("\n"+r3+" add rational");
        Rational.Reset(r1);
        Rational.Reset(r2);

        //test ramdom method rational 
        Rational r4 = new Rational();
        System.out.println("\n"+r4+" random rational");
      
    }

}
