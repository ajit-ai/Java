package basic;

public class MultiDemension {
    public static void main(String[] args) {
        

        // Declare and initialize a two-dimensional array (matrix)
        int[][] twoDimensionalArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the elements of the two-dimensional array using nested loops
        System.out.println("Elements of the two-dimensional array:");
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                System.out.print(twoDimensionalArray[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }


        // Declare and initialize a three-dimensional array
        int[][][] threeDimensionalArray = {
            {
                {1, 2, 3},
                {4, 5, 6}
            },
            {
                {7, 8, 9},
                {10, 11, 12}
            }
        };

        // Print the elements of the three-dimensional array using nested loops
        System.out.println("Elements of the three-dimensional array:");
        for (int i = 0; i < threeDimensionalArray.length; i++) {
            for (int j = 0; j < threeDimensionalArray[i].length; j++) {
                for (int k = 0; k < threeDimensionalArray[i][j].length; k++) {
                    System.out.print(threeDimensionalArray[i][j][k] + " ");
                }
                System.out.println(); // New line after each row
            }
            System.out.println(); // New line after each 2D slice
        }


        // Declare and initialize a jagged array (array of arrays)
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        // Print the elements of the jagged array using nested loops
        System.out.println("Elements of the jagged array:");

        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        // Declare and initialize a four-dimensional array
        int[][][][] fourDimensionalArray = {
            {
                {
                    {1, 2},
                    {3, 4}
                },
                {
                    {5, 6},
                    {7, 8}
                }
            },
            {
                {
                    {9, 10},
                    {11, 12}
                },
                {
                    {13, 14},
                    {15, 16}
                }
            }
        };

        // Print the elements of the four-dimensional array using nested loops
        System.out.println("Elements of the four-dimensional array:");

        for (int i = 0; i < fourDimensionalArray.length; i++) {
            for (int j = 0; j < fourDimensionalArray[i].length; j++) {
                for (int k = 0; k < fourDimensionalArray[i][j].length; k++) {
                    for (int l = 0; l < fourDimensionalArray[i][j][k].length; l++) {
                        System.out.print(fourDimensionalArray[i][j][k][l] + " ");
                    }
                    System.out.println(); // New line after each row
                }
                System.out.println(); // New line after each 3D slice
            }
            System.out.println(); // New line after each 2D slice
        }
    }
    
}
