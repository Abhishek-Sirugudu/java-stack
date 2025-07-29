package Stack.Patterns;
import java.util.ArrayList;
import java.util.Stack;
public class NearestGreaterElement {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4};

        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i = arr.length-1;i >= 0; i-- ){
            if(stack.size() == 0){
                ans.add(-1);
            }else if(stack.peek() > arr[i]){
                ans.add(stack.peek());
            }else{
                while(stack.size() > 0 && stack.peek() <= arr[i]){
                    stack.pop();
                }
                if(stack.size() == 0){
                    ans.add(-1);
                }else{
                    ans.add(stack.peek());
                }
            }
            stack.push(arr[i]);
        }

        // Reverse the answer to match the original array order
        for(int i = ans.size()-1; i >= 0; i--){
            System.out.print(ans.get(i)+" ");
        }
    }
}
