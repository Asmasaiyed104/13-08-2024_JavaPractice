import javax.naming.PartialResultException;

public class FindMin {

    public static void main(String[] args) {



        int[] arr = {10,20,45,23,23,53,54};
        int min = arr[0];
        for(int i = 1 ; i < arr.length; i++)
            if(arr[i] < min){
                min = arr[i];
            }

        System.out.println("The min of array is : " + min);
    }
}
