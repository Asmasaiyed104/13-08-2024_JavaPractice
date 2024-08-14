public class MatrixAddition {
    public static void main(String[] args) {

        int[][] matrix1 = {
                {10, 20, 30},
                {20, 30, 10},
                {20, 30, 10}
        };
        int[][] matrix2 = {
                {20, 10, 30},
                {10, 25, 25},
                {50, 10, 25}
        };

        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        // Print the resulting matrix
        System.out.println("Resulting Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");  // Use print instead of println
            }
            System.out.println();  // Move to the next line after printing each row
        }
    }
}
