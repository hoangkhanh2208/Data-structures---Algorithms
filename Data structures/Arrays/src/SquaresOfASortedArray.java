public class SquaresOfASortedArray {

    public static int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int backCounter = 0;
        int frontCounter = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            int back = nums[backCounter];
            int front = nums[frontCounter];

            if (Math.abs(front) > Math.abs(back)) {
                result[i] = front * front;
                frontCounter--;
            } else {
                result[i] = back * back;
                backCounter++;
            }
        }
        return result;
    }

    
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        
        System.out.println(sortedSquares(nums));
    }
}
