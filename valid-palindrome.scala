object Solution {
    def isPalindrome(s: String): Boolean = {
        var left:Int = 0;
        var right:Int = s.length-1;
        
        while(left < right) {
            if(!Character.isLetterOrDigit(s.charAt(left)))
                left += 1;
            else if(!Character.isLetterOrDigit(s.charAt(right)))
                right -= 1;
            else {
                if(s.charAt(left).toLower != s.charAt(right).toLower)
                    return false;
                left += 1;
                right -= 1;
            }
        }
        return true;
    }
}
