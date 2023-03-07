package udemy_datastructures_second;



class CreateQueue {
	  static final int MAX = 100;
	  int front;
	  int rear;
	  //assigning MAX size of the queue
	  int queue[] = new int[MAX];

	  CreateQueue() {
	    front = -1;
	    rear = -1;
	  }

	  // create a method to check whether 
	  // the queue is empty or not  
	  void isEmpty() {
	    if(rear == front) {
	      System.out.println("Queue is empty.");
	    } else {
	      System.out.println("Queue is not empty.");
	    }
	  }

	  //create a method to return size of the queue 
	  int size() {
	    return (rear - front);
	  } 

	  //create a method to add new element       
	  void EnQueue(int x){
	    if(rear == (MAX - 1)){
	      System.out.println("Queue size limit reached.");
	    } else {
	      queue[++rear] = x;
	      System.out.println(x + " is added into the queue.");
	    }
	  }

	  //create a method to delete front element       
	  void DeQueue(){
	    if(rear == front){
	      System.out.println("Queue is empty.");
	    } else {
	      int x = queue[++front];
	      System.out.println(x + " is deleted from the queue.");
	    }
	  }  

	  //create a method to get front element       
	  int frontElement() {
	    if(rear == front) {
	      System.out.println("Queue is empty.");
	      return 0;
	    } else {
	      return queue[front+1];
	    }
	  }

	  //create a method to get rear element       
	  int rearElement() {
	    if(rear == front) {
	      System.out.println("Queue is empty.");
	      return 0;
	    } else {
	      return queue[rear];
	    }
	  }
	

	// test the code
	
	  public static void main(String[] args) {
	    CreateQueue MyQueue = new CreateQueue();
	    MyQueue.EnQueue(10);
	    MyQueue.EnQueue(20);
	    MyQueue.EnQueue(30);
	    MyQueue.EnQueue(40);

	    MyQueue.DeQueue();
	    MyQueue.isEmpty(); 
	  }}
	
