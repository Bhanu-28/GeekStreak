package GeekForJava;

import java.math.*;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class _13PrintFormat {
    public static  void main(String[]args){
        int x = 100 ,y = 200;
        System.out.format("value of x is %d\n",x);
//03.142
        float z = (float)Math.PI;
        System.out.println(z);
        System.out.format("value of PI is %.2f\n",z);
        System.out.format("value of PI is %06.3f\n",z);
        System.out.printf("x=%d"+" "+"y=%d",x,y);


    }
}
