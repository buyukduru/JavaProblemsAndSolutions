package oca_questions;

public class Main {
    /*
    Question 01
    What will happen when you compile and run the following code?
   A. 1 will be printed out
   B. 2 will be printed out
   C. A compile time error will be generated
   D. An exception will be thrown
     */
    private int i = 1;
    public static void main(String argv[]){
        int i = 2;
        Main s = new Main ();
        s.someMethod();
    }
    public static void someMethod(){
     //   System.out.println(i); //it does not work
    }
    //Answer: C
    //You cannot access an instance variable from a static method.
}
