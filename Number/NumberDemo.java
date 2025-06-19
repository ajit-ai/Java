package Number;

public class NumberDemo {
    public static void main(String[] args) {
        int a,b,c,x,y,z = 10;

        System.out.println("Z: " + z);
        x=z/2;
        y=2;
        z /= x;
        a = z%2;
        b = z/2;
        c = z+1;

        System.out.println("X: " + x);
        System.out.println("Y:" + y);
        System.out.println("z /= x: " + z);
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
    }
}
