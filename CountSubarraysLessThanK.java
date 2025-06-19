public class CountSubarraysLessThanK {

    public static int countSubarraysLessThanK(int[] nums, int K) {
        int count = 0;
        int n = nums.length;

        // Brute-force approach to check all subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += nums[j];
                if (sum < K) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int K = 5;

        int result = countSubarraysLessThanK(nums, K);
        System.out.println("Number of subarrays with sum less than " + K + " = " + result);
    }
}
