class Solution {
    public String sum(String s1, String s2){
        StringBuilder res = new StringBuilder();
        int n1 = s1.length() - 1;
        int n2 = s2.length() - 1;
        int carry = 0;
        while(n1 >= 0 || n2 >= 0 || carry > 0){
            int x = (n1 >= 0) ? s1.charAt(n1) - '0' : 0;
            int y = (n2 >= 0) ? s2.charAt(n2) - '0' : 0;
            int sum = x + y + carry;
            res.append(sum % 10);
            carry = sum / 10;
            n1--;
            n2--;
            
        }
        return res.reverse().toString();
    }
    public String multiply2(String num1, int d2){
        int n1 = num1.length() - 1;
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        while(n1 >= 0 || carry > 0){
            int x = (n1 >= 0) ? num1.charAt(n1) - '0' : 0;
            int y = x * d2 + carry;
            ans.append(y % 10);
            carry = y / 10;
            n1--;
        }
       return ans.reverse().toString();
    }
    public String multiply(String num1, String num2) {
        String res = "0";
        int count = 0;
        for(int idx = num2.length() - 1; idx >= 0; idx--){
            int d2 = num2.charAt(idx) - '0';
            String s2 = multiply2(num1, d2);
            
            for (int c = 0; c < count; c++) {
                s2+='0';
            }
            res = sum(res, s2);
            count++;


        }
        if(res.charAt(0) == '0') return "0";
        return res;
    }
}