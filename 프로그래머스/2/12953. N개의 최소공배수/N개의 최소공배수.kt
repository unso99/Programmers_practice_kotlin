class Solution {
    fun solution(arr: IntArray): Int {
        var answer = 0
        for(i in 0 until arr.size - 1){
            answer = if(i == 0){
                val gcd = gcd(arr[0], arr[1])
                arr[0] * arr[1] / gcd
            }else {
                val gcd = gcd(answer, arr[i + 1])
                answer * arr[i + 1] / gcd
            }
        }
        return answer
    }
    
    fun gcd(a : Int, b : Int) : Int {
        if(b == 0) return a
        return gcd(b, a % b)
    }
}