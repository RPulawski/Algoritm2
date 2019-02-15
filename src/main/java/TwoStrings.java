public class TwoStrings {
    public static void main(String[] args){
        String X = "AAABBA";
        String Y = "ABAABBAAA";
        LongestCommonSubString(X,Y);
    }

   private static void LongestCommonSubString(String s1, String s2){

        int[][] DP = new int[s1.length()+1][s2.length()+1];
        int i = 0;
        int j = 0;
        int max = 0;

        for(int I = 0; I <= s1.length() ; I++){
            for(int J = 0; J <= s2.length();J++){
                if(I ==0||J==0)
                    DP[I][J] = 0;
                else if(s1.charAt(I-1) == s2.charAt(J-1))
                {
                    DP[I][J] = DP[I-1][J-1]+1;
                    if(DP[I][J] > max){
                        max = DP[I][J];
                        i = I;
                        j = J;
                    }
                }
            }
        }
        i = i-1;
        String result = "";
        while(max > 0){
            result = s1.charAt(i)+result;
            i--;
            max--;
        }
        System.out.println(result);
    }

}

