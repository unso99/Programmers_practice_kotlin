class Solution {
    fun solution(s: String): Int {
        var answer = 0
        
        val extendedStr = s + s
        
        for (i in 0 until s.length){
            if(check(extendedStr.substring(i,i + s.length))){
                answer++
            }
        }
        
        return answer
    }
    
    fun check(str: String) : Boolean {
        val stack = java.util.Stack<Char>()
        
        for(c in str){
            when(c){
                '[','{','('-> {
                    stack.push(c)
                }
                
                ']' -> {
                    if (stack.empty()) return false
                    if(stack.peek() == '[') stack.pop()
                }
                
                '}' -> {
                    if (stack.empty()) return false
                    if(stack.peek() == '{') stack.pop()
                }
                
                ')' -> {
                    if (stack.empty()) return false
                    if(stack.peek() == '(') stack.pop()
                }
            }
        }
        
        return stack.size == 0
    }
}