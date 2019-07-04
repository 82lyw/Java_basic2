package chapter13;

import java.math.*;
//
//public class RationalClass extends Number implements Comparable<RationalClass> {
//    private long numberator = 0;
//    private long denominator = 1;
//
//    public RationalClass() {
//        this(0,1);
//    }
//
//    public RationalClass(long numberator,long denominator) {
//        long gcd = gcd(numberator,denominator);
//        this.numberator = (denominator > 0 ? 1 : -1) * numberator /gcd;
//        this.denominator = Math.abs(denominator) /gcd;
//    }
//
//    private static long gcd(long n,long d) {
//        long n1 = Math.abs(n);
//        long n2 = Math.abs(d);
//        int gcd = 1;
//
//        for (int k = 1;k <= n1 && k <= n2;k++) {
//            if (n1 % k == 0 && n2 % k == 0)
//                gcd = k;
//        }
//
//        return gcd;
//    }
//
//    public long getNumberator() {
//        return numberator;
//    }
//
//    public long getDenominator() {
//        return denominator;
//    }
//
//    public RationalClass add(RationalClass secondRation) {
//        long n = numberator * secondRation.getDenominator() +
//                denominator * secondRation.getNumberator();
//        long d = denominator * secondRation.getDenominator();
//        return new RationalClass(n,d);
//    }
//
//    public RationalClass subtract(RationalClass secondRation) {
//        long n = numberator * secondRation.getDenominator() -
//                denominator * secondRation.getNumberator();
//        long d = denominator * secondRation.getDenominator();
//        return new RationalClass(n,d);
//    }
//
//    public RationalClass multiply(RationalClass secondRational) {
//        long n = numberator * secondRational.getNumberator();
//        long d = denominator * secondRational.getDenominator();
//        return new RationalClass(n,d);
//    }
//
//    public RationalClass divide(RationalClass secondRational) {
//        long n = numberator * secondRational.getDenominator();
//        long d = denominator * secondRational.getNumberator();
//        return new RationalClass(n,d);
//    }
//
//    @Override
//    public String toString() {
//        if (denominator == 1)
//            return numberator + " ";
//        else
//            return numberator + " / " + denominator;
//    }
//
//    @Override
//    public boolean equal(Object other) {
//        if ((this.subtract((RationalClass)(other))).getNumberator() == 0)
//            return true;
//        else
//            return false;
//    }
//
//    @Override
//    public int intValue() {
//        return (int)doubleValue();
//    }
//
//    @Override
//    public float floatValue() {
//        return (float)doubleValue();
//    }
//
//    @Override
//    public long longValue() {
//        return (long)doubleValue();
//    }
//
//    @Override
//    public int compareTo(RationalClass o) {
//        if (this.subtract(o).getNumberator() > 0)
//            return 1;
//        else if (this.subtract(o).getNumberator() < 0)
//            return -1;
//        else
//            return 0;
//    }
//
//}
