import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        //연속적으로 나타나는 숫자는 하나만 남기고 전부 제거 단,제거된 후 남은 수들을 반환 할때는 순서를 유지
        for (int i = arr.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) {
                stack.add(arr[i]);
            } else {
                if (stack.peek() != arr[i]) {
                    stack.add(arr[i]);
                }
            }
        }

        int[] answer = new int[stack.size()];

        int index = 0;
        while (!stack.isEmpty()) {
            answer[index++] = stack.pop();
        }

        return answer;
    }
}