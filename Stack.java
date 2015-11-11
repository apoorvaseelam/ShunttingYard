package week2;

public class Stack 
{
	Object[] stack_array = null;
    int top;

    Stack(int size)
    {
    	stack_array = new Object[size]; 
        top = -1;
    }

    public boolean full()
    {
        if (top == (stack_array.length - 1))
            return (true);
        else
            return (false);
    }

    public boolean empty()
    {
        if (top == -1)
            return (true);
        else
            return (false);
    }

    public void push(Object item)
    {
        top = top + 1;
        stack_array[top] = item;
        //System.out.println();
        //System.out.println(item + " pushed.");
    }

    public Object pop()
    {
        //System.out.println("\nThe popped item is: " + stack_array[top]);
    	Object temp = stack_array[top--];        
        return temp;
    }
    public Object peek()
    {
    	return stack_array[top];
    }

}
