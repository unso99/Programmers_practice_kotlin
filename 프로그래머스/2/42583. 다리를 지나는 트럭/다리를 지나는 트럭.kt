import java.util.*

class Solution {
    fun solution(bridge_length: Int, weight: Int, truck_weights: IntArray): Int {
        var answer = 1
        var truckIndex = 0
        var weightSUm = truck_weights[0]
        val bridge = LinkedList<IntArray>()

        bridge.offer(intArrayOf(truck_weights[truckIndex], 1))

        while (bridge.isNotEmpty()) {
            if (bridge[0][1] == bridge_length) {
                val first = bridge.removeFirst()
                weightSUm -= first[0]
            }

            for (i in bridge.indices) {
                bridge[i][1]++
            }

            if (truckIndex + 1 < truck_weights.size && bridge.size + 1 <= bridge_length && weightSUm + truck_weights[truckIndex + 1] <= weight) {
                truckIndex++
                weightSUm += truck_weights[truckIndex]
                bridge.add(intArrayOf(truck_weights[truckIndex], 1))
            }
            answer++
        }

        return answer
    }
}