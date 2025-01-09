public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        long[] maxArr = {Long.MIN_VALUE,Long.MIN_VALUE,Long.MIN_VALUE};

        for(int a : nums){
            insert(maxArr,a);
        }

        if(maxArr[2] == Long.MIN_VALUE){
            return (int)maxArr[0];
        }
        return (int)maxArr[2];
    }

    public static void insert(long[] maxArr,int a){
        int i = 0;
        while (i < maxArr.length){
            if(a == maxArr[i]){
                return;
            }
            else if(a < maxArr[i]){
                i++;
            }else{
                break;
            }
        }
        if (i >= maxArr.length) return;
        for(int k = maxArr.length-1;k > i;k--){
            maxArr[k] = maxArr[k-1];
        }
        maxArr[i] = a;
    }

    public static void main(String[] args) {
        int[] test = {1,2};
        System.out.println(thirdMax(test));
    }
}
