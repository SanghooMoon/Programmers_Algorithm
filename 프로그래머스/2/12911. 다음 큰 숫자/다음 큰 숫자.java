class Solution {
    public int solution(int n) {
        int oneCount = 0;
        int targetOneCount = 0;
        
        oneCount = getOneCount(Integer.toBinaryString(n));

        while (oneCount != targetOneCount) {
            targetOneCount = 0;
            targetOneCount = getOneCount(Integer.toBinaryString(++n));
        }
        
        return n;
    }
    
    private int getOneCount(String s) {
        int oneCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '1') {
                oneCount++;
            }
        }
        return oneCount;
    }
}