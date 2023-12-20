class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var answer: Int = 0

        for(i in 1..number){
            val atk = countFactor(i)

            if(atk > limit) answer += power
            else answer += atk
        }
        return answer
    }

    fun countFactor(num : Int) : Int{
        var count = 0
        //1부터 루트 n까지의 약수의 갯수를 구하고 n2이면 1을 빼주는 작업을 해준다.
        val rootNum = Math.pow(num.toDouble(),0.5).toInt()
        for(i in 1 ..rootNum){
            if(num % i == 0) count++
        }
        
        count *= 2
        if(num == rootNum * rootNum) count -= 1
        return count
    }
}