import java.math.BigInteger;
import java.util.ArrayList;

public class FactorialOfLargeNumber {

    public static void main(String[] args){
        int n = 10;
        for(int num : factorial(n)){
            System.out.print(num);
        }
        System.out.println();

        for(int num : factorial2(n)){
            System.out.print(num);
        }
    }

    //Implementation using BigInteger
    public static ArrayList<Integer> factorial(int n){
        ArrayList<Integer> result = new ArrayList<>();
        BigInteger bigInteger = new BigInteger("1");

        for(int i=2;i<=n;i++){
            bigInteger = bigInteger.multiply(BigInteger.valueOf(i));
        }

        String value = String.valueOf(bigInteger);
        for(int i=0;i<value.length();i++){
            int val = Integer.parseInt(String.valueOf(value.charAt(i)));
            result.add(val);
        }

        return result;
    }

    //Implementation using basic mathematics
    public static ArrayList<Integer> factorial2(int n){
        ArrayList<Integer> result = new ArrayList<>();

        int[] res = new int[500];
        res[0] = 1;
        int res_size = 1;

        for(int i=2;i<=n;i++){
            res_size = multiply(i, res, res_size);
        }

        for(int i=res_size-1;i>=0;i--){
            result.add(res[i]);
        }

        return result;
    }

    public static int multiply(int n, int[] res, int res_size){
        int carry=0;

        for(int i=0;i<res_size;i++){
            int mul = res[i] * n + carry;
            res[i] = mul % 10;
            carry = mul / 10;
        }

        while(carry!=0){
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }

        return res_size;
    }

}
