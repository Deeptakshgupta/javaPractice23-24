package LinkedListPractice;

public class ReverseLLinKchunks {

	static Node reverseKNodes(Node head, int k)
	{
		if(head == null || head.next == null)
				return head;
		int length = lengthofList(head);
		
		Node dummyHead = new Node(0);
		dummyHead.next = head;
		Node pre = dummyHead, nex, curr ;
		
		while( length >= k)
		{
			curr = pre.next;// i=0 
			nex = curr.next;
			
			for( int i =1; i<k ; i++)
			{
				// reference from reversing LL helps
				curr.next = nex.next; // saving the next refrence
				nex.next = pre.next;
				pre.next = nex;
				nex = curr.next;
				
				
			}
			pre = curr;
			length -= k;
					
		}
			
		return dummyHead.next;
		
	}
	static int lengthofList(Node head)
	{
		int length =0;
		while(head!= null)
		{
			length ++;
			head = head.next;
		}
		return length ;
	}
}
