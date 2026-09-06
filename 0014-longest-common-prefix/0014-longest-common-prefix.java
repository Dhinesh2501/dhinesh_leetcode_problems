class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null|| strs.length==0){
            return " ";
        }
        int i=0;
        while (i< strs[0].length()){
            char ch =strs[0].charAt(i);
            int j=1;
            while (j<strs.length){
                if(i >=strs[j].length()|| strs[j].charAt(i)!=ch){
                    return strs[0].substring(0,i);
                }
                j++;
            }
                i++;
        }
            return strs[0];
    }
}
