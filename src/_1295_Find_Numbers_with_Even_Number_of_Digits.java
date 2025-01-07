public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int count = 0;
        for(int a : nums){
            if(soChuSoLaChan(a))    count++;
            System.out.println(a);
        }
        return count;
    }

    public static boolean soChuSoLaChan(int a){
        int count = 0;
        while(a != 0){
            a /= 10;
            count++;
        }
        return count % 2 == 0;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,42};
        System.out.println(findNumbers(nums));
    }
}
