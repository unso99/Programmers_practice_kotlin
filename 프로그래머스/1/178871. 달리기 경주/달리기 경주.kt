class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        val map = mutableMapOf<String,Int>()
        
        players.forEachIndexed { index, s ->
            map[s] = index
        }
        for(i in 0 until callings.size){
            //해설위원이 부른 사람의 등수
            val rank = map[callings[i]]
            
            if(rank == 0) continue
            else {
                //데이터 저장을 위한 temp
                val temp = players[rank!!]
                map[temp] = rank - 1
                players[rank] = players[rank - 1]
                map[players[rank]] = rank
                players[rank - 1] = temp
            }
        }
        
        return players
    }
}