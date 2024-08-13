public class Test {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        reverseArray(arr);
        for(int element : arr){
            System.out.println(element +"");
        }

//        for (int i = 0; i <arr.length; i++){
//            System.out.println(arr[i]);

//        int myArray[];
//        int []arrr;

        // for each loop
//        for(int element: arr){
//            System.out.println(element);
//        }

        //reverse


    }
    public static void reverseArray(int[]arr){
        int start = 0;
        int end =arr.length-1;

        //Dry
        int temp;
        while(start < end){
            temp = arr[end];

            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
}

