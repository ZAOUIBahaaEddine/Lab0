package EXO2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zaouibahaddin.EXO2.StackRight;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class StackRightTest {


    private StackRight stackRight;

    @BeforeEach
    void setUp (){
        stackRight = new StackRight();

    }

    @Test
    public void pushTestUsingPeek() {
        stackRight.push(2016);
        assertEquals(2016, stackRight.peek());
    }

    @Test
    void push_whenStackIsFull_expandsArray() {
        // Fill the stack to its initial capacity
        for (int i = 0; i < 10; i++) {
            stackRight.push(i);
        }
        // Push one more element, which should trigger array expansion
        stackRight.push(10);

        // Check that the top index is equal to the new array length - 1
        assertEquals(stackRight.INITIAL_CAPACITY * 2, stackRight.size());
    }

    @Test
    public void popTest ()
    {
        stackRight.push (1);
        stackRight.push (2);
        stackRight.push (3);
        stackRight.push (4);
        assertEquals(4, stackRight.pop());
    }

    @Test
    public void PopWithCheckingSizeTest() {
        StackRight stackRight = new StackRight();
        stackRight.push(1);
        stackRight.push(2);
        stackRight.push(3);

        int popped = stackRight.pop();

        Assertions.assertEquals(3, popped);
        Assertions.assertEquals(2, stackRight.size());
        Assertions.assertFalse(stackRight.isEmpty());
    }




    @Test
    public void peekTest ()
    {
        stackRight.push (1);
        stackRight.push (2);
        stackRight.push (3);
        stackRight.push (4);
        assertEquals(4, stackRight.peek());
    }
    

    @Test
    public void isEmpty_whenStackIsEmpty_thenReturnTrue() {
        StackRight stackRight = new StackRight();
        boolean isEmpty = stackRight.isEmpty();
        Assertions.assertTrue(isEmpty);
    }

    @Test
    public void isEmpty_whenStackIsNotEmpty_thenReturnFalse() {
        StackRight stackRight = new StackRight();
        stackRight.push(1);
        boolean isEmpty = stackRight.isEmpty();
        Assertions.assertFalse(isEmpty);
    }

    @Test
    public void sizeOfEmptyStackTest ()
    {
        assertEquals(0, stackRight.size());
    }


    @Test
    public void sizeOfNotEmptyStackTest ()
    {
        stackRight.push (1);
        assertEquals(1, stackRight.size());
    }

    @Test
    public void sizeOfStackWith11ElementsTest ()
    {
        stackRight.push (1);
        stackRight.push (2);
        stackRight.push (3);
        stackRight.push (4);
        stackRight.push (5);
        stackRight.push (6);
        stackRight.push (7);
        stackRight.push (8);
        stackRight.push (9);
        stackRight.push (10);
        stackRight.push (11);
        assertEquals(11, stackRight.size());
    }

    @Test
    void expandArrayFullTest() {

        StackRight stackRight = new StackRight();
        stackRight.push (1);
        stackRight.push (2);
        stackRight.push (3);
        stackRight.push (4);

        int[] originalArray = stackRight.array;
        int originalSize = stackRight.array.length;
        int originalTop = stackRight.top;

        stackRight.expandArray();

        assertNotSame(originalArray, stackRight.array);
        assertEquals(originalSize * 2, stackRight.array.length);
        assertEquals(originalTop, stackRight.top);
        for (int i = 0; i <= originalTop; i++) {
            assertEquals(originalArray[i], stackRight.array[i]);
        }
    }


}
