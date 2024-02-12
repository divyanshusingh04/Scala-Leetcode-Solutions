object Solution {
    def decodeString(s: String): String = {
        var stk = scala.collection.mutable.Stack[Char]();
        for(i <- 0 until s.size) {
            var ch = s.charAt(i);

            if(ch == ']') {
                var currStr = "";
                while(stk.top != '[') {
                    currStr += stk.pop;
                    
                }
                stk.pop;

                // println(i + " " + (if (i > 0) stk.top else "--"))
                var currNum = "";
                var currInt = 0;
                while(!stk.isEmpty && Character.isDigit(stk.top)) {
                    currNum += stk.pop.toString;
                }
                currStr = currStr.reverse;
                currNum = currNum.reverse;
                currInt = currNum.toInt;
                while(currInt != 0) {
                    for(character <- currStr) {
                        stk.push(character);
                    }
                    currInt -= 1;
                }
            } else {
                stk.push(ch)
            }
        }
        var ans = "";
        while(!stk.isEmpty)
            ans += stk.pop;
        ans.reverse;
    }
}
