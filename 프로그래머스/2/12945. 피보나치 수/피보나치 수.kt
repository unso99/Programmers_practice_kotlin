class Solution {
    fun solution(n: Int) = fibo(n,1,0)
    
    fun fibo(n : Int, a: Long, b : Long) : Long{
        return when(n == 0){
            true -> b % 1234567
        false -> fibo(n-1,a+b % 1234567,a % 1234567) % 1234567
        }
    }
    
    
}