public class ArraysInJava{
    public static void main(String[] args) {
        // Q: Store a roll number
        // int a = 19;
        // System.out.println(a);

        // Q: Store a person's name
        String name = "Saumya Patil";
        System.out.println(name);

        // Q: Store 5 roll numbers
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        System.out.println(rno1);
        System.out.println(rno2);
        System.out.println(rno3);

        // Another question was store 500 roll numbers, would you write the above three lines again and again
        // Would you declare and initialise it again and again.

        // Would it not make sense if there is a sort of data structure where I could store this collection of data types.
        // We can use array for this.
        // Array is a collection of data types - primitives or objects or some complex data types can be stored here.

        // syntax - 
        // datatype[] variable_name = new datatype[size];

        // store 5 roll numbers: (how it works internally, how memory management is happening, how's this mapping to the object, what's this new keyword, size, etc.)
        int[] rnos = new int[5];
        System.out.println(rnos);

        //or directly
        int[] rnos2 = {23, 12, 45, 32, 15};
        System.out.println(rnos2);

        // 1. The data type - 'int' represents the type of data stored inside the array.
        // 2. All the elements in the array should be of same data type that is defined for it.

        // int[] - means the reference variable 'rnos' is pointing to array object that contains type integer.
        // The reference variable 'rnos' is pointing to array object

        int[] ros;  //declaration of array. ros is getting defined in the stack. Its currently not pointing to anything, we need to point it to some object.
        // Any reference variable you have, by default is going to have null type

        ros = new int[5]; //initialisation: actually here object is being created in the memory (heap)
        System.out.println(ros);

        // [0, 0, 0, 0, 0] 
        System.out.println(ros[1]); //for integer array by default its just going to have all the zero elements

        String[] arr = new String[4];
        System.out.println(arr[0]);  //default value of elements of a string array is 'null'
        // null is a special literal. It means no data type. You can cast it to any particular reference type but you can't declare this variable type.
        // null a = null;    
        
        // Its a literal that can only be assigned to non-primitives 
        String str = null;
        
        // int num = null;     //Wont work here as we have assigned it to primitive
        // null is neither an object nor a type, its a special value that can be assigned to any reference type and you can type cast 'null' to any type but you can't do it to primitives.
    
        // Why is everything null in case of arrays of String type -
        // Internal working of array of objects - String[] arr = new String[5];
        // In java, primitives are stored in stack memory, int, char, bool, etc. Non primitives, string type, array type, your own type
        // hashmap, etc. all these objects or classes that we'll be making are stored in the heap memory.
    }
}
