class Solution {
    fun solution(str: String): String {
        val answer : String
        val min : String
        val max : String
        val numbers = str.split(" ").map{it.toInt()}
        numbers.apply{
            min = minOf{it}.toString()
            max = maxOf{it}.toString()
        }
        answer = "$min $max"
        
        return answer
    }
}