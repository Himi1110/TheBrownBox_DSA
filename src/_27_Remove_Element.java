public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for(int i = 0;i < nums.length;i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,3,4,5};
        System.out.println(removeElement(nums,3));
        System.out.println(nums.toString());
    }
}
