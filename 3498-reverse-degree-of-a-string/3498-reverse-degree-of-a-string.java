class Solution {
    public int reverseDegree(String s) {
        int ans=0;
        for(int i=0;i< s.length();i++){
            char ch=s.charAt(i);
            int reverseValue =26-(ch-'a');
            ans=ans + reverseValue*(i+1);
        }
        return ans; 
    }
}