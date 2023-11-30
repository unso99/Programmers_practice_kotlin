class Solution {
    fun solution(want: Array<String>, number: IntArray, discount: Array<String>): Int {
        var answer: Int = 0
        val listToBuy = mutableMapOf<String,Int>()
        
        for (i in want.indices){
            listToBuy[want[i]] = number[i]
        }
        
        for(i in 1 .. discount.size - 9){
            val map = mutableMapOf<String,Int>()
            var isSame = true
            for(j in i - 1 .. i + 8){
                map[discount[j]] = map.getOrDefault(discount[j], 0) + 1
            }
            
            listToBuy.forEach{key, value ->
                if(map[key] != value) isSame = false
            }
            
            if(isSame) answer++
        }
        
        return answer
    }
}