public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        if(arr.length <= 2) return false;
        int dinh = 0;
        for(int i = 0; i < arr.length-1; i++){
            if(arr[i] >= arr[i+1]){
                if(arr[i] == arr[i+1]){
                    return false;
                }
                dinh = i;
                break;
            }
        }
        for(int i = dinh; i < arr.length-1; i++){
            if(arr[i+1] >= arr[i]){
                return false;
            }
        }
        if (dinh == 0 || dinh ==arr.length)   return false;
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {14,82,89,84,79,70,70,68,67,66,63,60,58,54,44,43,32,28,26,25,22,15,13,12,10,8,7,5,4,3};
        System.out.println(validMountainArray(arr));
    }
}
