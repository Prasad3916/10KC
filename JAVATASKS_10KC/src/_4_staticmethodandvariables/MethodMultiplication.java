package _4_staticmethodandvariables;
public class MethodMultiplication {
    static int a=10;
    static int b=10;
    static int multipleOfTwoNumbers(){
        return a*b;
    }
    public static void main(String[] args) {
        System.out.println(multipleOfTwoNumbers());
    }

}
