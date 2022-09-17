package GeekForJava;

public class _8Referencing {
//    java caches some literal in case of small value it caches when u
//    create more references
//    too the same value instead of creating new object it refer to same literal
    public static void main(String[]args){
        Short x1=129 , x2=129;
        if(x1==x2){
            System.out.println("same");
        }
        else
            System.out.println("not same as they are objects and referencing");



    }
}
