package udemy_datastructures_second;

public class DoubleLinkedListPrac {

	Node1 head;
	
	class Node1{
		
		int data;
		Node1 next=null;
		Node1 prev=null;
		
	}
	
	public void add(int data){
	
		Node1 newNode=new Node1();
		newNode.data=data;
		newNode.next=null;
		newNode.prev=null;
		if(head==null){
			head=newNode;
		}
		else{
			Node1 node=head;
			while(node.next!=null){
				node=node.next;
			}
			node.next=newNode;
			newNode.prev=node;
		}
}
	public void addAt(int index,int data){
		
		Node1 newNode=new Node1();
		newNode.data=data;
		newNode.next=null;
		newNode.prev=null;
		
		Node1 node =head;
		for(int i=0;i<index-1;i++){
			node=node.next;
		}
		newNode.next=node.next;
		node.next=newNode;
		newNode.prev=node;
	}
	
	public void deleteStart(){
		
		head=head.next;
		head.prev=null;
		
	}
	public void deleteAt(int index){
		
		Node1 node=head;
		Node1 n1=null;
		for(int i=0;i<index-1;i++){
		 node=node.next;	
		}
		n1=node.next;
		node.next=n1.next;
		node.prev=n1.prev;
		}
	public void deleteLast(){
		Node1 node=head;
		Node1 n1=null;
		while(node.next.next!=null){ //traversing to second last node
			node=node.next;
		}
		
		n1=node.next;
		node.next=n1.next;
		//node=n1;
	}
	
	public void display(){
		
		Node1 node=head;
		
		System.out.println("the elements are");
		while(node.next!=null){
			System.out.println(node.data);
			node=node.next;
			
		}
		System.out.println(node.data);
	}
	public static void main(String args[]){
		DoubleLinkedListPrac dll=new DoubleLinkedListPrac();
		dll.add(10);
		dll.add(20);
		dll.add(30);
		dll.addAt(2, 40);
		dll.deleteAt(2);
		dll.deleteLast();
		dll.display();
	}
}