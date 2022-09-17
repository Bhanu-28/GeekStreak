package GeekForJava;
import java.util.*;

public class _6AutoBoxing {
    public static void main(String[] args)
    {

//        int x1= 10;
//        Integer x2 = x1;//auto-boxing
//        int x3 = x2;
//        System.out.println(x1);
//        System.out.println(x2);
//        System.out.println(x3);

//        Integer x1=400,x2=400;
//        if(x1==x2)
//            System.out.println("same");
//        else
//            System.out.println("not same ");


        char ch = 'a';

        Character a = ch; //Auto-Boxing

        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(25);
        System.out.println(ch);
        System.out.println(a);
        System.out.println(arrayList.get(0));
    }
}
