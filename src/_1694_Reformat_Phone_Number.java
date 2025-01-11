public class _1694_Reformat_Phone_Number {
    public static String reformatNumber(String number) {
        StringBuilder sb = new StringBuilder();

        for(char i : number.toCharArray()){
            if(i>='0'&&i<=9){
                sb.append(i);
            }
        }
        return tach(sb.toString());
    }

    public static String tach(String number){
        if(number.length() <= 3){
            return number;
        }else if(number.length() == 4){
            return number.substring(0,2) + "-" + number.substring(2);
        }
        return number.substring(0,3)+"-"+tach(number.substring(3));
    }

    public static void main(String[] args) {
        System.out.println(reformatNumber("1-2-3-4-5  321321"));
    }
}
