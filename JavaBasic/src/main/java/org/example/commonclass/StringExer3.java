package org.example.commonclass;

public class StringExer3 {
    public static void main(String[] args) {
        String str = findMaxSubString("abcwerthelloyuiodef", "cvhellobnm");
        System.out.println("最大相同子串: " + str);
    }

    private static String findMaxSubString(String str1, String str2) {
        String result="";
        String minStr = str1.length() < str2.length() ? str1 : str2;
        String maxStr = str1.length() > str2.length() ? str1 : str2;

        // 外循环控制从左到右的下标， 内循环控制从右到左的下标
        for(int i=0; i < minStr.length(); i++){
            for(int j=minStr.length(); j>= i; j --){
                String str = minStr.substring(i, j);
                if(maxStr.contains(str)){
                    // 找出最大相同子串
                    if(result.length() < str.length()){
                        result = str;
                    }
                }
            }
        }

        return result;
    }
}
