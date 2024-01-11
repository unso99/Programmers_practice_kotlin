class Solution {
    fun solution(numbers: IntArray): String {
        var answer : String

        val arr = numbers.map { it.toString() }
            .sortedWith(Comparator { o1, o2 ->
                val a = o1 + o2
                val b = o2 + o1
                return@Comparator b.compareTo(a)
            })

        answer = arr.joinToString("")
        if(answer[0] == '0') answer = answer.toInt().toString()
        return answer
    }
}