package GeekForJava;

public class Hello {
        /*Public*/
//    main function point where java application begins
// in mainMethod Public is anAccess specifier we use public so that main method is
// accesible for everywhere when u run jvm needs to run outside class
//static are special methods which can be called without creating object
//    main is made static always because jvm does not want to create object of classand run this method
//    its want to call main function
//    void is return type of main
//    this array of strings which are arguments of main function so when u write a
//    function java decided to receive arguments and java decided to have arg as String
//    so that u pass string set command line u can specify some special parameters and then
//    application  may use this parameters
//    args is name of array we can call it any thing
//    System is a standard java class out is an object in this class and its object of
//    print string which is used on standard output device
//    println is method in print stream class so we call it on out object

//running the code
//    javac Test.java (when u see dir it will create test.class)then byte code exceuted using java command
//    java Test (byte code taken as input and run by jvm)

    public static void main(String[]args){
        System.out.println("hello world");
    }
}
