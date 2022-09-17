package Bosch;

import java.util.Scanner;

public class characterOccurence{
    static void printString(String str,char ch,int count)
    {
        int occ =  0,i;
        if(count==0){
            System.out.println(str);
            System.out.println(str.length());
            return;
        }
        for(i=0;i<str.length();i++){
            if (str.charAt(i)== ch)
                occ++;
            if(occ==count)
                break;
        }
        if(i<str.length()-1)
            System.out.println(str.substring(i+1));

        else
            System.out.println("Empty String");
    }
    public static void main(String[]args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the string");
//        String str = sc.next();
String str = "banana is a bad diet ";
        printString(str,'a',2);
    }

}
