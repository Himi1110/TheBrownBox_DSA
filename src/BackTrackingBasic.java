public class BackTrackingBasic {
    private static final String[] colors = {"red", "green", "blue", "yellow", "purple"};
    private static final int[] selections = new int[colors.length];
    private static final int[] validValue = new int[]{0,1};
    private static int count = 0;

    private static void backtrack(int curIndex){
        for(int i = 0;i < validValue.length;i++){
            selections[curIndex] = validValue[i];
            if(curIndex == colors.length-1){
                count ++;
            }else{
                backtrack(curIndex+1);
            }
        }
    }


    public static void main(String[] args) {
        backtrack(0);
        System.out.println(count);
    }
}
