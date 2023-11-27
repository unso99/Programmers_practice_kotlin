class Solution {
    fun solution(str: String) = str.toLowerCase().split(" ").joinToString(" "){it.capitalize()}
}