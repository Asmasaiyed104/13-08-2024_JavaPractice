public class FindMax {

    public static void main(String[] args) {
        int max = 0;
        int[] arr = {10,20,45,23,23,53,54};
    for(int i = 1; i <arr.length; i++){

        if (arr[i] > max) {
            max =arr[i];
        }
    }
        System.out.println("The max value in the array is : " + max);

    }
}
