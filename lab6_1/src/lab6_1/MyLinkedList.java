package lab6_1;

public class MyLinkedList {
	public class Node{
		int data;
		Node link=null;;
		public Node(int data) {
			this.data=data;
		}
	}
	private Node head=null;
	public void addFirst(int data) {
		Node n=new Node(data);
		n.link=head;
		head=n;
	}
	@Override
	public String toString() {
		String s="";
		Node n=head;
		while(n!=null) {
			s=s+Integer.toString(n.data)+" ";
			n=n.link;
		}
		return s;
	}
}
