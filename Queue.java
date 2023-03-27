class qu{
    int rear, front;
    int data[];
    public qu(){
        rear = -1;
        front = 0;
        data = new int[10];
    }
    public void insert(int a){
        if(rear <10){
            ++rear;
            data[rear] = a;
        }
    }
    public void remove(){
        if(rear == -1){
            System.out.println("Removed: "+data[front]);
            ++front;
        }
    }
}