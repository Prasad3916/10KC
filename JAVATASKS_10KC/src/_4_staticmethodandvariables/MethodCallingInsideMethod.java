package _4_staticmethodandvariables;
public class MethodCallingInsideMethod {
    static int  method1(int a){
        return a+10;
    }
    static int method2(int b){
        return method1(b)+80;
    }
    public static void main(String[] args) {
        System.out.println(method2(10));
    }
}
