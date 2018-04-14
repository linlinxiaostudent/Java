package niuke;

import java.util.Stack;

public class QueueImplmentByStatck {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
    	int first = stack2.pop();
    	while(!stack2.isEmpty()){
    		stack1.push(stack2.pop());
    	}
    	return first;
    
    }
    public static void main(String[] args) {
    	QueueImplmentByStatck queueImplmentByStatck = new QueueImplmentByStatck();
    	queueImplmentByStatck.push(1);
    	queueImplmentByStatck.push(2);
    	queueImplmentByStatck.push(3);
    	queueImplmentByStatck.push(4);
    	System.out.println(queueImplmentByStatck.pop());
    	System.out.println(queueImplmentByStatck.pop());
    	queueImplmentByStatck.push(5);
    	System.out.println(queueImplmentByStatck.pop());


    	
	}

}
