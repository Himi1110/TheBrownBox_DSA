import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int a : nums2){
            chenPhanTuVaoMang(a, nums1, m);
            m++;
        }
    }

    public static void chenPhanTuVaoMang(int a, int[] nums1, int m) {
        boolean daThay = false;
        for(int i = 0;i < m;i++){
            if (a < nums1[i]){
                daThay = true;
                for(int j = m-1;j >= i;j--){
                    nums1[j+1] = nums1[j];
                }
                nums1[i] = a;
                break;
            }
        }

        if(!daThay){
            nums1[m] = a;
        }
    }

    public static void main(String[] args) {
        int[] n1 = {1,2,3,0,0,0};
        int[] n2 = {2,5,6};
        merge(n1,3,n2,3);
        System.out.println(Arrays.toString(n1));
    }
}
