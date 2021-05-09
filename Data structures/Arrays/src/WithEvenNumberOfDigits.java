public class WithEvenNumberOfDigits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (digits2(nums[i]) % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static int digits1(int n) {
        int count = 0;
        while (n != 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int digits2(int n) {
        return (int) Math.log10(n) + 1;
    }

    public static void main(String[] args) throws Exception {
        int[] nums = { 437, 3315, 322, 43 };

        System.out.println(findNumbers(nums));
    }
}
