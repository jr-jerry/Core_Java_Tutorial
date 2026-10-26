package Project;


import java.io.Serializable;
import java.util.List;
import java.util.Stack;

public class AnotherClass {
    static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        while(!stack.isEmpty()){
            System.out.println("At the top of stack"+stack.peek());
            stack.pop();
            System.out.println("After pop operation");
        }

    }
}
