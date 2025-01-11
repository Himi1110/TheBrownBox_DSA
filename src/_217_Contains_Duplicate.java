import java.util.HashSet;
import java.util.Set;


public class _217_Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> test = new HashSet<>();
        for(int n : nums){
            if(!test.add(n)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[]{1,2,3,4,5}));
    }
}
