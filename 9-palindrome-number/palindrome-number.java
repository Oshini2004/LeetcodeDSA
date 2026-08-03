class Solution {
    public static boolean isPalindrome(int x) {
         String P =Integer.toString(x);
         int left=0;
         int right=P.length()-1;

         while(left<right){
            if(P.charAt(left) != P.charAt(right)) return false;
        left++;
        right--;
    }
    return true;
         }
         public static void main (String[]args){
            int x=121;
            isPalindrome(x);
         }
        
    }
