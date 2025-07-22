package basic;

public class Minarray {
    public static void main(String[] args) {
        int[] myArray = {7, 12, 9, 4, 11};
        int minimumValue = myArray[0];

        for (int currentValue : myArray) {
            if (currentValue < minimumValue) {
                minimumValue = currentValue;
            }
        }

        System.out.println("Lowest value: " + minimumValue);
    }
    
}
