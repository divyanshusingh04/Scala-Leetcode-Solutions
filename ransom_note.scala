object Solution {
    def canConstruct(ransomNote: String, magazine: String): Boolean = {
        var count:Array[Int] = new Array[Int](26);
        
        for(i <- 0 until magazine.length)
            count(magazine.charAt(i) - 'a') += 1;
        
        for(i <- 0 until ransomNote.length) {
            if(count(ransomNote.charAt(i) - 'a') == 0)
                return false;
            else
                count(ransomNote.charAt(i) - 'a') -= 1;
        }
        
        return true;
    }
}
