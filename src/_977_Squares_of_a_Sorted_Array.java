import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int l=0,r=0;
        for(int i = 0;i < n;i++){
            if(nums[i] >= 0){
                l = i-1;
                break;
            }
            l=i;
        }
        r=l+1;
        int i =0;
        while(l>=0 || r<n){
            if(l<0){
                result[i] = nums[r];
                r++;
                i++;
            }else if(r>n-1){
                result[i] = nums[l];
                l--;
                i++;
            }else {
                if (nums[l]+nums[r] > 0){
                    result[i] = nums[l];
                    l--;
                    i++;
                }else{
                    result[i] = nums[r];
                    r++;
                    i++;
                }
            }
        }
        for (int k = 0;k < result.length;k++){
            result[k] *= result[k];
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-2,0})));
    }
}
