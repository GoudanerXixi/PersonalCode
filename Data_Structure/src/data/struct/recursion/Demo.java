package data.struct.recursion;

public class Demo {
    public static void main(String[] args) {
          number(4);
    }
    public static void number(int n){
        if(n > 2){
            number(n - 1);
        }
        System.out.println("n=" + n);
    }
}
