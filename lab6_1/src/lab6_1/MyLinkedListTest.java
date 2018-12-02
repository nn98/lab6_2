package lab6_1;

public class MyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList list=new MyLinkedList();
		System.out.println("lab6_1: ±Ë¿±º≠\n");
		System.out.println("list = "+list.toString());
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		System.out.println("list = "+list.toString());
	}

}
