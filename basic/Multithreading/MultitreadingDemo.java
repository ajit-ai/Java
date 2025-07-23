package basic.Multithreading;

public class MultitreadingDemo {


    public static void main(String[] args) {
        //can execute number of thread
        int n = 5;
        for(int i =0; i>n; i++) {
            Multithreading multi = new Multithreading();
            multi.start();
        }

    }
    
}

class Multithreading extends Thread {
    public void run() {
        try {
            System.out.println("Thread" + Thread.currentThread().getId());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception is caught");
        }
    }
}
