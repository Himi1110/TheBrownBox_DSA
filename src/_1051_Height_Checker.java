import java.util.Arrays;

public class _1051_Height_Checker {
    public static int heightChecker(int[] heights) {
        int[] tanXuatChieuCao = new int[101];
        for(int i = 0;i < heights.length;i++){
            tanXuatChieuCao[heights[i]]++;
        }

        int chieuCaoHienTai = 0;
        int count = 0;

        for(int i = 0;i < heights.length;i++){
            while (tanXuatChieuCao[chieuCaoHienTai] == 0){
                chieuCaoHienTai++;
            }

            if(heights[i] != chieuCaoHienTai){
                count++;
            }
                tanXuatChieuCao[chieuCaoHienTai]--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(heightChecker(new int[]{1,2,3,1}));
    }
}
