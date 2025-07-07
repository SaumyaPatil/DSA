import java.util.Arrays;

public class PassingFunctions {

    // Name of reference variable in the function is arr but its pointing to the same object.
    static void change(int[] arr){

        // Here the 0th index value is changed, the original array is also changed as both are pointing to the same object.
        // This is known as mutability or mutable behaviour. 
        arr[0] = 99;
    }

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));

        //Here, the copy of reference variable is passed to the function
        change(nums); 
        System.out.println(Arrays.toString(nums));

        // Strings are immutable in JAVA while arrays are mutable. Means you can change the object.
        

    }
}
