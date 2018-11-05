package doubts;

import java.util.LinkedList;
public class Stack {

    private LinkedList<Integer> list;
    private static boolean isChanged;
    private static int inf = Integer.MAX_VALUE;
    
    public Stack() {
    	list = new LinkedList<>();
    }
    
    public void push(Integer value) {
    	list.addFirst(value);
    }
    
    public Integer pop() {
    	return list.remove(0);
    }
    
    public Boolean isEmpty() {
    	return list.size() == 0;
    }
    
    public Integer top() {
    	if (list.isEmpty())
    		return null;
    	return list.get(0);
    }
    
    public static Integer iterFix(int fromTop, Stack stack) {
    	if (stack.isEmpty())
    		return fromTop;
    	
    	int element, kept, toReturn;
    	int original = stack.pop();
    	
    	if (original > fromTop){
    		element = iterFix(original, stack);
    		kept = fromTop;
    	} else {
    		element = iterFix(fromTop, stack);
    		kept = original;
    	}
    	
    	if (element < kept){
    		stack.push(kept);
    		toReturn = element;
    		element = kept;
    	} else {
    		stack.push(element);
    		toReturn = kept;
    	}
    	
    	if (element != original)
    		isChanged = true;
    	
    	return toReturn;
    }
    
    public static void sort(Stack stack) {
    	isChanged = false;
    	iterFix(-inf, stack);
    	if (isChanged)
    		sort(stack);
    }
    
    public void print(){
    	for (int v: list)
    		System.out.println(v);
    }
    
    public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push(5);
		stack.push(7);
		stack.push(9);
		stack.push(1);
		stack.push(3);
		stack.push(6);
		stack.push(2);
		sort(stack);
		while (!stack.isEmpty())
			System.out.println(stack.pop());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		stack.push(7);
		sort(stack);
		while (!stack.isEmpty())
			System.out.println(stack.pop());
		stack.push(2);
		stack.push(5);
		stack.push(12);
		stack.push(30);
		stack.push(55);
		stack.push(68);
		stack.push(8);
		sort(stack);
		while (!stack.isEmpty())
			System.out.println(stack.pop());
	}

}