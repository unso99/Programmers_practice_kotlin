class Solution {
    fun solution(n: Int, a: Int, b: Int) = countMatch(a,b,1)
    
    fun countMatch(a : Int, b : Int, c :Int) : Int{
        if((a+1) / 2 == (b+1) / 2) return c
        return countMatch((a+1) / 2, (b +1) /2, c + 1)
    }
}