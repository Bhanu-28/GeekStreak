package GeekForJava;

import java.io.*; //* indicates we use all classes in io package

public class _10Input {
    public static void main(String[]args) throws IOException{
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter the string");
//            String s = br.readLine();
            int x = Integer.parseInt(br.readLine());
            System.out.println(x);
//            System.out.println("entered value is "+s);

        }
    }
}
