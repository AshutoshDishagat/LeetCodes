class Solution {
    public boolean isPalindrome(String s) {

        String res = s.replaceAll("[^\\p{L}\\p{N}]", ""); 
        String res2 = "";
        StringBuilder sb = new StringBuilder("");

        for(int i =res.length()-1 ; i>=0; i--){
            sb.append(res.charAt(i));
               
        }
        String result = sb.toString();
        if(result.equalsIgnoreCase(res)){
            return true;
        }    
        else{
            return false;
        }
        
    }
}