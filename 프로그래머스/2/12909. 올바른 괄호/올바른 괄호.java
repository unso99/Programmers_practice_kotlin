import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        //stack을 활용하여 '('은 push 해주고 stack 안에 '('이 있고 ')'이 들어올 차레면 pop
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty()) {
                stack.add(s.charAt(i));
            }else {
                if(s.charAt(i) == '(') {
                    stack.push('(');
                }else {
                    if(stack.pop() != '(') {
                        return false;
                    }
                }
            }
        }
        
        if(!stack.isEmpty()) answer = false;
        //근데 아니라면 false

        return answer;
    }
}