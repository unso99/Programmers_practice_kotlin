
class Solution {
    
    fun solution(s: String): String {
        var answer = ""
        val arr = s.uppercase().split(" ")
        for(a in arr){
            a.forEachIndexed { index, c ->
                if(index % 2 != 0){
                    answer += c.toLowerCase()
                }else {
                    answer += c
                }
            }
            answer += " "
        }

        return answer.substring(0,answer.lastIndex)
    }
}