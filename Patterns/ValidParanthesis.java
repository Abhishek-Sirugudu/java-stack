package Stack.Patterns;
import java.util.Stack;

public class ValidParanthesis {
    public static boolean checkValid(String s){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '['){
                stack.push(c);
            }else{
                if(stack.isEmpty()){
                    return false;
                }if(isPair(c,stack.peek())){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean isPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
    public static void main(String[] args) {
        String s = "{[([[]])[]]}";
        System.out.println(checkValid(s));
    }
}
