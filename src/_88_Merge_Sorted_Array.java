import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int k = m+n-1;k >= 0;k--){
            if(n<=0){
                nums1[k] = nums1[m-1];
                m--;
            }else if (m<=0){
                nums1[k] = nums2[n-1];
                n--;
            }
            else if(nums1[m-1]>nums2[n-1]){
                nums1[k] = nums1[m-1];
                m--;
            }else{
                nums1[k] = nums2[n-1];
                n--;
            }
        }
    }


    public static void main(String[] args) {
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};
        merge(n1,3,n2,3);
        System.out.println(Arrays.toString(n1));
    }
}
