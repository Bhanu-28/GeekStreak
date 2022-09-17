public class ProgramNine {
//    Methods
    // task defined or ways to perform task
    //naming convention like this areaOfSquare
    //method signatures for suppose area(parameters)
    //access specifiers public private protected
    // return type --int float char boolean
    //method call first we need to create object of a class
    // and with instance we can call this method as it is instance method
    //if we need to call directly we need to use static belongs to global
    // and without creating object we can this method
    public static int areaOfSquare(int side){//remove static create object if there no need direct call
        int area= side*side;
        return area;
    }
    public static void main(String[] args) {
        ProgramNine nine = new ProgramNine();
        int area = nine.areaOfSquare(5);
        System.out.println(area);

        area=nine.areaOfSquare(20);
        System.out.println(area);

//there will be predefined methods like Math
    }


}
