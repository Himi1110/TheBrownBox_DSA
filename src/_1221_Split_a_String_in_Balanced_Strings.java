public class _1221_Split_a_String_in_Balanced_Strings {
    public static int balancedStringSplit(String s) {
        int count = 0;
        int balance = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='L'){
                balance++;
            }else{
                balance--;
            }
            if(balance==0){
                count++;
            }
        }
//        if(balance!=0){
//            return 0;
//        }
        return count;
    }
    public static void main(String[] args) {
        String minh = "RLLLL";
        System.out.println(balancedStringSplit(minh));
    }
}
