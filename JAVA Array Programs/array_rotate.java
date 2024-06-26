//PROGRAM TO RIGTH ROTATE THE ARRAY (Number of rotations is user defined) eg: {1,2,3} -> {2,3,1} 

// CLOCKWISE

public class array_rotate {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.print("Enter number of times the array should be rotated right=");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt(); // INPUT NUMBER OF TIMES USER WANT TO ROTATE RIGHT

        // Displays original array
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Rotate the given array by n times toward right
        for (int i = 0; i < n; i++) {
            int j, last;
            // Stores the last element of array
            last = arr[arr.length - 1];

            for (j = arr.length - 1; j > 0; j--) {
                // Shift element of array by one
                arr[j] = arr[j - 1];
            }
            // Last element of array will be added to the start of array.
            arr[0] = last;
        }

        System.out.println();

        // Displays resulting array after rotation
        System.out.println("Array after right rotation: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}