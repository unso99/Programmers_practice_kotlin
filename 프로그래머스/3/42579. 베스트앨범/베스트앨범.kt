import java.util.LinkedList

class Solution {
    fun solution(genres: Array<String>, plays: IntArray): IntArray {
        val answer = mutableListOf<Int>()
        //장르의 map을 만들어서 총플레이수가 높은 것을 획득
        val genresMap = mutableMapOf<String,Int>()
        val songs = mutableListOf<Song>()
        for(i in genres.indices){
            genresMap[genres[i]] = genresMap.getOrDefault(genres[i],0) + plays[i]
            songs.add(Song(i,genres[i],plays[i]))
        }

        val entries = LinkedList(genresMap.entries)
        entries.sortByDescending { it.value }

        val sortedGenresMap = LinkedHashMap<String, Int>()
        for(entry in entries){
            sortedGenresMap[entry.key] = entry.value
        }
        //노래중에서 높은 장르에서 부터 그다음 플레이횟수 순으로 정렬 해준다

        for(item in sortedGenresMap){
            val list = mutableListOf<Song>()
            for(i in songs.indices){
                if(songs[i].genre == item.key) {
                    list.add(songs[i])
                }
            }

            //나왔으면 list를 play순으로 정렬
            list.sortByDescending { it.play }
            list.forEachIndexed { index, song ->
                if(index <= 1) {
                    answer.add(song.num)    
                }
            } 
        }
        return answer.toIntArray()
    }

    data class Song(val num : Int, val genre : String, val play : Int)
}