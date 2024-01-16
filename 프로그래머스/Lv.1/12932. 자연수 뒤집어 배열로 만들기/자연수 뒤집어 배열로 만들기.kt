class Solution {
    fun solution(n: Long): IntArray {
        val answer = mutableListOf<Int>()
        val arr = n.toString().toCharArray()
        for(i in arr.lastIndex downTo 0){
            answer.add(arr[i].code -48)
        }
        return answer.toIntArray()
    }
}