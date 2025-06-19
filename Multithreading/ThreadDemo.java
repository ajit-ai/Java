package Multithreading;

public class ThreadDemo {
    public static void main(String[] args) {
        final String name = "Ajit";
        Runnable run = new Runnable() {
            public void run() {
                System.out.println("Hi--> " +name);
            }
        };
        System.out.println("Run " + run.toString());

        // with Lambdas, can rewrite the code above like this
        String names = "Charlie";
        Runnable greeter = () -> System.out.println("Hi " + names);
        System.out.println("Greeting-->" + greeter);

    }
    
}
