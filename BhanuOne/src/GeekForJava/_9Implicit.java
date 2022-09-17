package GeekForJava;

public class _9Implicit {
    public static  void main(String[]args){
//Implicit
        int x = 10;
        long y = x;
        float z=y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
//explicit
        //we have done knowingly so we need to mention explicitly while narrowing
        //we might lose data (Explicit Type casting )
        double d = 65.4;
        int i = (int) d ;
        char c = (char)i;
        System.out.println(d);
        System.out.println(i);
        System.out.println(c);
        //non primitive also we can do explain detail in inheritance

    }


}
