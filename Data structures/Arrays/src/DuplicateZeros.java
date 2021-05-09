public class DuplicateZeros {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                for (int j = n - 2; j >= i + 1; j--) {
                    arr[j + 1] = arr[j];
                }
                if(i + 1 < n){
                    arr[i + 1] = 0;
                    i++;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + "  ");
        }
        
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 0, 0, 0, 0, 0, 0 };
        // System.out.println(arr.length);
        duplicateZeros(arr);
    }
}
