import Stack.Stack;
import org.junit.Assert;

import java.util.EmptyStackException;

public class Test {
    @org.junit.Test
    public void testCreate() {

        Stack<Integer> stack= new Stack<Integer>();
        Assert.assertNotNull(stack);
        Assert.assertTrue(stack.empty());
    }
    @org.junit.Test
    public void testPush() {

        Stack<Integer> stack= new Stack<Integer>();
        stack.push(2);
        Assert.assertFalse(stack.empty());
    }
    @org.junit.Test
    public void testPop() {

        Stack<Integer> stack= new Stack<Integer>();
        stack.push(2);
        stack.pop();
        Assert.assertTrue(stack.empty());
    }

    @org.junit.Test
    public void testPeekMin() {

        Stack<Integer> stack= new Stack<Integer>();
        stack.push(2);
        stack.push(-1);
        stack.push(4);
        Assert.assertEquals(stack.peekMin().intValue(),-1);
    }

    @org.junit.Test
    public void testPeekMinAfterPush() {

        Stack<Integer> stack= new Stack<Integer>();
        stack.push(2);
        stack.push(-1);
        stack.push(4);
        stack.push(-3);
        Assert.assertEquals(stack.peekMin().intValue(),-3);
    }

    @org.junit.Test
    public void testPeekMinAfterPop() {

        Stack<Integer> stack= new Stack<Integer>();
        stack.push(2);
        stack.push(-1);
        stack.push(4);
        stack.pop();
        stack.pop();
        Assert.assertEquals(stack.peekMin().intValue(),2);
    }

    @org.junit.Test(expected = EmptyStackException.class)
    public void testPopEmptyStack() {

        Stack<Integer> stack= new Stack<Integer>();
        stack.pop();

    }

    @org.junit.Test(expected = EmptyStackException.class)
    public void testPeekMinEmptyStack() {

        Stack<Integer> stack= new Stack<Integer>();
        stack.peekMin();

    }

    @org.junit.Test(expected = EmptyStackException.class)
    public void testPeekMinEmptyStackAfterPop() {

        Stack<Integer> stack= new Stack<Integer>();
        stack.push(4);
        stack.pop();
        stack.peekMin();

    }
}
