import java.util.Scanner;

public class InputArrayElements {
    public static void main(String[] args) {

        // Taking input inside array
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 45;
        arr[2] = 233;
        arr[3] = 543;
        arr[4] = 3;

        // [23, 45, 233, 543, 3]
        System.out.println(arr[3]);

        // input using for loops
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        // printing the elements
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // Above, we are using indices to get the items, you can directly get the items as well.
        // Using enhanced for loop (for each loop)
        for (int i : arr) {   //for every element in array, print the element
            System.out.print(i + " ");   //here, i represents element of the array
        }

        // If you try to get answer to more than 5 numbers that will give you an error
        System.out.println(arr[5]); //index out of bound error

        

    }
}
