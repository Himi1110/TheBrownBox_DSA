public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int soPhanTu = nums.length;
        for(int i = 0;i < soPhanTu;){
            if(nums[i] == val){
                xoaPhanTu(i,nums,soPhanTu);
                soPhanTu--;
                continue;
            }
            i++;
        }
        return soPhanTu;
    }

    public static void xoaPhanTu(int i, int[] nums, int soPhanTu) {
        for(int j = i;j < soPhanTu-2;j++){
            nums[j] = nums[j+1];
        }
        nums[soPhanTu-1] = 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,3,4,5};
        System.out.println(removeElement(nums,3));
        System.out.println(nums.toString());
    }
}
