package array;

public class ArrayUse {

    public static void main(String[] args) {
        System.out.println("abc");

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2, 5));
    }
}
    class Calculator {

        public int add(int x, int y) {
            return x+y;
        }   
}

