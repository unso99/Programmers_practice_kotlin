class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        val answer = intArrayOf()
        val num = brown + yellow
        
        for(i in 1..num){
            if(num % i == 0){
                val height = num / i
                if (i < height) continue
                //테두리한줄은 브라운이여야함
                if(brown == (i * 2 + (height - 2) * 2)) return intArrayOf(i, height)
            }
        }
        
        return answer
    }
}