package gr.aueb.dt.chapter6;

public class SmallProject1 {
    public static int getMaxPosition(int[] arr, int low, int high) {
        // Initialize max to the first element in the range
        int max = arr[low];
        int maxPosition = low;

        // Loop through the range to find the maximum element
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > max) {
                max = arr[i];       // Update the maximum value
                maxPosition = i;    // Update the maximum position
            }
        }

        return maxPosition; // Return the position of the maximum element
    }

    public static void main(String[] args) {
        // Declare and initialize the array
        int[] arr = {5, 8, 3, 9, 4, 7, 2};
        int low = 1;   // Starting index
        int high = 6;  // Ending index

        // Call the getMaxPosition method
        int maxPosition = getMaxPosition(arr, low, high);

        // Print the result
        System.out.println("The position of the maximum element is: " + maxPosition);

        }
    }

