public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        if(arr.length <= 2) return false;
        int leftPeak = 0;
        int rightPeak = arr.length - 1;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] >= arr[i+1]){
                leftPeak = i;
                break;
            }
        }
        for(int i = arr.length - 1; i > 0; i--){
            if(arr[i-1] <= arr[i]){
                rightPeak = i;
                break;
            }
        }
        return leftPeak == rightPeak;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(validMountainArray(arr));
    }
}
