class Solution {
    fun solution(s: String): Boolean {
        var length = false
        var number = true
        if (s.length == 4 || s.length == 6) length = true
        val arr = s.toCharArray()
        for (a in arr) {
            when (a) {
                in '0'..'9' -> {
                    number = true
                }

                else -> {
                    number = false
                    break
                }
            }
        }
        return length && number
    }
}