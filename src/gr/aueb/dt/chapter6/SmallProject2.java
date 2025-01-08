package gr.aueb.dt.chapter6;

public class SmallProject2 {
    public static int findSecondSmallest(int[] arr) {
    // Validate the input array
    if (arr == null || arr.length < 2) {
        throw new IllegalArgumentException("Array must have at least two elements");
    }

    // Initialize variables to track the smallest and second smallest elements
    int smallest = Integer.MAX_VALUE;
    int secondSmallest = Integer.MAX_VALUE;

    // Step 1: Find the smallest and second smallest elements
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < smallest) {
            // Update second smallest before updating the smallest
            secondSmallest = smallest;
            smallest = arr[i];
        } else if (arr[i] > smallest && arr[i] < secondSmallest) {
            // Update second smallest if it's greater than smallest but smaller than second smallest
            secondSmallest = arr[i];
        }
    }

    // Step 2: Check if a valid second smallest element exists
    if (secondSmallest == Integer.MAX_VALUE) {
        throw new IllegalArgumentException("No valid second smallest element found");
    }

    // Step 3: Return the second smallest element
    return secondSmallest;
}

    public static void main(String[] args) {
        // Declare and initialize the array
        int[] arr = {5, 8, 3, 9, 4, 7, 2};

        // Call the findSecondSmallest method
        int secondSmallest = findSecondSmallest(arr);

        // Print the result
        System.out.println("The second smallest element is: " + secondSmallest);

        // Print the array (optional, for clarity)
        System.out.print("Array elements: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
