package Bosch;

public class Frequency {
    static final int SIZE = 26;
    static void printCharWithFreq(String str){
        int n = str.length();
        int[] freq = new int[SIZE];
        for(int i =0;i<n;i++)
            freq[str.charAt(i)]++;
        for(int i=0;i<n;i++){
            if(freq[str.charAt(i)]!=0){
                System.out.print(str.charAt(i));
                System.out.print(freq[str.charAt(i)]+" ");

                freq[str.charAt(i)]=0;
            }
        }
    }
    public static void main(String[] args){
        String str = "bhanupradeep";
        printCharWithFreq(str);

    }

}
