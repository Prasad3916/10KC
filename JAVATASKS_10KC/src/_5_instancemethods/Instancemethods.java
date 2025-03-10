package _5_instancemethods;
public class Instancemethods {
    byte getByteValue(byte b){
        return b;
    }
    short getShortValue(short s){
        return s;
    }
    int getIntValue(int i){
        return i;
    }
     long getLongValue(long l){
        return l;
    }
    float getFloatValue(float f){
        return f;
    }
    double getDoubleValue(double d){
        return d;
    }
    char getCharValue(char c){
        return c;
    }
    boolean getBooleanValue(boolean b){
        return b;
    }
    String getStringValue(String s){
        return s;
    }
    public static void main(String[] args) {
        Instancemethods obj1=new Instancemethods();
        byte b=100;
        short s=1000;
        int i=1000000;
        long l=100000000;
        float f=266654.f;
        double d=27265345;
        char c='P';
        boolean b1=true;
        String s1="Prasad";
        byte res1=obj1.getByteValue(b);
        short res2=obj1.getShortValue(s);
        int res3=obj1.getIntValue(i);
        long res4=obj1.getLongValue(l);
        float res5=obj1.getFloatValue(f);
        double res6=obj1.getDoubleValue(d);
        char res7=obj1.getCharValue(c);
        boolean res8=obj1.getBooleanValue(b1);
        String res9=obj1.getStringValue(s1);
        System.out.println(res1+" "+res2+" "+res3+" "+res4+" "+res5+" "+res6+" "+res8+" "+res7+" "+res9);
    }
}