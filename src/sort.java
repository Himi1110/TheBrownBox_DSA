import java.util.Arrays;


public class sort {
    public static void bubbleSort(int[] arr){
        int doDai = arr.length;
        for(int i=0;i<doDai-1;i++){
            for(int j = 0;j < doDai-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void insertSort(int[] arr){
        int doDai = arr.length;
        for(int i = 1;i < doDai;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && key<arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] test = {1,2,3,4,6,6,5,1,5,13,5};
        insertSort(test);
        System.out.println(Arrays.toString(test));
    }
}
