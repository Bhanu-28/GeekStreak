package GeekForJava;

class Point{
    int x;
    int y;
}

public class _4nonPrimitiveDataTypes {
        public static void main(String[]args){
// Point p1 = new Point //then memory is allocated on the heap
// and reference to that memory in p1
// Point p2= p1; p2 stores reference to p1
// int x; allocates memory for an integer variable on the function called stack
// x is not refernce memory of  x is allocated when u decalred it in a function
            Point p = new Point();
            Point p2 = p;
// p2 also referencing same memory location
            p.x=10;
            p2.x=30;
            p.y=20;
            System.out.println(p.x+" "+p.y);
        }

}
