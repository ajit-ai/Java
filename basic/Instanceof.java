package basic;

public class Instanceof {
    public static void main(String[] args) {
        Object[] objects = new Object[10];
        objects[0] = "Hello";
        objects[1] = 42;
        objects[2] = 3.14;

        for (Object obj : objects) {
            if (obj instanceof String) {
                System.out.println("String: " + obj);
            } else if (obj instanceof Integer) {
                System.out.println("Integer: " + obj);
            } else if (obj instanceof Double) {
                System.out.println("Double: " + obj);
            } else {
                System.out.println("Unknown type: " + obj);
            }
        }

        // Example of using instanceof with a custom class
        class CustomClass {
            @Override
            public String toString() {
                return "CustomClass instance";
            }
        }

        Object customObject = new CustomClass();
        if (customObject instanceof CustomClass) {
            System.out.println("Custom class detected: " + customObject);
        } else {
            System.out.println("Not a CustomClass instance");
        }
    }
}
