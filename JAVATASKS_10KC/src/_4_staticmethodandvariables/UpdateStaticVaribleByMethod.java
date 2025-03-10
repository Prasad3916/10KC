package _4_staticmethodandvariables;
public class UpdateStaticVaribleByMethod {
    static int a;
    static void updatea(){
        a=a+10;
    }
    public static void main(String[] args) {
        updatea();
        System.out.println(a);
}
}
