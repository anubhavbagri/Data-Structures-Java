import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
/*
My approach to https://leetcode.com/problems/add-to-array-form-of-integer/ : Won't pass all cases hence unaccepted
 */
public class ArrayForm {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        System.out.println(addToArrayForm(arr, 516));
    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> result = new ArrayList<>(num.length);
        String n = "";
        for(int i = 0; i < num.length; i++){
            n+=num[i];
        }
        String sum =  BigDecimal.valueOf(Double.parseDouble(n) + k).toPlainString();
        System.out.println(sum);
        for(int i = 0; i < sum.length(); i++){
//            if(sum.charAt(i) != '.'){
                result.add(sum.charAt(i) - '0');
//            }else{
//                break;
//            }
        }
        return result;
    }
}
