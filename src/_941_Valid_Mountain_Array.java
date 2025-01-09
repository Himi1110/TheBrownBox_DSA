public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        int dinh = 0;
        if(arr.length <= 2 || arr[0] >= arr[1]){
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i]<arr[i+1]){
                continue;
            }else if(arr[i]==arr[i+1]){
                return false;
            }else{
                dinh = i;
                break;
            }
        }
        for(int i = dinh+1; i < arr.length; i++) {
            if(arr[i] >=arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {3,7,6,4,3,0,1,0};
        System.out.println(validMountainArray(arr));
    }
}
