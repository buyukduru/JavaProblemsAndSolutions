package constructors;

public class Constructor01 {
    //OCA problems 01
    // What is the result if the program runs?
    int count;
    public void Constructor01(){
        count=4;
    }

    public static void main(String[] args) {
        Constructor01 cns = new Constructor01();
        System.out.println(cns.count);
    }
    /*
    A. 0
    B. 4
    C. Runtime Error
    D. CTE
    Answer is 0. Because Constructor01 is not a constructor ,
    it has a Return Type (void) so that it is a method
     */

}
