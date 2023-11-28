class Solution {
    fun solution(k: Int, tangerine: IntArray): Int {
        val map = mutableMapOf<String, Int>()
        
        var count = 0
        
        tangerine.forEach{
            map[it.toString()] = map.getOrDefault(it.toString(), 0) + 1
        }
        
        val values = map.values.sortedDescending()
        
        for(i in values.indices){
            count += values[i]
            if(count >= k) return i + 1
        }
        
        return k
    
    }
}