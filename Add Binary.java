//Given two binary strings a and b, return their sum as a binary string.
import java.math.BigInteger;
class Solution {
    public static String addBinary(String a, String b) {
        BigInteger x = new BigInteger(a);
        BigInteger y = new BigInteger(b);
        BigInteger s = x.add(y);
        String c = s.toString();
        String[] sum = c.split("");
        return add(sum);
    }
    public static String add(String[] s){
        int i = s.length - 1;
        while (i > 0){
            if (s[i].equals("2")){
                s[i] = "0";
                int n = Integer.parseInt(s[i-1] , 10) + 1;
                s[i-1] = Integer.toString(n);
            }
            if (s[i].equals("3")){
                s[i] = "1";
                int n = Integer.parseInt(s[i-1] , 10) + 1;
                s[i-1] = Integer.toString(n);
            }
            i--;
        }

        if (s[0].equals("2")) {
            s[0] = "10";
        }if (s[0].equals("3")){
            s[0] = "11";
        }
        return String.join("" , s);
    }
}
