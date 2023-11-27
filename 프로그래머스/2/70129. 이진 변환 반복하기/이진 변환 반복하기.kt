class Solution {
    fun solution(str: String) : IntArray{
        val answer : IntArray
        var strCopy = str
        var changedCount = 0
        var deletedZeroCount = 0
        while(strCopy != "1"){
            val fullLength = strCopy.length
            strCopy = strCopy.replace("0","")
            val reducedLength = strCopy.length
            deletedZeroCount += fullLength - reducedLength
            strCopy = Integer.toBinaryString(reducedLength)
            changedCount++
        }
        answer = intArrayOf(changedCount, deletedZeroCount)
        
        return answer
    }
}