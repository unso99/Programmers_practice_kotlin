class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): MutableList<IntArray> {
        var answer = mutableListOf<IntArray>()

        for(i in 0 until arr1.size){
            //각행을 가져옴
            val arr = IntArray(arr2[0].size) // 정답을 넣어줄 친구

            for(k in 0 until arr2[0].size){
                for(j in 0 until arr1[0].size){
                    arr[k] += arr1[i][j] * arr2[j][k]
                }
            }

            answer.add(arr)

        }
        return answer

        
    }
}