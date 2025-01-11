public class Fibonaci {
    public static int fibo1(int n){
        if(n == 1)  return 1;
        if(n == 2)  return 1;
        return fibo1(n-1) + fibo1(n-2);
    }

    static int[] F = new int[1000];
    public static int fibo2(int n){
        if(F[n]!=0){
            return F[n];
        }
        if(n <= 2){
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = fibo2(n-1) + fibo2(n-2);
        return F[n];
    }
    public static void main(String[] args) {
        System.out.println(fibo2(40));
    }
}
