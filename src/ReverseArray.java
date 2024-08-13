public class ReverseArray {

    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};

        // Print the array in normal order
        System.out.println("Array in order:");
        for (int i = 0; i < array.length; i++) {
            System.out.println( array[i]);
        }

        // Print the array in reverse order
        System.out.println("Array in reverse order:");
        for (int  i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
