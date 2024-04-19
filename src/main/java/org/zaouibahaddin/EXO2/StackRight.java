package org.zaouibahaddin.EXO2;

public class StackRight {
    public static final int INITIAL_CAPACITY = 10;
    public int[] array;
    public int top;

    public StackRight() {
        array = new int[INITIAL_CAPACITY];
        top = -1;
    }
    public void push(int element) {
        if (top == array.length - 1) {
            expandArray();
        }
        array[++top] = element;
    }
    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top--];
    }
    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return array[top];
    }
    public boolean isEmpty() {
        return top == -1;
    }


    public int size() {
        return top + 1;
    }
    public void expandArray() {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }





}