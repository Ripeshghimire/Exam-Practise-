class node{
    int data;
    node next;
    node(int data){
        this.data = data;
        this .next = null;
    }
}
class LinkedList{
    int size;
    node head;
    node tail;
    LinkedList(){
        this.size= 0;
        this.head = null;
        this.tail = null;
    }
    public void addfirst(int data){
        node newnode = new node(data);
        newnode.next = head;
        head = newnode;
        if(size == 0){
            head = tail = newnode;
        }
        size++;
    }
    public void addlast(int data){
        node newnode = new node( data);
        newnode.next = null;
        if(size == 0){
            head = tail = newnode;
        }else{
            tail.next = newnode;
            tail = newnode;
        }
        size++;
    }
    public void addspecified(int position,int data){
        node newnode = new node(data);
        node temp = head;
        for(int i = 0;i<position-1;i++){
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        size++;
    }
    public void deletefirst(){
        if(size == 0){
            System.out.println("no items to delete in a list ");
        }else if (size==1){
            head = tail = null;
        }
        head.next = head;
        size--;
    }
    public void deletelast(){
        if(size == 0){
            System.out.println("no items to delete in a list ");
        }else if (size==1){
            head = tail = null;
        }
        node temp = head;
        for(int i = 0 ; i<=size-1;i++){
            temp = temp.next;
        }
         temp = tail;
        temp.next = null;
        size--;
    }
    public void deletespecified(int position){
        if (position<0 || position>=size){
            System.out.println("invalid arguments");
        }
        else if(position==0){
            deletefirst();
        }
        else if(position == size-1){
            deletelast();    }
        else{
            node temp = head;
            for(int i = 0 ; i<position-1;i++)
            {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            size--;
        }
    }
   
}