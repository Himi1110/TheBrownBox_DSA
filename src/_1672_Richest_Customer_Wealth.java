public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int soTienLonNhat = 0;
        int soHang = accounts.length;
        int soCot = accounts[0].length;
        for(int i = 0;i < soHang;i++){
            int soTienCua1Nguoi = 0;
            for(int j = 0;j < soCot;j++){
                soTienCua1Nguoi += accounts[i][j];
            }
            soTienLonNhat = Math.max(soTienCua1Nguoi, soTienLonNhat);
        }
        return soTienLonNhat;
    }
    public static void main(String[] args) {
        int[][] accounts = {{2,3,4},{5,6,7},{8,9,10}};
        System.out.println(maximumWealth(accounts));
    }
}
