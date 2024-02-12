object Solution {
    def reverseWords(s: String): String = {
        s.split(" ").filter(word => word.length >= 1).reverse.mkString(" ")
    }
}
