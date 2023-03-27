public class Stack {
    int top;
    int data[];
    int capacity;
    public Stack(int size){
        data = new int[size];
        top = -1;
    }

    public void push (int val){
        System.out.println("inserting element"+val);
        data[++top] = val;
    }
    public int pop(){
        return data[top--];
    }
     // check if the stack is empty
  public Boolean isEmpty() {
    return top == -1;
  }

  // check if the stack is full
  public Boolean isFull() {
    return top == capacity - 1;
  }
}
