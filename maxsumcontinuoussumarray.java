public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int res= A.get(0);
        int maxending=A.get(0);
        for(int i=1;i<A.size();i++)
        {
            maxending= Math.max(maxending+A.get(i),A.get(i));
            res=Math.max(maxending,res);
        }
        return res;
    }
}