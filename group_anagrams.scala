object Solution {
    def groupAnagrams(strs: Array[String]): List[List[String]] = {
        var mappings = scala.collection.mutable.Map[String, Array[String]]().withDefaultValue(Array[String]());
        for(word <- strs) {
            mappings(word.sorted) +:= word;
        }
        var ans = new Array[List[String]](0);
        for((key, value) <- mappings) {
            ans +:= value.toList;
        }
        ans.toList;
    }
}
