public class _1221_Split_a_String_in_Balanced_Strings {
    public static int balancedStringSplit(String s) {
        int count = 0;
        int[] nums = new int[2];
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='L'){
                nums[0]++;
                if(nums[0]==nums[1]){
                    count++;
                }
            }else{
                nums[1]++;
                if(nums[0]==nums[1]){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String minh = "LRLRLRRRLL";
        System.out.println(balancedStringSplit(minh));
    }
}
