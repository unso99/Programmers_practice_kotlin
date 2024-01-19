import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++){
            priorityQueue.offer(scoville[i]);
        }
        
        if(priorityQueue.peek() >= K) return answer;
        
        while(!priorityQueue.isEmpty()){
            answer++;
            int first = priorityQueue.poll();
            int second = priorityQueue.poll();

            int num = first + second * 2;

            priorityQueue.offer(num);

            if(priorityQueue.peek() >= K) {
                break;
            }else{
                if(priorityQueue.size() == 1) {
                    return -1;
                }
            }
        }
        return answer;
    }
}