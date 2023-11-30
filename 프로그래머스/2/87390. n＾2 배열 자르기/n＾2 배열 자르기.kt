class Solution {
    fun solution(n: Int, left: Long, right: Long): IntArray {
        val answer = mutableListOf<Int>()
        
        for(i in left..right){
            val row = (i / n) + 1
            val col = (i % n) + 1
            
            if(row >= col) answer.add(row.toInt())
            else answer.add(col.toInt())
        }
        
        return answer.toIntArray()
    }
}