class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        val n3 = n.toString(3)
        val reverse = n3.reversed()
        answer = reverse.toInt(3)
        return answer
    }
}