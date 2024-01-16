class Solution {
    fun solution(s: String): Int {
        var answer = 1000
        for(i in 1 ..s.length){
            val length = getLength(s,i)
            if(answer > length) answer = length
        }
        return answer
    }

    fun getLength(s: String, n : Int) : Int{
        var result = ""
        val chuncked = s.chunked(n)

        var index = 0
        var nextIndex = 1
        var count = 1
        while (index != chuncked.size){
            if(nextIndex <= chuncked.lastIndex && chuncked[index] == chuncked[nextIndex]){
                count++
                if(nextIndex == chuncked.lastIndex) {
                    result += "${count}${chuncked[index]}"
                    break
                }
            }else {
                if(count == 1) {
                    result += chuncked[index]
                }else {
                    result += "${count}${chuncked[index]}"
                }
                count = 1
            }
            index++
            nextIndex = index + 1
        }
        return result.length
    }
}