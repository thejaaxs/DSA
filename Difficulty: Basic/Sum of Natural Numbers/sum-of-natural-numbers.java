
class Solution {
    public static int seriesSum(int n) {
        // code here
        if(n==1) return n ;
        int sum =  0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        return sum ;
    }
}
