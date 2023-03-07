package udemy_datastructures_second;


//reference is blue tree code


 public class CircularLinkedListRef {

	static Node last;
	class Node{
		
		int data;
		Node next;
		
		public Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	 CircularLinkedListRef(Node last){
		this.last=last;
		if(this.last!=null){
			this.last.next=last;
		}
	 }
	
	 public void addToEnd(int data){
		 Node newnode=new Node(data);
		 
		 if(last==null){
			 newnode.next=newnode;
		 }
		 else{
			 newnode.next=last.next;
			 last.next=newnode;
		 }
		 last=newnode;
	 }
	 public void addToStart(int data){
		 Node newnode=new Node(data);
		 if(last==null){
			 newnode.next=newnode;
			 last=newnode;
		 }
		 else{
			 newnode.next=last.next;
			 last.next=newnode;
		 }
	 }
	 
	 public void addAfter(int insertAfter,int data){
		 
		 if(last!=null){
			 Node curr=last;
			 do{
				 if(curr.data==insertAfter){
					 Node newnode=new Node(data);
					 newnode.next=curr.next;
					 curr.next=newnode;
					 break;
					 }
				 curr=curr.next;
			 }while(curr!=last);
		 }
		 
	 }
	 
	 public Node deleteLast(){
		Node toDelete=last;
		if(last==null||last.next==last){ //not so imp just chcking if empty and last.next=null never possible
			last=null;
			return toDelete;
		}
		Node prev=last.next;  //practically the first element
		while(prev.next!=last){
			prev=prev.next;
		}        //traversing till the prev element of last
		prev.next=last.next; //keeping next of last to prev
		last=prev; //assigning last to next
		return toDelete;
		 
	 }
	 public Node deleteStart(){
		 Node toDelete=last;
		 if(last==null||last.next==last){ //not so imp just chcking if empty and last.next=null never possible
				last=null;
				return toDelete;
			}
		 toDelete=last.next;  //we know last.next is first element
		 last.next=toDelete.next;
		 return toDelete;
	 }
	 public Node deleteAfter(int data){
		 if(last==null)
			 return null;
		 Node toDelete=null;
		 Node curr=last;
	    do{
	    	if(curr.data==data){
	    		toDelete=curr.next; //assigning next element of curr as toDelete
	    	
	    	if(curr.next==curr){  //this means only one node 
	    		last=null;
	    	}
	    	else{
	    		curr.next=toDelete.next;
	    		if(toDelete==last)
	    			last=curr;
	    	}
	    	break;
	    }
		curr=curr.next;
		 }while(curr!=last);
		 return toDelete;
}
	 
	 public static void main(String args[]){
		 CircularLinkedListRef cll=new CircularLinkedListRef(last);
		 cll.addToStart(30);
	 }
 }
