class Solution {
    public boolean isAnagram(String s, String t) {
       
       if(s.length() != t.length()){
            return false;
        }
        else{
        char []sstr = s.toCharArray();
        Arrays.sort(sstr);
        char [] tstr=t.toCharArray();
        Arrays.sort(tstr);
        if(Arrays.equals(sstr,tstr)){
        return true;
        }
        else{return false;}
        }
    }
}