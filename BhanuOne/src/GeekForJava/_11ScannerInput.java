package GeekForJava;
import java.util.Scanner;

public class _11ScannerInput {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("entered string is "+s);
        int x = sc.nextInt();
        System.out.println("entered integer is "+x);
        float f = sc.nextFloat();
        System.out.println("entered Float is "+f);

    }
}
