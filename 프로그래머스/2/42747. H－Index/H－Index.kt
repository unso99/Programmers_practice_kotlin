import java.util.*

class Solution {
    fun solution(citations: IntArray): Int {
        var answer = 0

        Arrays.sort(citations)

        for(i in 0 until citations.size){
            if(citations[i] >= citations.size-i){
                answer = citations.size -i
                break
            }
        }

        return answer
    }
}