package _3_methodwithreturntypeandarguments;
public class SimpleInterestCalculator {
    static double calculateSimpleInterst(double p,double t,double r){
        return (p*t*r)/100;
    }
    public static void main(String args[]){
        System.out.println(calculateSimpleInterst(10000, 12, 2));
    }
}
