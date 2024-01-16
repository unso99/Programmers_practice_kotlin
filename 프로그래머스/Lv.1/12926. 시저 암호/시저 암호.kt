fun main() {
    Solution()
}
class Solution {
    init {
        println( solution("A B z",1))
    }
    fun solution(s: String, n: Int): String {
        var answer = ""
        val arr = s.toCharArray()

        for (a in arr) {
            val plus = if (a >= 'a') {
                a + n - 'z'
            } else {
                a + n - 'Z'
            }

            if (a == ' ') {
                answer += ' '
            } else if (plus > 0) {
                answer += a + n - 26
            } else if (plus <= 0) {
                answer += a + n
            }
        }
        return answer
    }
}