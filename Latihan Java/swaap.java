/**
 * swaap
 */
public class swaap {

    public static void main(String[] args) {
        int a = 9;
        int b = 10;

        System.out.println("before swap");
        System.out.println(a);
        System.out.println(b);

        int temp = a;
        a = b;
        b = temp; 

        int c = 0;

        System.out.println("after swap");
        System.out.println(a);
        System.out.println(b);
    }
}