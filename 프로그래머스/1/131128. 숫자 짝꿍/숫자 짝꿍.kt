import java.lang.Integer.min

class Solution {
    fun solution(X: String, Y: String): String {
        var answer = ""
        
        for(ch in (9 downTo 0).toList().map { it.toString() }){
            answer += ch.repeat(
                min(
                   X.count{
                       it.toString() == ch
                   },
                    Y.count{
                        it.toString() == ch
                    }
                )
            )
        }
        
        if(answer.isEmpty()) return "-1"
        if(answer[0] == '0') return "0"
        
        return answer
    }
}