object Solution {
    def isValid(s: String): Boolean = {
        val stk = scala.collection.mutable.Stack[Char]();
        for(char <- s) {
           if(stk.isEmpty || char == '(' || char == '{' || char == '[')
                stk.push(char);
            else if(char == ')' && !stk.isEmpty && stk.top == '(')
                stk.pop();
            else if(char == ']' && !stk.isEmpty && stk.top == '[')
                stk.pop();
            else if(char == '}' && !stk.isEmpty && stk.top == '{')
                stk.pop();      
            else 
                return false;
        }
        stk.isEmpty;
    }
}
