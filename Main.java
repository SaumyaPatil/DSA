public class Main{
    public static void main(String[] args) {
        // Q: Store a roll number
        int a = 19;
        System.out.println(a);

        int[] rnos = new int[5];
        System.out.println(rnos);

        //or directly
        int[] rnos2 = {1, 2, 3, 4, 5};
        System.out.println(rnos2);

        //declaration of array. ros is getting defined in the stack
        int[] ros;  

        //initialisation: actually here object is being created in the memory (heap)
        ros = new int[5];
        System.out.println(ros);
    }
}

// In C / C++, there is continuous memory allocation to the elements of the array
// In java theres no concept of pointers, it totally depends on JVM, 
// whether this is going to be continuous or not.

// 1. Array objects are in heap. All the objects are stored in heap section.
// 2. In JLS (Java Language Specification) its mentioned that heap objects are not continuous. 
// 3. Heap is the runtime data area where the memory of all the classes or instances are allocated.


// Hence array objects in java may not be continuous.
// Depends on JVM.
// 'new' is used to create an object.

