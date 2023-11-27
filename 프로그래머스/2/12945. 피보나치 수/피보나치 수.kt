class Solution {
    fun solution(n: Int) = fibo(n,1,0) % 1234567
    
    fun fibo(n : Int, a: Long, b : Long) : Long{
        return when(n == 0){
            true -> b
            false -> fibo(n-1, a+b, a)
        }
    }
    
    
}