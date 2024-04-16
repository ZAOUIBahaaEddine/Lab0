package EXO2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.EXO2.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class StackTest {


    private Stack stack;

    @BeforeEach
    void setUp (){
        stack = new Stack();

    }

    @Test
    public void pushTestUsingPeek() {
        stack.push(2016);
        assertEquals(2016, stack.peek());
    }

    @Test
    void push_whenStackIsFull_expandsArray() {
        for (int i = 0; i < stack.array.length; i++) {
            stack.push(i);
        }
        assertEquals(stack.array.length * 2, stack.top + 1);
    }


    @Test
    public void popTest ()
    {
        stack.push (1);
        stack.push (2);
        stack.push (3);
        stack.push (4);
        assertEquals(4, stack.pop());
    }

    @Test
    public void PopWithCheckingSizeTest() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int popped = stack.pop();

        Assertions.assertEquals(3, popped);
        Assertions.assertEquals(2, stack.size());
        Assertions.assertFalse(stack.isEmpty());
    }




    @Test
    public void peekTest ()
    {
        stack.push (1);
        stack.push (2);
        stack.push (3);
        stack.push (4);
        assertEquals(4, stack.peek());
    }
    

    @Test
    public void isEmpty_whenStackIsEmpty_thenReturnTrue() {
        Stack stack = new Stack();
        boolean isEmpty = stack.isEmpty();
        Assertions.assertTrue(isEmpty);
    }

    @Test
    public void isEmpty_whenStackIsNotEmpty_thenReturnFalse() {
        Stack stack = new Stack();
        stack.push(1);
        boolean isEmpty = stack.isEmpty();
        Assertions.assertFalse(isEmpty);
    }

    @Test
    public void sizeOfEmptyStackTest ()
    {
        assertEquals(0, stack.size());
    }


    @Test
    public void sizeOfNotEmptyStackTest ()
    {
        stack.push (1);
        assertEquals(1, stack.size());
    }

    @Test
    public void sizeOfStackWith11ElementsTest ()
    {
        stack.push (1);
        stack.push (2);
        stack.push (3);
        stack.push (4);
        stack.push (5);
        stack.push (6);
        stack.push (7);
        stack.push (8);
        stack.push (9);
        stack.push (10);
        stack.push (11);
        assertEquals(11, stack.size());
    }

    @Test
    void expandArrayFullTest() {

        Stack stack = new Stack();
        stack.push (1);
        stack.push (2);
        stack.push (3);
        stack.push (4);

        int[] originalArray = stack.array;
        int originalSize = stack.array.length;
        int originalTop = stack.top;

        stack.expandArray();

        assertNotSame(originalArray, stack.array);
        assertEquals(originalSize * 2, stack.array.length);
        assertEquals(originalTop, stack.top);
        for (int i = 0; i <= originalTop; i++) {
            assertEquals(originalArray[i], stack.array[i]);
        }
    }


}
