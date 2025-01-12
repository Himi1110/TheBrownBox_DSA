public class _70_Climbing_Stairs {
    public static int[] soBuocKhiCon = new int[45];

    public static int climbStairs(int n) {
        if(soBuocKhiCon[n]!=0)  return soBuocKhiCon[n];
        if(n==0)    return 1;
        if(n==1)    return 1;
        soBuocKhiCon[n] = climbStairs(n-1) + climbStairs(n-2);
        return soBuocKhiCon[n];
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(30));
    }
}
