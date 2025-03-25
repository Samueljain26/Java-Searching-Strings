public class Occurence {

    // Function to find the first occurrence of the target
    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int first = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                first = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return first;
    }

    // Function to find the last occurrence of the target
    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int last = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                last = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return last;
    }

    // Function to return both first and last occurrences
    public static int[] searchRange(int[] arr, int target) {
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 6, 7, 8, 10};
        int target = 4;

        int[] result = searchRange(arr, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}
/*First Occurrence: 1
Last Occurrence: 3
 */