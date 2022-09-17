package GeekForJava;

public class _3SwapNumbers {
    public static void main(String[]args){
        int a=10;
        int b=20;
        int temp = 0;
        temp =a ;
        a = b;
        b= temp;
        System.out.println(a);
        System.out.println(b);

        /*int a=10; //error
        int b=20;
        a=b; // b is stored in a now a=20
        b=a; // a is stored in b now a=20 stored in b so 20
        System.out.println(a);
        System.out.println(b);*/

    }
}
