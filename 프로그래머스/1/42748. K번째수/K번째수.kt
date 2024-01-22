class Solution {
    fun solution(array: IntArray, commands: Array<IntArray>): IntArray {
        var answer = IntArray(commands.size)

        commands.forEachIndexed { index, it ->
            val arr = array.copyOfRange(it[0]-1,it[1]).sorted()
            answer[index] = arr[it[2] -1]
        }
        return answer
    }
}