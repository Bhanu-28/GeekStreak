package GeekForJava;
import java.util.*;

public class _7UnBoxing {
    public static void main(String[]args){
        Character ch = 'a';
        char ch2=ch; //Auto-UnBoxing
        ArrayList<Integer> arrayList= new ArrayList<Integer>();
        arrayList.add(50);
        arrayList.add(500);
        arrayList.add(250);
        arrayList.add(2050);

        int num = arrayList.get(1);
        System.out.println(num);

    }

}
