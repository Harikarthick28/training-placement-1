public class LargestElement {
    public static int findLargest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) max = num;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {5, 1, 8, 7, 2};
        System.out.println(findLargest(nums));  
    }
}
