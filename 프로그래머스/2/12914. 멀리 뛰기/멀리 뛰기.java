import java.math.*;

class Solution {
    public long solution(int n) {
        if(n == 1)
            return 1;

        BigInteger beforeOne = new BigInteger("1");
        BigInteger beforeTwo = new BigInteger("1");
        BigInteger tmp;

        for(int target = 2; target <= n; target++) {
            tmp = beforeOne.add(beforeTwo);
            beforeTwo = beforeOne;
            beforeOne = tmp;
        }

        return beforeOne.remainder(new BigInteger("1234567")).longValue();
    }
}