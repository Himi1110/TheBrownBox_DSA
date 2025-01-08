public class _387_First_Unique_Character_in_a_String {
    public static int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String minh = "lloosfjsdfjjfsdkojfsdokfj";
        System.out.println(firstUniqChar(minh));
    }
}
